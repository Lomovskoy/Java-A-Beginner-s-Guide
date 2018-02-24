package exceptions;

/**
 * Исключение указывающее на переполнение очереди
 * @author lomov
 */
public class QueueFullException extends Exception{
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}
