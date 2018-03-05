package extend;

import empty.QueueEmptyExeption;
import empty.QueueFullExepyion;
import interfaces.IGenQ;
import java.util.ArrayList;

/**
 * Обощённый класс реализующий динамическую очередь
 * @author lomov
 * @param <T>
 */
public class DynGenQueue<T> implements IGenQ<T>{

    //Массив для хранения элементов очереди
    //private ArrayList<T> q;
    private Object q[];

    //Индексы вставляемых и извлекаемых элементов
    private int putloc, gelloc;
    
    //Создать пустую очередь заданного размера
    public DynGenQueue(int size){
        //Выделить память для очереди
        //q = new ArrayList<T>(size+1);
        q = new Object[size+1];
        putloc = gelloc = 0;
    }
    
    //Поместить символ в очередь
    @Override
    public void put(T ch) throws QueueFullExepyion {
        if(putloc == q.length-1){
            //Увелисчить размер очереди
            Object t[] = new Object[q.length * 2];
            
            //Скопировать элементы в новую очередь
            //System.arraycopy(q, 0, t, 0, q.length);
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            
            q = t;
        }
        
        putloc++;
        q[putloc] = ch;
    }
    
    //Извлеч символ из очерелди
    @Override
    public T get() throws QueueEmptyExeption {
        if (gelloc == putloc) {
            System.err.println(" - Очередь пуста");
            return null;
        }
        gelloc++;
        return (T)q[gelloc];
    }
}
