package usethreadsimproved;

/**
 * Усовершенствованная версия класса MyThread
 * @author lomov
 */
public class MyThread implements Runnable{
    //В этой переменной хранится ссылка на поток
    Thread thrd;

    //Создать новый поток
    public MyThread(String name) {
        thrd = new Thread(this, name);  //Имя присваевается потоку, при его создании
        thrd.start();                   //Запустить поток
    }
    
    //Начало выполнения нового потока
    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счётчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершён");
    }
}
