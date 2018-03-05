package empty;

/**
 * Исключение указывающее на переполнение
 * @author imxo
 */
public class QueueFullExepyion extends Exception{
    int size;

    public QueueFullExepyion(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди " + size;
    }

}
