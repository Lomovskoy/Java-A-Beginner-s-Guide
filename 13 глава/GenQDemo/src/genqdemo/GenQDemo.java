package genqdemo;

import empty.QueueEmptyExeption;
import empty.QueueFullExepyion;
import extend.CircularGenQueue;
import extend.DynGenQueue;
import extend.FixedGenQueue;

/**
 * Упражнение 13.1 Демонстрация обощённог класса очереди
 *
 * @author imxo
 */
public class GenQDemo {

    public static void main(String[] args) {

        //Создать очередь для хранения целых чисел
        Integer iStore[] = new Integer[10];
        FixedGenQueue<Integer> q = new FixedGenQueue<Integer>(iStore);

        //CircularGenQueue q3 = new CircularGenQueue(10);
        
        Integer iVal;
        System.out.println("\t\t\t *** Фиксированная очередь *** ");
        System.out.println("Демонстрация очереди чисел типа Integer");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + i + " в очередь q");
                q.put(i);//Добавить целочесленное значение в q
            }
        } catch (QueueFullExepyion e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение силудующего числа типа Integer"
                        + " из очереди q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }
        System.out.println();

        //Создать очередь для хранения чисел с плавающей точкой
        Double dStore[] = new Double[10];
        FixedGenQueue<Double> q2 = new FixedGenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Демонстрация очереди чисел типа Double");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + (double) i / 2 + " в очередь q2");
                q2.put((double) i / 2);//Добавить double значение в q2
            }
        } catch (QueueFullExepyion e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение силудующего числа типа Double"
                        + " из очереди q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("\t\t\t *** Динамическая очередь *** ");
        
        DynGenQueue<Character> q3 = new DynGenQueue(5);
        Character ch;
        try {
            //Поместить ряд символов в динамическую очередь
            for (int i = 0; i < 10; i++) {
                q3.put((char) ('Z' - i));
            }
        } catch (QueueFullExepyion e) {
            System.out.println(e);
        }

        try {
            //Отобразить содержание очереди
            System.out.print("Содержимое динамической очереди: ");
            for (int i = 0; i < 10; i++) {
                ch = q3.get();
                System.out.print(ch);
                //System.out.print(q3.get());
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------------------------------");

        /*//Поместить ряд символов в кольцевую очередь
        for ( i = 0; i < 10; i++) 
            iQ.put((char) ('A' + i));
        
        //Отобразить содержание очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for ( i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        //Поместить больше символов в кольцевую очередь
        for ( i = 10; i < 20; i++) 
            iQ.put((char) ('A' + i));
        
        //Отобразить содержание очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for ( i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nСохранение и использование данных кольцевой очереди");
        
        //Поместить символы в кольцевую очередь и извлеч из от туда
        for ( i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }*/

    }

}
