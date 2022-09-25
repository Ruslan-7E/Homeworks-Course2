package pro.sky.java.course2.hw2taskthree;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int yearOfAssembly;
    private String countryOfAssembly;

    public Car(String brand, String model, double engineVolume, String color, int yearOfAssembly, String countryOfAssembly) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.yearOfAssembly = yearOfAssembly;
        this.countryOfAssembly = countryOfAssembly;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfAssembly() {
        return yearOfAssembly;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }
}
