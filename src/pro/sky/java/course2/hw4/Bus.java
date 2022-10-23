package pro.sky.java.course2.hw4;

public class Bus extends Transport{
    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String carcassColor,
               int maxSpeed) {
        super(brand,
                model,
                productionYear,
                productionCountry,
                carcassColor,
                maxSpeed);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getProductionYear() {
        return super.getProductionYear();
    }

    @Override
    public String getProductionCountry() {
        return super.getProductionCountry();
    }

    @Override
    public String getCarcassColor() {
        return super.getCarcassColor();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setCarcassColor(String carcassColor) {
        super.setCarcassColor(carcassColor);
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
