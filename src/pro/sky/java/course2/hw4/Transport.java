package pro.sky.java.course2.hw4;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected final int productionYear;
    protected final String productionCountry;
    protected String carcassColor;
    protected int maxSpeed;
    protected final String fuelType;

    protected abstract void refill();
    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String carcassColor,
                     int maxSpeed, String fuel)
    {
        this.brand = brand;
        this.fuelType = fuel;
        if (model == null) {
            this.model = "Not defined";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        if (carcassColor == null) {
            this.carcassColor = "Not defined";
        } else {
            this.carcassColor = carcassColor;
        }
        this.maxSpeed = maxSpeed;
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getCarcassColor() {
        return carcassColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setCarcassColor(String carcassColor) {
        if (carcassColor == null || carcassColor.isEmpty()) {
            this.carcassColor = "Color is not defined!";
        } else {
            this.carcassColor = carcassColor;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = -1;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", carcassColor='" + carcassColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
