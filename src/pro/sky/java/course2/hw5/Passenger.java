package pro.sky.java.course2.hw5;

public class Passenger extends Auto implements Competing, Racing {


    public Passenger(String brand, String model, double engineVolume) {
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
        System.out.println(getBrand() + " refills by gasoline.");
    }

    @Override
    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineVolume();
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + ", " + getModel() + " has got a pit-stop.");
    }

    @Override
    public void bestTime() {
        System.out.println(getBrand() + ", " + getModel() + " best time is 1:03.");
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand() + ", " + getModel() + " max speed is 190 km/h.");
    }
}
