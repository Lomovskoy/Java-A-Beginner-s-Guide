package exceptions;

/**
 * Исключение указывающее на исчерпание очереди
 * @author lomov
 */
public class QueueEmptyException extends Exception{

    @Override
    public String toString() {
        return "\nОчередь пуста.";
    }
}
