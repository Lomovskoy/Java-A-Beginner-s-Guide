package threadcom2;

/**
 *
 * @author lomov
 */
public class MyThread implements Runnable {

    Thread thrd;
    TickTock ttOb;

    //Создать новый поток
    public MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();//запустить поток
    }

    //Начать выполнение нового потока
    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Прерывание потока MyThread");
                }
            }
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                ttOb.tock(true);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Прерывание потока MyThread");
                }
            }
            ttOb.tock(false);
        }
    }

}
