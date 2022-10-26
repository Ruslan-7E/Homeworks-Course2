package pro.sky.java.course2.hw4.animals;

import java.util.Objects;

public abstract class Animal {
    protected final String name;
    protected final Integer age;
    protected String habitat;

    protected Animal(String name, Integer age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()) {
            this.habitat = "Not Defined!";
        } else {
            this.habitat = habitat;
        }
    }

    public abstract void eat();

    public abstract void go();

    public void sleep() {
        System.out.println(getName() + "Sleeps");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name)
                && Objects.equals(age, animal.age)
                && Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, habitat);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
