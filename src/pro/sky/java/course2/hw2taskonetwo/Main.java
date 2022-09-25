package pro.sky.java.course2.hw2taskonetwo;

public class Main {
    public static void main(String[] args) {
        // task 1
        Human maxim = new Human(-1987, "Maxim", "Minsk", "brand manager");
        Human anna = new Human(1993, "Anna", "Moscow", null);
        Human kate = new Human(1994, "Kate", null, "product manager");
        Human artem = new Human(1995, null, "Moscow", "chief business development officer");

        printGreeting(maxim);
        printGreeting(anna);
        printGreeting(kate);
        printGreeting(artem);

//        System.out.println("Привет! Меня зовут " + anna.getName() + ". " +
//                "Я из города " + anna.getTown() + ". Я родился в " + anna.getYearOfBirth() + ". Будем знакомы!");
//        System.out.println("Привет! Меня зовут " + maxim.getName() + ". " +
//                "Я из города " + maxim.getTown() + ". Я родился в " + maxim.getYearOfBirth() + ". Будем знакомы!");
//        System.out.println("Привет! Меня зовут " + kate.getName() + ". " +
//                "Я из города " + kate.getTown() + ". Я родился в " + kate.getYearOfBirth() + ". Будем знакомы!");
//        System.out.println("Привет! Меня зовут " + artem.getName() + ". " +
//                "Я из города " + artem.getTown() + ". Я родился в " + artem.getYearOfBirth() + ". Будем знакомы!");

        // task 2
        System.out.println("task 2");
        printNewGreeting(maxim);
        printNewGreeting(anna);
        printNewGreeting(kate);
        printNewGreeting(artem);
    }

    // task 1 method
    public static void printGreeting(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ". " +
                "Я из города " + human.getTown() + ". Я родился в "
                + human.getYearOfBirth() + ". Будем знакомы!");
    }

    // task 2 method
    public static void printNewGreeting(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ". " +
                "Я из города " + human.getTown() + ". Я родился в "
                + human.getYearOfBirth() + ". Я работаю на должности "
                + human.getJob() + ". Будем знакомы!");
    }
}
