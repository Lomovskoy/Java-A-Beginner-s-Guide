package compfiles;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Упражнение 10.1
 * 
 * Сравнение двух файлов.
 * 
 * При вызовк этой программы следует указать имена
 * сравневаемых файлов. Например, что ыб сравнить файл
 * First.txt с файлом Second.txt, в командной строке
 * нужно ввести следующую команду:
 * 
 * java First.txt Second.txt
 * @author lomov
 */
public class CompFiles {

    public static void main(String[] args) {
        
        int i=0, j=0, flag=1;
        
        //Прежде всего нужно убедиться в том, 
        //что программе передаются имена обоих файлов
        if(args.length != 2){
            System.out.println("Используйте: CompFiles откуда куда");
            return;
        }
       //Сравнить файлы
        try (FileInputStream f1 = new FileInputStream(args[0]);
                FileInputStream f2 = new FileInputStream(args[1])){
            
            //проверить содержание каждого файла
            do {                
                i = f1.read();
                j = f2.read();
                if(i != j)
                    break;
                else{
                    flag +=1;
                }
            } while (i != -1 && j != -1);
            
            if(i != j)
                System.out.println("Содержимое файлов отличчается - отличие найденно в " + flag + " элнмнгте.");
            else
                System.out.println("Содержание файлов совпадает");
            
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
