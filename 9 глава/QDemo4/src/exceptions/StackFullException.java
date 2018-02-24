package exceptions;

/**
 * Исключение указывающее на переполнение стека
 * @author lomov
 */
public class StackFullException extends Exception{
    int size;

    public StackFullException(int size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }
}
