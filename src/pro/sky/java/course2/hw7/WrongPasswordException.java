package pro.sky.java.course2.hw7;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
