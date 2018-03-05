package interfaces;

import empty.QueueEmptyExeption;
import empty.QueueFullExepyion;

/**
 * Обощённый интерфейс
 * @author imxo
 * @param <T>
 */
public interface IGenQ<T> {
    
    //Поместить элемент в очередь
    void put(T ch) throws QueueFullExepyion;
    
    //Извлеч элемент из очереди
    T get() throws QueueEmptyExeption;
}
