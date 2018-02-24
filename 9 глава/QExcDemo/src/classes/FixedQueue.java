package classes;

import exceptions.QueueEmptyException;
import exceptions.QueueFullException;

/*
 * Класс реализующий очередь фиксированного размера
 * для хранения символов
 * @author lomov
 */
public class FixedQueue implements ICarQ{

    private char q[];//Массив для хранения элементов очереди
    private int putloc, gelloc; //Индексы вставляемых и извлекаемых элементов
    
    //Создать пустую очередь заданного размера
    public FixedQueue(int size){
        
        q = new char[size+1];//Выделить память для очереди
        putloc = gelloc = 0;
    }
    
    //Поместить символ в очередь
    public void put(char ch) throws QueueFullException{
        
        if (putloc == q.length-1)
            throw new QueueFullException(q.length);

        putloc++;
        q[putloc] = ch;
     }
    

    //Извлеч символ из очереди
    public char get() throws QueueEmptyException{
        
        if (gelloc == putloc) 
            throw new QueueEmptyException();

        gelloc++;
        return q[gelloc];
    }
}
