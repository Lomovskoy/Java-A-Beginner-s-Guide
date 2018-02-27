package readchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Использование класса BufferedReader для чтения символов из консоли
 * @author lomov
 */
public class ReadChars {

    public static void main(String[] args) throws IOException {
       
        char c;
        //Создание обьекта BufferedReader связанного с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Введите символы; окончание ввода - символ точки");
        
        //Читать символы
        do {            
            c = (char) br.read();
            System.out.print(c);
        } while (c != '.');
        System.out.println();
        
    }
    
}
