package randomaccessdemo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Демонстрация произвольного доступа к файлам
 * @author lomov
 */
public class RandomAccessDemo {

    public static void main(String[] args) {
        
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74,25};
        double d;
        
        //Открыть и использовать файл с произвольным доступом
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")){
            
            //запись значения в файл
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }
            
            //Прочитать отдельные значения из файла
            raf.seek(0);//найти первое значение типа double
            d = raf.readDouble();
            System.out.println("Первое значение: " + d);
            
            raf.seek(8);//найти второе значение типа double
            d = raf.readDouble();
            System.out.println("Второе значение: " + d);
            
            raf.seek(8 * 3);//найти четвёртое значение типа double
            d = raf.readDouble();
            System.out.println("Четвёртое значение: " + d);
            
            System.out.println();
            
            //Прочитать значение через одно
            System.out.println("Чтение значений с нечётными порядковыми номерами: ");
            
            for (int i = 0; i < data.length; i+=2) {
                raf.seek(8 * i);//найти i-е значение типа double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
            
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        System.out.println();
    }
    
}
