package pro.sky.java.course2.hw3;

public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;

        if (isNullOrEmpty(flowerColor)) {
            flowerColor = "Белый";
        }
        this.flowerColor = flowerColor;

        if (isNullOrEmpty(country)) {
            country = "Россия";
        }
        this.country = country;

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
}
