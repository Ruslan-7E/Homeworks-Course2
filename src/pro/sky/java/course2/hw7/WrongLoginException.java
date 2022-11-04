package pro.sky.java.course2.hw7;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
