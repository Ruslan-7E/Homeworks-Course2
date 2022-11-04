package pro.sky.java.course2.hw7;

public class Main {

    public static void main(String[] args) {
        boolean success = Data.validate("newTest", "newPassword", "newPassword");
        if (success) {
            System.out.println("The Data is valid.");
        } else {
            System.out.println("The Data is not valid!");
        }
    }

}
