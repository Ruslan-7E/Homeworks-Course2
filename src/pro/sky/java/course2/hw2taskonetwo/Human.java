package pro.sky.java.course2.hw2taskonetwo;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job; // for task 2

// task 3 version of constructor
    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

        if (name == null) {
            System.out.println("Информация не указана");
        } else {
            this.name = name;
        }

        if (town == null) {
            System.out.println("Информация не указана");
        } else {
            this.town = town;
        }

        if (job == null) {
            System.out.println("Информация не указана");
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }
}
