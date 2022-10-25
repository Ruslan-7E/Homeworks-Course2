package pro.sky.java.course2.hw4.animals;

public class Bird extends Animal{

    protected Bird(String name, Integer age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats almost every type of insectors near the " + getHabitat());
    }

    @Override
    public void go() {
        System.out.println(getName() + " flies with different speed and on different height.");
    }

    public void hunt() {
        System.out.println(getName() + " usually hunts near the " + getHabitat());
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + ", " + getHabitat();
    }
}
