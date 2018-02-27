package ktod;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Пример простой программы для ввода данных с клавиатыуры и
 * записи их на диск, демонстрируюий использование класса 
 * FileWriter
 * 
 * @author lomov
 */
public class KtoD {

    public static void main(String[] args) {
        
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Признак конца ввода строки - 'stop' ");
        
        try (FileWriter fw = new FileWriter("test.txt")){
            
            do {                
                System.out.print(": ");
                str = br.readLine();
                
                if(str.compareTo("stop") == 0)
                    break;
                
                str = str + "\r\n";//добавить символы перевода строки
                fw.write(str);
                
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
    
}
