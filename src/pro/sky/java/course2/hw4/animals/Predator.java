package pro.sky.java.course2.hw4.animals;

public class Predator extends Mammal{

    private String typeOfFood;

    protected Predator(String name, Integer age, String habitat, String typeOfFood) {
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

    public void hunt() {
        System.out.println(getName() + " hunts near the " + getHabitat() + " and usually eats " + getTypeOfFood());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats almost all type of " + getTypeOfFood() + " near the " + getHabitat());
    }

    @Override
    public void go() {
        System.out.println(getName() + " goes by legs near the " + getHabitat());
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + ", " + getHabitat() + ", " + getTypeOfFood();
    }
}
