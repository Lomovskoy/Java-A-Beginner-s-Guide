package sync;

/**
 *
 * @author lomov
 */
public class MyThread implements Runnable{
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int ansver;
    
    //Создаём новый поток
    public MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();//запустить поток
    }

    //Начать выполнение нового потока
    @Override
    public void run() {
        int sum;
        
        System.out.println(thrd.getName() + " - запуск");
        
        ansver = sa.sumArray(a);
        System.out.println("Сумма для " + thrd.getName() + ": " + ansver);
        
        System.out.println(thrd.getName() + " - завершение");
    }
    
}
