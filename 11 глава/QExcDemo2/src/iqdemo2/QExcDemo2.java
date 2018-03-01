package iqdemo2;

import classes.MyThreadQ;
import classes.Queue;

/**
 * Обеспечить коректное функционирование класса Queue в условияхмногопоточной
 * обработки
 */
public class QExcDemo2 {

    public static void main(String[] args) {

        Queue qu = new Queue(30);
        MyThreadQ mt1 = new MyThreadQ("Small Queue", qu);
        MyThreadQ mt2 = new MyThreadQ("Big Queue", qu);
        
        try {
            mt1.thrd.start();
            mt1.thrd.join();
            mt2.thrd.start();
            mt2.thrd.join();
        } catch (Exception e) {
            System.out.println("Прерывание основного потока");
        }
    }
}
