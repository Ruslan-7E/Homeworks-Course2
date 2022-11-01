package pro.sky.java.course2.hw5;

public class Bus extends Auto implements Competing, Racing {

    public enum PassengerCapacity {
        VERY_SMALL(0),
        SMALL(20),
        MEDIUM(45),
        BIG(70),
        VERY_BIG(110);

        private final int capacity;

        PassengerCapacity(int capacity) {
            if (capacity <= 0) {
                this.capacity = 2;
            } else {
                this.capacity = capacity;
            }
        }

        public int getCapacity() {
            return capacity;
        }
    }

    // VERY_SMALL(up to 10 seats),
    // SMALL(up to 25 seats),
    // MEDIUM(40-50 seats),
    // BIG(60-80 seats),
    // VERY_BIG(100-120 seats)

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
    public void getAutoType() {
        System.out.println(getBrand() + ", "
                + getModel() + ", "
                + PassengerCapacity.MEDIUM.name());
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
