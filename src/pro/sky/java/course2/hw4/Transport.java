package pro.sky.java.course2.hw4;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String carcassColor;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String carcassColor,
                     int maxSpeed)
    {
        this.brand = brand;
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
