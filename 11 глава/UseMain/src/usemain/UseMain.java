package usemain;

/**
 * Упражнение 11.2
 * 
 * Управление основным потоком
 * 
 * @author lomov
 */
public class UseMain {

    public static void main(String[] args) {
      
        Thread thrd;
        
        //Поулчить основной поток
        thrd = Thread.currentThread();
        
        //Отобразить имя основного потока
        System.out.println("Имя основного потока: " + thrd.getName());
        
        //Отобразить приоритет основного потока
        System.out.println("Приоритет основного потока: " + thrd.getPriority());
        
        System.out.println();
        
        //Установить имя и приоритет основного потока
        System.out.println("Установка имени и приоритета");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        
        //Отобразить имя основного потока
        System.out.println("Новое имя основного потока: " + thrd.getName());
        
        //Отобразить приоритет основного потока
        System.out.println("Новый приоритет основного потока: " + thrd.getPriority());
        
    }
    
}
