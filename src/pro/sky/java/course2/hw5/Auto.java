package pro.sky.java.course2.hw5;

public abstract class Auto {
    private String brand;
    private String model;
    private double engineVolume;

    public Auto(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = "Default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void startMove();

    public abstract void stopMove();

    @Override
    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineVolume();
    }
}
