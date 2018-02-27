/**
 * Напишите программу для копирования текстовый файлов. Видоизмените её
 * таким образом, чтобы все пробелызаминялись дефисами. Используйте при
 * написании программы классы, представляющие байтовые потоки, а так же
 * традиционный способ закрытия файла явным вызовом метода close()
 */
package copyfile3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile3 {

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
                if(i != -1){
                    if(i == 32)
                        i = 95;
                    fout.write(i);
                }
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
