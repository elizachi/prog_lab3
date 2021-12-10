package exceptions;

// Класс, реализующий исключение типа Exception. Вызывается при неправильно введенной команде.
public class ComandException extends Exception{
    public ComandException(String message){
        super(message);
    }
}
