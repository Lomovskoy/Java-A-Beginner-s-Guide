package exceptions;

/**
 * Исключение указывающее на исчерпание стека
 * @author lomov
 */
public class StackEmptyException extends Exception{

    @Override
    public String toString() {
        return "\nСтек пуст.";
    }
}
