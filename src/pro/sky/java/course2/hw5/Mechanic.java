package pro.sky.java.course2.hw5;

public class Mechanic<T extends Auto>{

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean autoService(T t) {
        return t.autoService();
    }

    public void repair(T t) {
        t.repair();
    }

    @Override
    public String toString() {
        return name + " " + surname + " from company " + company;
    }
}
