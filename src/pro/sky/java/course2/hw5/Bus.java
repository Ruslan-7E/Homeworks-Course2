package pro.sky.java.course2.hw5;

public class Bus extends Auto{


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
    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineVolume();
    }
}
