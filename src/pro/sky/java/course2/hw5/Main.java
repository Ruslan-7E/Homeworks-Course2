package pro.sky.java.course2.hw5;

public class Main {
    public static void main(String[] args) {
        Passenger porsche = new Passenger("Porsche", "Carrera", 4.0);
        Passenger tesla = new Passenger("Tesla", "Plaid", -1);

        Truck daf = new Truck("Daf", "Super", 10.5);
        Truck kamaz = new Truck("Kamaz", "Master", 12.0);

        Bus ikarus = new Bus("Ikarus", "V-170", 7.5);
        Bus electrobus = new Bus("Gaz", "City", -1);

        DriverB michael = new DriverB("Michael", 'B', 3, tesla);
        DriverC george = new DriverC("George", 'C', 5, kamaz);
        DriverD phil = new DriverD("Phil", 'D', 8, ikarus);

        System.out.println("************");

        porsche.pitStop();
        porsche.maxSpeed();
        porsche.startMove();
        porsche.stopMove();
        porsche.bestTime();

        System.out.println("************");

        daf.pitStop();
        daf.maxSpeed();
        daf.startMove();
        daf.stopMove();
        daf.bestTime();
        System.out.println(daf);

        System.out.println("************");

        electrobus.pitStop();
        electrobus.maxSpeed();
        electrobus.startMove();
        electrobus.stopMove();
        electrobus.bestTime();
        System.out.println(electrobus);

        System.out.println("------------");

        System.out.println(michael);
        System.out.println(george);
        System.out.println(phil);

        System.out.println("------------");

        michael.getDriverInfo();
        george.getDriverInfo();
        phil.getDriverInfo();

        System.out.println("------------");

        porsche.getAutoType();
        electrobus.getAutoType();
        kamaz.getAutoType();

    }
}
