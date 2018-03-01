package usethreads;

/**
 * Обьекты типа MyThread 
 * могут выполнятсья в отдельных потоках,
 * так как класс MyThread реализует
 * интерфейс Runnable
 * 
 * @author lomov
 */
public class MyThread implements Runnable{

    String thrdName;

    public MyThread(String name) {
        thrdName = name;
    }
    
    //Точка входа в поток
    @Override
    public void run() {
        System.out.println(thrdName + " - запуск");
        try {
            for(int count=0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("B " + thrdName + ", счётчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " - прерван");
        }
        System.out.println(thrdName + " - завершён");
    }
    
}
