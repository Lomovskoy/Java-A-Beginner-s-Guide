package suspend;

/**
 *
 * @author lomov
 */
public class MyThread implements Runnable {

    Thread thrd;
    volatile boolean suspended;
    volatile boolean stopped;

    public MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    //Точка входа в поток
    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                //Этот синхронизированный блок используется для
                //тестирования переменных suspended stopped 
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - выход");
    }

    //Остановить поток
    synchronized void mystop() {
        stopped = true;

        //Следующие операторыобеспечивают полную
        //остановку приостановленного потока
        suspended = false;
        notify();
    }
    
    //Приостановить поток
    synchronized void mysuspend(){
        suspended = true;
    }
    
    //Возобновить поток
    synchronized void myresume(){
        suspended = false;
        notify();
    }

}
