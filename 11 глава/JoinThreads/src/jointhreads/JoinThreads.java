package jointhreads;

/**
 * Использование метода join()
 *
 * @author lomov
 */
public class JoinThreads {

    public static void main(String[] args) {

        System.out.println("Запуск основного потока");
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

        try {
            mt1.thrd.join();//Ожидает до тех пор пока указанный метод не зачершится
            System.out.println("Child #1 - присоединён");
            mt2.thrd.join();//Ожидает до тех пор пока указанный метод не зачершится
            System.out.println("Child #2 - присоединён");
            mt3.thrd.join();//Ожидает до тех пор пока указанный метод не зачершится
            System.out.println("Child #3 - присоединён");
            
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        System.out.println("Завершение основного потока");
    }

}
