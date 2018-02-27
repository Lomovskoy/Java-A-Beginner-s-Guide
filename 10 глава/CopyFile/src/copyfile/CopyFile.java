/**
 * Копирование текстового файла.
 * При вызове этой программы следует указать имена исходного
 * и целевого файлов. Например, для копирования файлов First.txt
 * в файл Second.txt в команднойстроке нужно ввести следующую команду:
 * 
 * java CopiFile First.txt Second.txt
 */
package copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) throws IOException{
        
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        
        //Прежде всего нужно убедиться в том, 
        //что программе передаются имена обоих файлов
        if(args.length != 2){
            System.out.println("Используйте: CopiFile откуда куда");
            return;
        }
       
        //Копирование файла
        try{
            //Попытка открытия файла
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            
            do{
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            }while(i != -1);
        }catch(IOException exc){
            System.out.println("Ошибка ввода-вывода :" + exc);
        }finally{
            try {
                if(fin != null)
                    fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла:" + exc);
            }
        }
    }
    
}
