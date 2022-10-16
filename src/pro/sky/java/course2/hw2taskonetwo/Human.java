package pro.sky.java.course2.hw2taskonetwo;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job; // for task 2

// task 3 version of constructor
    public Human(int yearOfBirth, String name, String town, String job) {
        this.setYearOfBirth(yearOfBirth);
        this.setName(name);
        this.setTown(town);
        this.setJob(job);
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

    // hw3-task1

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public void setJob(String job) {
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }
}
