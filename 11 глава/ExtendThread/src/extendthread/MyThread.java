package extendthread;

/**
 *
 * @author lomov
 */
public class MyThread extends Thread{
    
    //Создать новый поток
    public MyThread(String name) {
        super(name);                //Присвоить имя потоку
        start();                    //Запустить поток
    }
    
    //Начать выполнение нового потока
    @Override
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + getName() + ", счётчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " - прерван");
        }
        System.out.println(getName() + " - завершён");
    }
    
    
}
