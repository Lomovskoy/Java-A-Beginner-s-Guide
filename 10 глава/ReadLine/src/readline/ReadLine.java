package readline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Чтение символьных строк с консоли с использованием
 * класса BufferedRead
 * @author lomov
 */
public class ReadLine {

    public static void main(String[] args) throws IOException{
        
        //Создать обьект типа BufferedReader
        //связанный с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        
        System.out.println("Введите текстовые строки");
        System.out.println("Признак конца ввода строки - строка 'stop' ");
        
        do {            
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
    
}
