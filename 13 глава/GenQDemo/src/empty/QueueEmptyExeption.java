package empty;

/**
 * Исключение указывающее на исчерпание очереди
 * @author imxo
 */
public class QueueEmptyExeption extends Exception{

    @Override
    public String toString() {
        return "\nОчередь пуста";
    }

}
