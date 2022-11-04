package pro.sky.java.course2.hw1;

public class PersonService {
    public void setAgeToEighteen(NewPerson person) {
        person.setAge(18);
        person.child = new NewPerson(null, 30);
    }

    public void changePersonToDani(NewPerson person) {
        person = new NewPerson("Dani", 26);
        NewPerson padme = new NewPerson("Padme", 37);
        NewPerson luke = new NewPerson("Luke", 19);
        padme.child = luke;
        luke.parent = padme;
    }
}
