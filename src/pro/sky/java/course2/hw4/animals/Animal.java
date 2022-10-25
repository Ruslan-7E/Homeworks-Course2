package pro.sky.java.course2.hw4.animals;

public abstract class Animal {
    private final String name;
    private final Integer age;
    private String habitat;

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
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
