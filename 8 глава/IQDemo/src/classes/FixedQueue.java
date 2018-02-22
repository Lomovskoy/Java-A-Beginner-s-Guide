package classes;

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
    @Override
    public void put(char ch){
        if (putloc == q.length-1) {
            System.out.println(" - Очередь заполненна");
        }
        
        putloc++;
        q[putloc] = ch;
    }

    //Извлеч символ из очереди
    @Override
    public char get() {
        if (gelloc == putloc) {
            System.out.println(" - Очередб пуста");
            return (char) 0;
        }
        gelloc++;
        return q[gelloc];
    }
}
