package pro.sky.java.course2.hw3.transport;

import java.time.LocalDate;

public class CarService2 {
    public static void main(String[] args) {
        Car2 bentley = new Car2("Bentley",
                "Continental",
                5.0,
                "Silver",
                2015,
                "England",
                null,
                "Coupe",
                null,
                4,
                false,
                new Car2.Key(),
                new Car2.Insurance()
        );

        bentley.setSummerTyres(true);
        bentley.setInsurance(new Car2.Insurance(LocalDate.now(), 30_000D, "3124343"));
        bentley.getInsurance().checkExpireDate();
        bentley.getInsurance().checkNumber();

        Car2 maserati = new Car2("Maserati",
                "Quattroporte",
                3.5,
                "Blackmetal",
                0,
                "Italy",
                "automate",
                "Coupe",
                "e777kx777",
                4,
                false,
                new Car2.Key(),
                new Car2.Insurance()
        );

        maserati.setKey(new Car2.Key(true, true));

        maserati.setRegistrationNumber("b777og177");
        System.out.println(maserati.isCorrectRegNum());
        maserati.setTransmissionType("Sequential");

        printFullInfo(bentley);
        System.out.println();
        printFullInfo(maserati);
    }

    private static void printFullInfo(Car2 car) {
        System.out.println("Brand: " + car.getBrand() + "\n"
                + "Model: " + car.getModel() + "\n"
                + "Year of assembly: " + car.getYearOfAssembly() + "\n"
                + "Country of assembly: " + car.getCountryOfAssembly() + "\n"
                + "Color: " + car.getColor() + "\n"
                + "Transmission type: " + car.getTransmissionType() + "\n"
                + "Carcass type: " + car.getCarcassType() + "\n"
                + "Reg. num.: " + car.getRegistrationNumber() + "\n"
                + "Seat amount: " + car.getSeatAmount() + "\n"
                + "" + (car.isSummerTyres() ? "Summer" : "Winter") + " Tyres" + "\n"
                + "" + (car.getKey().isWithoutKeyAccess() ? "without key access" : "key access") + "\n"
                + "" + (car.getKey().isRemoteStartEngine() ? "remote start" : "default start") + "\n"
                + "Insurance number: " + car.getInsurance().getNumber() + "\n"
                + "Insurance cost: " + car.getInsurance().getCost() + "\n"
                + "Insurance expire date: " + car.getInsurance().getExpireDate()
        );
    }
}
