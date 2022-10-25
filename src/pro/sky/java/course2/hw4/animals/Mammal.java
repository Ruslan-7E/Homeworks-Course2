package pro.sky.java.course2.hw4.animals;

public class Mammal extends Animal{

    private Integer maxSpeed;

    protected Mammal(String name, Integer age, String habitat, Integer maxSpeed) {
        super(name, age, habitat);
        setMaxSpeed(maxSpeed);
    }

    public Mammal(String name, Integer age, String habitat) {
        super(name, age, habitat);
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed == null) {
            this.maxSpeed = 1;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats something.");
    }

    @Override
    public void go() {
        System.out.println(getName() + " goes by ground.");
    }

    public void walk() {
        System.out.println(getName() + " is walking.");
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + ", " + getHabitat() + ", " + getMaxSpeed();
    }
}
