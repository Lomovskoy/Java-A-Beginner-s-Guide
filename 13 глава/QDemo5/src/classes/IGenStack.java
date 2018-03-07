package classes;

import exceptions.StackEmptyException;
import exceptions.StackFullException;

/**
 * Обощённый интерфейс стека.
 * @author lomov
 * @param <T>
 */
public interface IGenStack<T> {
    
    public void put(T obj) throws StackFullException;
    
    public T pop() throws StackEmptyException;
            
}
