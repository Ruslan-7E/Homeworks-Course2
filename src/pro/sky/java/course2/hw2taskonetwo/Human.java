package pro.sky.java.course2.hw2taskonetwo;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job; // for task 2

// task 2 version of constructor
    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
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
