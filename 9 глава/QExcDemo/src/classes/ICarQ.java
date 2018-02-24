package classes;

import exceptions.QueueEmptyException;
import exceptions.QueueFullException;

/**
 * Интерфейс для очереди символов
 * @author lomov
 */
public interface ICarQ {
    
    //Поместить символ в очередь
    void put(char ch) throws QueueFullException;
    
    //Извлеч символ из очереди
    char get() throws QueueEmptyException;
}