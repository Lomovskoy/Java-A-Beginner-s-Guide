/**
 * Версия программы CopiFile2, в которой используется оператор
 * try с ресурсами. В мей демонстрируется управление двумя ресурсами
 * (в данном случае - файлами) с помошью единственного оператора try
 */
package copifile2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiFile2 {

    public static void main(String[] args) throws IOException{
        
        int i;
        
        //Прежде всего нужно убедиться в том, 
        //что программе передаются имена обоих файлов
        if(args.length != 2){
            System.out.println("Используйте: CopiFile откуда куда");
            return;
        }
       
        //Открытие обоих файлов и управление ими с помощью оператора try
        try(FileInputStream fin = new FileInputStream(args[0]);
                FileOutputStream fout = new FileOutputStream(args[1])){
            
            do{
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            }while(i != -1);
        }catch(IOException exc){
            System.out.println("Ошибка ввода-вывода :" + exc);
        }
    }
}
