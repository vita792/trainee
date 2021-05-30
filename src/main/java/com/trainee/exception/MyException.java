package main.java.com.trainee.exception;

public class MyException extends Exception {
    public MyException(String massage, Throwable cause){
        super(massage, cause);
    }
}
