package extend;

import empty.QueueEmptyExeption;
import empty.QueueFullExepyion;
import interfaces.IGenQ;

/**
 * Обощённый класс реализующий очередь фиксированного размера
 * @author imxo
 * @param <T>
 */
public class FixedGenQueue<T> implements IGenQ<T>{
    
    //Массив для хранения элементов очереди
    private T q[];
    
    //Индексы вставки и извлечения элементов очереди
    private int putloc, getloc;

    public FixedGenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    //Поместить элемент в очередь
    @Override
    public void put(T obj) throws QueueFullExepyion {
        if(putloc == q.length-1)
            throw new QueueFullExepyion(q.length);
        q[putloc++] = obj;
    }

    //Извлеч элемент из очереди
    @Override
    public T get() throws QueueEmptyExeption {
        if (getloc == putloc) 
            throw new QueueEmptyExeption();
        return q[getloc++];
    }
    
}
