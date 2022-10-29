package pro.sky.java.course2.hw5;

public class Bus extends Auto implements Competing, Racing {


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("This " + getBrand() + " is too slow.");
    }

    @Override
    public void stopMove() {
        System.out.println("This " + getBrand() + " has just stopped.");
    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " refills by diesel.");
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
        System.out.println(getBrand() + ", " + getModel() + " best time is 2:43.");
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand() + ", " + getModel() + " max speed is 80 km/h.");
    }
}
