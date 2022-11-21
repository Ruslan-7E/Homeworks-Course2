package pro.sky.java.course2.hw5;

import pro.sky.java.course2.hw4.Transport;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<Passenger> john = new Mechanic<>("John", "Snow", "Dragons");
        Mechanic<Auto> peter = new Mechanic<>("Peter", "Kavalainen", "Masters");

        Sponsor lukoil = new Sponsor("Lukoil", 3_000_000);
        Sponsor michelin = new Sponsor("Michelin", 5_000_000);

        Passenger porsche = new Passenger("Porsche", "Carrera", 4.0);
        Passenger tesla = new Passenger("Tesla", "Plaid", -1);

        tesla.addDriver(new DriverB("Michael", 'B', 3, tesla));
        tesla.addMechanic(john);
        tesla.addSponsor(lukoil, michelin);

        Truck daf = new Truck("Daf", "Super", 10.5);
        Truck kamaz = new Truck("Kamaz", "Master", 12.0);

        kamaz.addDriver(new DriverC("George", 'C', 5, kamaz));
        kamaz.addMechanic(peter);
        kamaz.addSponsor(michelin);

        Bus ikarus = new Bus("Ikarus", "V-170", 7.5);
        Bus electrobus = new Bus("Gaz", "City", -1);

        ikarus.addDriver(new DriverD("Phil", 'D', 8, ikarus));
        ikarus.addMechanic(peter);
        ikarus.addSponsor(lukoil);

//        DriverB michael = new DriverB("Michael", 'B', 3, tesla);
//        DriverC george = new DriverC("George", 'C', 5, kamaz);
//        DriverD phil = new DriverD("Phil", 'D', 8, ikarus);

        List<Auto> autos = List.of(tesla, kamaz, ikarus);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassenger(porsche);
        serviceStation.addTruck(daf);
        serviceStation.techService();
        serviceStation.techService();
        System.out.println();

        for (Auto auto : autos) {
            printInfo(auto);
        }

    }

    private static void printInfo(Auto auto) {
        System.out.println("Info about an auto: " + auto.getBrand() + " " + auto.getModel());
        System.out.println("Drivers: " + auto.getDrivers());
        System.out.println("Sponsors: " + auto.getSponsors());
        System.out.println("Mechanics: " + auto.getMechanics());
        System.out.println();
    }

    private static void service(Auto... autos) {
        for (Auto auto : autos) {
            serviceAuto(auto);
        }
    }

    private static void serviceAuto(Auto auto) {
        try {
            if (!auto.autoService()) {
                throw new RuntimeException("The auto "
                        + auto.getBrand()
                        + " " + auto.getModel()
                        + " hasn't got diagnosis!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
