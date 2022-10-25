package pro.sky.java.course2.hw4;

import java.time.LocalDate;

public class TransportService {
    public static void main(String[] args) {
        Train lastochka = new Train("Lastochka",
                "B-901",
                2011,
                "Russia",
                null,
                301,
                3500,
                0,
                "Beloruskiy Station",
                "Minsk-Passajirskiy",
                11,
                "Diesel");

        Train leningrad = new Train("Leningrad",
                "D-125",
                2019,
                "Russia",
                null,
                270,
                1700,
                0,
                "Leningradskiy Station",
                "Leningrad-Passajirskiy",
                8,
                "Diesel");

        Bus marshrutka = new Bus("Gaz",
                "Next",
                2015,
                "Russia",
                null,
                0,
                "Gasoline");

        Bus reisoviy = new Bus("Kamaz",
                null,
                2018,
                "Russia",
                "White",
                85,
                "Diesel");

        Car3 kalina = new Car3("Lada",
                "Kalina",
                2017,
                "Russia",
                "Red",
                180,
                1.6,
                "Automatic",
                "Hatchback",
                null,
                4,
                false,
                new Car3.Key(true, false),
                new Car3.Insurance(LocalDate.now().plusDays(300), 15_000, null),
                "Gasoline");

        Train.printTrainInfo(lastochka);
        System.out.println();
        Train.printTrainInfo(leningrad);

        System.out.println("-----------");

        Bus.printBusInfo(marshrutka);
        System.out.println();
        Bus.printBusInfo(reisoviy);

        System.out.println("-----------");
        Car3.printFullInfo(kalina);
    }

}

