package usethreads;

/**
 * Создание потока путём реализации интерфейса Runnable
 * @author lomov
 */
public class UseThreads {

    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        
        //Сначала создаём обьект типа MyThread
        MyThread mt = new MyThread("Child #1");
        
        //Затем формируем поток на основе этого обьекта
        Thread newThrd = new Thread(mt);
        
        //Навать выполнение потока
        newThrd.start();
        
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (Exception exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
    
}
