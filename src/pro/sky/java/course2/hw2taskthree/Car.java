package pro.sky.java.course2.hw2taskthree;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int yearOfAssembly;
    private String countryOfAssembly;

    public Car(String brand, String model, double engineVolume, String color, int yearOfAssembly, String countryOfAssembly) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (yearOfAssembly == 0) {
            this.yearOfAssembly = 2000;
        } else {
            this.yearOfAssembly = yearOfAssembly;
        }

        if (countryOfAssembly == null) {
            this.countryOfAssembly = "default";
        } else {
            this.countryOfAssembly = countryOfAssembly;
        }
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
