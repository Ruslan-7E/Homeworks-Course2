package pro.sky.java.course2.hw2taskthree;

public class CarService {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 0,
                "yellow", 2015, "Russia");
        Car audi = new Car("Audi", "A8 5.0L TDI quattro", 3.0,
                null, 2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 3.0,
                "black", 0, null);
        Car kia = new Car("Kia", null, 2.4,
                "red", 2018, "South Korea");
        Car hyundai = new Car(null, "Avante", 1.6,
                "orange", 2016, "South Korea");

        printFullInfo(lada);
        System.out.println();
        printFullInfo(audi);
        System.out.println();
        printFullInfo(bmw);
        System.out.println();
        printFullInfo(kia);
        System.out.println();
        printFullInfo(hyundai);
    }

    public static void printFullInfo(Car car) {
        System.out.println("Brand: " + car.getBrand() + "\n"
                    + "Model: " + car.getModel() + "\n"
                    + "Engine volume: " + car.getEngineVolume() + "\n"
                    + "Color: " + car.getColor() + "\n"
                    + "Year of assembly: " + car.getYearOfAssembly() + "\n"
                    + "Country of assembly: " + car.getCountryOfAssembly()
            );

    }
}


