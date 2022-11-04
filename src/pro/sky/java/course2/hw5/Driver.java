package pro.sky.java.course2.hw5;

public abstract class Driver<T extends Auto & Racing> {

    protected String name;
    protected Character driveCategory;
    protected Integer yearsOfExperience;
    protected T autoType;

    public Driver(String name, Character driveCategory, Integer yearsOfExperience, T autoType) {
        if (name == null || name.isBlank()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        setDriveCategory(driveCategory);

        if (yearsOfExperience == null) {
            this.yearsOfExperience = -1;
        } else {
            this.yearsOfExperience = yearsOfExperience;
        }

        if (autoType != null) {
            this.autoType = autoType;
        }
    }

//    public abstract void startMove();
//
//    public abstract void stopMove();
//
//    public abstract void refill();


    public String getName() {
        return name;
    }

    public Character getDriveCategory() {
        return driveCategory;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public T getAutoType() {
        return autoType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDriveCategory(Character driveCategory) {
        if (driveCategory == null) {
            throw new IllegalArgumentException("You'd need to give a type of drive category!");
        } else {
            this.driveCategory = driveCategory;
        }
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setAutoType(T autoType) {
        this.autoType = autoType;
    }

    public void getDriverInfo() {
        System.out.println(getName() + " drives " + getAutoType() + " and competes in a race.");
    }

    @Override
    public String toString() {
        return getName() + ", " + getDriveCategory() + ", "
                + getYearsOfExperience() + ", " + getAutoType();
    }
}
