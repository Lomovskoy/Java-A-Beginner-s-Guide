package classes;

/**
 * Динамическая очередь
 * @author lomov
 */
public class DynQueue implements ICarQ{

    private char q[];//Массив для хранения элементов очереди
    private int putloc, gelloc; //Индексы вставляемых и извлекаемых элементов
    
    //Создать пустую очередь заданного размера
    public DynQueue(int size){
        
        q = new char[size+1];//Выделить память для очереди
        putloc = gelloc = 0;
    }
    
    //Поместить символ в очередь
    @Override
    public void put(char ch) {
        if(putloc == q.length-1){
            //Увелисчить размер очереди
            char t[] = new char[q.length * 2];
            
            //Скопировать элементы в новую очередь
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            
            q = t;
        }
        putloc++;
        if (putloc == q.length)//Перейти в начало массива
            putloc = 0;
        q[putloc] = ch;
    }

    //Извлеч символ из очерелди
    @Override
    public char get() {
        if (gelloc == putloc) {
            System.err.println(" - Очередь пуста");
            return (char) 0;
        }
        gelloc++;
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
