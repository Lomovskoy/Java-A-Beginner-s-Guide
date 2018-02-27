/**
 * Обратите внимания, что для потока FileReader создаётся оболочка на основе 
 * класса BufferedReader. Благодаря этома появляется возможность использовать 
 * обращатьсяк методу readLine() Кроме того закрытие потока BufferedReader 
 * на который ссылаетсчя br автоматичски происходит при закрытии файла.
 */

package dtos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Прмимер простой утилиты для чтения данных с диска
 * @author lomov
 */
public class DtoS {

    public static void main(String[] args) {
        
        String s;
        
        //Создать и использовать объект fileReader, помещённый
        //в оболочку на основе класса BufferedReader
        
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            
            //Чтрение строк из файла с отображение их на экране
            while ((s = br.readLine()) != null) {                
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
    
}
