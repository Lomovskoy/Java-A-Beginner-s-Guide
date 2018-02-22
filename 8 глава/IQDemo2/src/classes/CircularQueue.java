package classes;

/**
 * Кольцевая очередь
 * @author lomov
 */
public class CircularQueue implements ICarQ{

    private char q[];//Массив для хранения элементов очереди
    private int putloc, gelloc; //Индексы вставляемых и извлекаемых элементов
    
    //Создать пустую очередь заданного размера
    public CircularQueue(int size){
        
        q = new char[size+1];//Выделить память для очереди
        putloc = gelloc = 0;
    }
    
    //Поместить символ в очередь
    @Override
    public void put(char ch) {
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

    //Извлеч символ из очерелди
    @Override
    public char get() {
        if(gelloc == putloc){
            System.out.println(" - Очередб пуста");
            return (char) 0;
        }
        
        gelloc++;
        if (gelloc == q.length)//Перейти в начало массива
            gelloc = 0;
            
        return q[gelloc];
    }
    
    //Сбросить очерешь с первоначальное состояние
    @Override
    public void reset() {
        putloc = gelloc = 0;
        System.out.println(" Очередь сброшена ");
    }    
    
    //Копирование очереди
    public char[] getICar() {
        return q;
    }
}
