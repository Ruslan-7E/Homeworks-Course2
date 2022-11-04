package pro.sky.java.course2.hw1;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        NewPerson masha = new NewPerson("Masha", 27);

        if (masha.child != null) {
            System.out.println("masha.child.getName() = " + masha.child.getName());
        } else {
            System.out.println("No child");
        }
        NewPerson john = new NewPerson("John", 8);
        masha.child = john;

        personService.setAgeToEighteen(masha);
        if (masha.child != null) {
            if (masha.child.getName() != null) {
                System.out.println("masha.child.getName().length() = " + masha.child.getName().length());
            } else {
                System.out.println(0);
            }
        }
        System.out.println("masha.getAge() = " + masha.getAge());
        System.out.println("masha.child.getName() = " + masha.child.getName());
        System.out.println("john.getName() = " + john.getName());
        john = new NewPerson("Alternative John", 40);
        john = null;

        personService.changePersonToDani(masha);
        System.out.println("masha.getAge() = " + masha.getAge());

        System.out.println();
    }
}