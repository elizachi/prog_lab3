package exceptions;

// Класс, реализующий исключение типа RuntimeException. Вызывается при введении недопустимых символов.
public class IllArgRuntimeException extends RuntimeException{
    public IllArgRuntimeException(String message){
        super(message);
    }
}
