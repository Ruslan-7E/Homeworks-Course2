package pro.sky.java.course2.hw4;

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
                11);

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
                8);

        Bus marshrutka = new Bus("Gaz",
                "Next",
                2015,
                "Russia",
                null,
                0);

        Bus reisoviy = new Bus("Kamaz",
                null,
                2018,
                "Russia",
                "White",
                85);

        printTrainInfo(lastochka);
        System.out.println();
        printTrainInfo(leningrad);

        System.out.println("-----------");

        printBusInfo(marshrutka);
        System.out.println();
        printBusInfo(reisoviy);
    }

    public static void printTrainInfo(Train train) {
        System.out.println(train.getBrand() + ", "
        + train.getModel() + ", "
        + train.getProductionYear() + ", "
        + train.getProductionCountry() + ", "
        + train.getCarcassColor() + ", "
        + train.getMaxSpeed() + ", "
        + train.getTripCost() + ", "
        + train.getTripTime() + ", "
        + train.getDepartureStation() + ", "
        + train.getEndPoint() + ", "
        + train.getNumOfWagons());
    }

    public static void printBusInfo(Bus bus) {
        System.out.println(bus.getBrand() + ", "
        + bus.getModel() + ", "
        + bus.getProductionYear() + ", "
        + bus.getProductionCountry() + ", "
        + bus.getCarcassColor() + ", "
        + bus.getMaxSpeed());
    }
}

