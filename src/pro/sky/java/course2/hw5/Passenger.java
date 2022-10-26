package pro.sky.java.course2.hw5;

public class Passenger extends Auto{


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
    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineVolume();
    }
}
