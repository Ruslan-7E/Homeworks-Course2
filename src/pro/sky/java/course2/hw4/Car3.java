package pro.sky.java.course2.hw4;

import java.time.LocalDate;
import java.util.Objects;

public class Car3 extends Transport {
    private final double engineVolume;
    private final String transmissionType;
    private final String carcassType;
    private String registrationNumber;
    private final Integer seatAmount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;
    private String fuelType;

    @Override
    protected void refill() {
        System.out.println("Fuel type for Car: " + getBrand() + " - " + getFuelType());
    }

    public Car3(String brand,
                String model,
                int productionYear,
                String productionCountry,
                String carcassColor,
                int maxSpeed,
                double engineVolume,
                String transmissionType,
                String carcassType,
                String registrationNumber,
                Integer seatAmount,
                boolean summerTyres,
                Key key,
                Insurance insurance,
                String fuelType) {
        super(brand,
                model,
                productionYear,
                productionCountry,
                carcassColor,
                maxSpeed,
                fuelType);


        this.engineVolume = engineVolume;
        this.transmissionType = transmissionType;
        this.carcassType = carcassType;
        this.seatAmount = seatAmount;

        setRegistrationNumber(registrationNumber);
        setSummerTyres(summerTyres);
        setKey(key);
        setInsurance(insurance);
        setFuelType(fuelType);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getCarcassType() {
        return carcassType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getSeatAmount() {
        return seatAmount;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isCorrectRegNum() {
        // x000xx000
        if (registrationNumber.length() != 9) {
            return false;
        }

        char[] chars = registrationNumber.toCharArray();

        if (!Character.isAlphabetic(chars[0])
                || !Character.isAlphabetic(chars[4])
                || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1])
                && Character.isDigit(chars[2])
                && Character.isDigit(chars[3])
                && Character.isDigit(chars[6])
                && Character.isDigit(chars[7])
                && Character.isDigit(chars[8]);
    }


    public static void printFullInfo(Car3 car) {
        System.out.println("Brand: " + car.getBrand() + "\n"
                + "Model: " + car.getModel() + "\n"
                + "Transmission type: " + car.getTransmissionType() + "\n"
                + "Carcass type: " + car.getCarcassType() + "\n"
                + "Reg. num.: " + car.getRegistrationNumber() + "\n"
                + "Seat amount: " + car.getSeatAmount() + "\n"
                + "" + (car.isSummerTyres() ? "Summer" : "Winter") + " Tyres" + "\n"
                + "" + (car.getKey().isWithoutKeyAccess() ? "without key access" : "key access") + "\n"
                + "" + (car.getKey().isRemoteStartEngine() ? "remote start" : "default start") + "\n"
                + "Insurance number: " + car.getInsurance().getNumber() + "\n"
                + "Insurance cost: " + car.getInsurance().getCost() + "\n"
                + "Insurance expire date: " + car.getInsurance().getExpireDate() + "\n"
                + "Fuel type: " + car.getFuelType()
        );
    }

    public static class Key {

        private final boolean remoteStartEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteStartEngine, boolean withoutKeyAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {

        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            this.cost = cost;

            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }



        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}
