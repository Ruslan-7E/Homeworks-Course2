package pro.sky.java.course2.hw4.animals;

import java.util.Objects;

public class Flightless extends Bird{

    private String typeOfMoving;

    protected Flightless(String name, Integer age, String habitat, String typeOfMoving) {
        super(name, age, habitat);
        setTypeOfMoving(typeOfMoving);
    }

    public String getTypeOfMoving() {
        return typeOfMoving;
    }

    public void setTypeOfMoving(String typeOfMoving) {
        if (typeOfMoving == null || typeOfMoving.isBlank()) {
            this.typeOfMoving = "Not Defined.";
        } else {
            this.typeOfMoving = typeOfMoving;
        }
    }

    public void walk() {
        System.out.println(getName() + " likes walking near the " + getHabitat());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats almost any type of food near the " + getHabitat());
    }

    @Override
    public void go() {
        System.out.println(getName() + " goes by " + getTypeOfMoving() + " near the " + getHabitat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMoving, that.typeOfMoving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMoving);
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + ", " + getHabitat();
    }
}
