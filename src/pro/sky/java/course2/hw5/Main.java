package pro.sky.java.course2.hw5;

public class Main {
    public static void main(String[] args) {
        Passenger porsche = new Passenger("Porsche", "Carrera", 4.0);
        Passenger tesla = new Passenger("Tesla", "Plaid", -1);

        Truck daf = new Truck("Daf", "Super", 10.5);
        Truck kamaz = new Truck("Kamaz", "Master", 12.0);

        Bus ikarus = new Bus("Ikarus", "V-170", 7.5);
        Bus electrobus = new Bus("Gaz", "City", -1);
    }
}
