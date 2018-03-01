package classes;

/**
 * класс очереди, предназначенной для хранения символьных значений
 *
 * @author lomov
 */
public class Queue{

    // Эти члены класса теперь являются закрытыми
    public char q[]; 			// массив для хранения элементов очереди
    public int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    public Queue(int size) {
        q = new char[size + 1];	// выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    synchronized public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    synchronized public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}
