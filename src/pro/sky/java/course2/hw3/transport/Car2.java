package pro.sky.java.course2.hw3.transport;

import java.time.LocalDate;

public class Car2 {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int yearOfAssembly;
    private final String countryOfAssembly;
    private String transmissionType;
    private final String carcassType;
    private String registrationNumber;
    private final Integer seatAmount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    public Car2(String brand,
                String model,
                double engineVolume,
                String color,
                final int yearOfAssembly,
                String countryOfAssembly,
                String transmissionType,
                String carcassType,
                String registrationNumber,
                Integer seatAmount,
                boolean summerTyres,
                Key key,
                Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (yearOfAssembly == 0) {
            this.yearOfAssembly = 2000;
        } else {
            this.yearOfAssembly = yearOfAssembly;
        }

        if (countryOfAssembly == null) {
            this.countryOfAssembly = "default";
        } else {
            this.countryOfAssembly = countryOfAssembly;
        }

        if (transmissionType == null) {
            this.transmissionType = "МКПП";
        } else {
            this.transmissionType = transmissionType;
        }

        if (carcassType == null) {
            this.carcassType = "седан";
        } else {
            this.carcassType = carcassType;
        }

        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (seatAmount == null) {
            this.seatAmount = 2;
        } else {
            this.seatAmount = seatAmount;
        }

        this.summerTyres = summerTyres;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfAssembly() {
        return yearOfAssembly;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getCarcassType() {
        return carcassType;
    }

    public Integer getSeatAmount() {
        return seatAmount;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setTransmissionType(String transmissionType) {
        if (transmissionType == null) {
            this.transmissionType = "МКПП";
        } else {
            this.transmissionType = transmissionType;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }



    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public void setKey(Key key) {
        this.key = key;
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

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
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
