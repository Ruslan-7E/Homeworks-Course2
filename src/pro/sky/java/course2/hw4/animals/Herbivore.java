package pro.sky.java.course2.hw4.animals;

import java.util.Objects;

public class Herbivore extends Mammal{

    private String typeOfFood;

    protected Herbivore(String name, Integer age, String habitat, String typeOfFood) {
        super(name, age, habitat);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.equals("Meat")) {
            this.typeOfFood = "Not Defined.";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void graze() {
        System.out.println(getName() + " grazes near the " + getHabitat());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats almost all type of " + getTypeOfFood() + " near the " + getHabitat() );
    }

    @Override
    public void go() {
        System.out.println(getName() + " goes by legs near the " + getHabitat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + ", " + getHabitat() + ", " + getTypeOfFood();
    }
}
