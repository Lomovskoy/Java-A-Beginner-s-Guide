package extend;

import empty.QueueEmptyExeption;
import empty.QueueFullExepyion;
import interfaces.IGenQ;
import java.util.ArrayList;

/**
 * Кольцевая очередь
 * @author lomov
 * @param <T>
 */
public class CircularGenQueue<T> implements IGenQ<T>{

    //private ArrayList<T> q;//Массив для хранения элементов очереди
    private Object q[];
    private int putloc, gelloc; //Индексы вставляемых и извлекаемых элементов
    
    //Создать пустую очередь заданного размера
    public CircularGenQueue(int size){
        
        //q = new ArrayList<T>(size+1);//Выделить память для очереди
        q = new Object[size+1];
        putloc = gelloc = 0;
    }
    
    //Поместить символ в очередь
    @Override
    public void put(T ch) throws QueueFullExepyion {
       /*Очередь считается полной, если индекс putloc на единицу
        меньше индекса gelloc или если индекс putloc указывает 
        на конеу массива, а индекс gelloc - на его начало*/
        if(putloc+1 == gelloc | (putloc == q.length) & (gelloc == 0)){
            System.out.println(" - Очередь заполненна");
            return;
        }
        putloc++;
        if (putloc == q.length)//Перейти в начало массива
            putloc = 0;
        q[putloc] = ch;

    }

    @Override
    public T get() throws QueueEmptyExeption {
        
        if(gelloc == putloc){
            System.out.println(" - Очередб пуста");
            return null;
        }
        
        gelloc++;
        if (gelloc == q.length)//Перейти в начало массива
            gelloc = 0;
            
        return (T)q[gelloc];
    }
    
}
