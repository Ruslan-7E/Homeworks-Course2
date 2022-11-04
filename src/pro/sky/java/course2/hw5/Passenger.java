package pro.sky.java.course2.hw5;

import java.util.Arrays;

public class Passenger extends Auto implements Competing, Racing {

    public enum PassengerCarcass {
        SEDAN("This is sedan."),
        HATCHBACK(""),
        COUPE("This is a coupe."),
        UNIVERSAL(null),
        SUV("This is a SUV."),
        CROSSOVER(""),
        PICKUP(null),
        VAN("This is a van."),
        MINIVAN("");

        private String passengerType;

        PassengerCarcass(String passengerType) {
            if (passengerType == null || passengerType.isBlank()) {
                this.passengerType = "No Data.";
            } else {
                this.passengerType = passengerType;
            }
        }

        public String getPassengerType() {
            return passengerType;
        }

        public void setPassengerType(String passengerType) {
            this.passengerType = passengerType;
        }
    }

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
    public void getAutoType() {
        System.out.println(getBrand() + ", "
                + getModel() + ", "
                + Arrays.toString(new PassengerCarcass[]{PassengerCarcass.COUPE}));
    }

    @Override
    public boolean autoService() {
        return Math.random() > 0.7;
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
