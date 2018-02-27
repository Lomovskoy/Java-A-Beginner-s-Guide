package showfile3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * В этой версии программы ShowFile3 оператор try с ресурсами
 * применяется для автоматического закрытия файла, когда в нём
 * нет необхолдимости
 *
 * @author lomov
 */
public class ShowFile3 {

    public static void main(String[] args) {

        int i;

        //Прежде всего необходимо убедится, в том, что программе
        //передаётся имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла.разшитение");
            return;
        }

        //Открытие файла и чтение из него
        //поа не вернётся знак конца файла EOF, и 
        //последующее закрытие файла в блоке finaly
        try(FileInputStream fin = new FileInputStream(args[0])) {//Открыть файл

            //Читать байты, пока не встретиться символ EOF
            do {
                i = fin.read();//Читать из файла
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        }catch(IOException exc){
            System.out.println("Ошибка ввода-вывода :" + exc);
        }
        System.out.println();
    }
}
