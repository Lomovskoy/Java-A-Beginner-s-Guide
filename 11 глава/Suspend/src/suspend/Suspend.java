package suspend;

/**
 * Приостановка, возобновление и остановка потока
 *
 * @author lomov
 */
public class Suspend {

    public static void main(String[] args) {

        MyThread ob1 = new MyThread("My Thread");

        try {
            Thread.sleep(1000);//позволить потоку ob1 начать выполнение
            
            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);
            
            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);
            
            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);
            
            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);
            
            ob1.mysuspend();
            System.out.println("Остановка потока");
            ob1.mystop();
            
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }
        
        //Ожидание завершения потока
        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }
        
        System.out.println("Выход из основного потока");

    }
}
