package pro.sky.java.course2.hw4;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String carcassColor;
    private short maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String carcassColor,
                     short maxSpeed)
    {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.carcassColor = carcassColor;
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

    public short getMaxSpeed() {
        return maxSpeed;
    }

    public void setCarcassColor(String carcassColor) {
        if (carcassColor == null || carcassColor.isEmpty()) {
            this.carcassColor = "Color is not defined!";
        } else {
            this.carcassColor = carcassColor;
        }
    }

    public void setMaxSpeed(short maxSpeed) {
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
