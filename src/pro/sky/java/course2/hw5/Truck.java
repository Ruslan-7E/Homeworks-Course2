package pro.sky.java.course2.hw5;

public class Truck extends Auto implements Competing, Racing {


    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println(getBrand() + " starts moving.");
    }

    @Override
    public void stopMove() {
        System.out.println(getBrand() + " stopped moving.");
    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " refills by the diesel");
    }

    @Override
    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineVolume();
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + ", " + getModel() + " hasn't got a pit-stop yet.");
    }

    @Override
    public void bestTime() {
        System.out.println(getBrand() + ", " + getModel() + " best time is 3:33.");
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand() + ", " + getModel() + " max speed is 75 km/h.");
    }
}
