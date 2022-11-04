package pro.sky.java.course2.hw4;

public class Bus extends Transport{

    @Override
    protected void refill() {
        System.out.println("Fuel type for Bus: " + getBrand() + " - " + getFuelType());
    }

    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String carcassColor,
               int maxSpeed,
               String fuelType) {
        super(brand,
                model,
                productionYear,
                productionCountry,
                carcassColor,
                maxSpeed,
                fuelType);
    }

    public static void printBusInfo(Bus bus) {
        System.out.println(bus.getBrand() + ", "
                + bus.getModel() + ", "
                + bus.getProductionYear() + ", "
                + bus.getProductionCountry() + ", "
                + bus.getCarcassColor() + ", "
                + bus.getMaxSpeed() + ", "
                + bus.getFuelType());
    }
}
