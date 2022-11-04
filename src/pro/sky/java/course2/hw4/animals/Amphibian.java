package pro.sky.java.course2.hw4.animals;

public class Amphibian extends Animal{
    protected Amphibian(String name, Integer age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats almost everything near the " + getHabitat());
    }

    @Override
    public void go() {
        System.out.println(getName() + " goes with different speed.");
    }

    public void hunt() {
        System.out.println(getName() + " usually hunts near the " + getHabitat());
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + ", " + getHabitat();
    }
}
