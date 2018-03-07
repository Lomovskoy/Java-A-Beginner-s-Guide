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
                System.out.print("Получение силедующего числа типа Integer"
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
                System.out.print("Получение силeдующего числа типа Double"
                        + " из очереди q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("\t\t\t *** Динамическая очередь *** ");

        System.out.println("Демонстрация динамической очереди знаков типа char");

        DynGenQueue<Character> q3 = new DynGenQueue(5);
        Character ch;
        try {
            //Поместить ряд символов в динамическую очередь
            for (int i = 0; i < 10; i++) {
                System.out.println("Добавление " + (char) ('Z' - i) + " в очередь q3");
                q3.put((char) ('Z' - i));
            }
        } catch (QueueFullExepyion e) {
            System.out.println(e);
        }

        System.out.println();

        try {
            //Отобразить содержание очереди
            System.out.println("Содержимое динамической очереди: ");
            for (int i = 0; i < 10; i++) {
                System.out.print("Получение силедующего объекта типа char"
                        + " из очереди q3: ");
                ch = q3.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Демонстрация динамической очереди чисел типа Integer");
        DynGenQueue<Integer> q4 = new DynGenQueue(5);
        Integer in;
        try {
            //Поместить ряд символов в динамическую очередь
            for (int i = 0; i < 10; i++) {
                System.out.println("Добавление " + i + " в очередь q4");
                q4.put(i);
            }
        } catch (QueueFullExepyion e) {
            System.out.println(e);
        }

        System.out.println();

        try {
            //Отобразить содержание очереди
            System.out.println("Содержимое динамической очереди: ");
            for (int i = 0; i < 10; i++) {
                System.out.print("Получение следующего объекта типа int"
                        + " из очереди q4: ");
                in = q4.get();
                System.out.println(in);
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("\t\t\t *** Кольцевая очередь *** ");

        CircularGenQueue<Long> q5 = new CircularGenQueue(5);
        System.out.println("Демонстрация кольцевой очереди чисел типа Long");
        Long ln;
        try {
            //Поместить ряд символов в кольцевую очередь
            for (long i = 0; i < 10; i++) {
                System.out.println("Добавление " + i + " в очередь q5");
                q5.put(i);
            }
        } catch (QueueFullExepyion e) {
            System.out.println(e);
        }
        
        System.out.println();

        try {
            //Отобразить содержание очереди
            System.out.println("Содержимое кольцевой очереди: ");
            for (long i = 0; i < 10; i++) {
                System.out.print("Получение следующего объекта типа long"
                        + " из очереди q4: ");
                ln = q5.get();
                System.out.println(ln);
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Демонстрация кольцевой очереди чисел типа Float");

        CircularGenQueue<Float> q6 = new CircularGenQueue(5);
        Float fl;
        try {
            //Поместить больше символов в кольцевую очередь
            for (float i = 10; i < 20; i++) {
                System.out.println("Добавление " + i + " в очередь q6");
                q6.put(i);
            }
        } catch (QueueFullExepyion e) {
            System.out.println(e);
        }

        try {
            //Отобразить содержание очереди
            System.out.print("Содержимое кольцевой очереди: ");
            for (float i = 0; i < 10; i++) {
                fl = q6.get();
                System.out.print(fl);
            }
        } catch (QueueEmptyExeption e) {
            System.out.println(e);
        }
        System.out.println("\nСохранение и использование данных кольцевой очереди");

        try {
            //Поместить символы в кольцевую очередь и извлеч из от туда
            for (float i = 0; i < 20; i++) {
                q6.put(i);
                fl = q6.get();
                System.out.print(fl);
            }
        } catch (QueueFullExepyion | QueueEmptyExeption e) {
            System.out.println(e);
        }
    }

}
