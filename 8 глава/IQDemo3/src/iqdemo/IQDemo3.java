package iqdemo;

import classes.CircularQueue;
import classes.DynQueue;
import classes.FixedQueue;
import classes.ICarQ;
import exceptions.QueueEmptyException;
import exceptions.QueueFullException;

/**
 * Упражнение 9.1
 * Добавление обработки исключение в кдласс очереди
 * @author lomov
 */
public class IQDemo3 {

    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;
        
        try{
            //Переполнение очереди
            for(i=0; i < 11; i++){
                System.out.println("Попытка сохранения: " + (char) ('A'+i));
                q.put((char) ('A'+i));
                System.out.print(" - OK");
            }
            System.out.println();
        }catch(QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();
        
        try{
            //Попытка извлеч символ из пустой очереди
            for(i=0; i < 11; i++){
                System.out.print("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        }catch(QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
