package pro.sky.java.course2.hw5;

public class Sponsor {

    private final String name;
    private final int amountOfMoney;

    public Sponsor(String name, int amountOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n", name, amountOfMoney);
    }

    @Override
    public String toString() {
        return name + ", amount sum: " + amountOfMoney;
    }
}
