package pro.sky.java.course2.hw4.animals;

public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("Lana", 13, "Savanna", "Grass");
        Herbivore giraffe = new Herbivore("Mike", 33, "Savanna", "Herbs");
        Herbivore horse = new Herbivore("Angela", 10, "Rancho", "vegetables");

        Predator hyena = new Predator("Kamala", 21, "Savanna", "Carrion");
        Predator tiger = new Predator("Pedro", 3, "Savanna", "meat");
        Predator bear = new Predator("Baloo", 13, "Forrest", "Honey");

        Amphibian frog = new Amphibian("Froggy", 3, "Ground");
        Amphibian adder = new Amphibian("Stylo", 3, "Ground");

        Flightless peacock = new Flightless("Rusty", 3, null, "By Legs");
        Flightless pinguin = new Flightless("Kovalsky", 11, "South Pole", "By Legs");
        Flightless dodo = new Flightless("Pizza", 3, "Tropics", "Fast Steps");

        Flying gull = new Flying("Livingston", 18, "Sky", "Fly");
        Flying albatross = new Flying("Dante", 4, "Above the sea", "Fly");
        Flying falcon = new Flying("Sam", 7, null, "Fly");

        gazelle.graze();
        System.out.println(giraffe);
        horse.go();
        bear.setTypeOfFood("Meat");
        System.out.println(bear);
        adder.hunt();
        frog.hunt();
        gull.eat();
        System.out.println(pinguin);
        System.out.println(gazelle.equals(giraffe));
        System.out.println(horse.equals(gazelle));
        System.out.println(gazelle.equals(horse));
    }

}
