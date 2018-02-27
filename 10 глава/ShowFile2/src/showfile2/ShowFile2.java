package showfile2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * В этой версии программы те её части, которые отвечают
 * за открытие файла и получение доступа к нему, помещены
 * в один блок try. Файл закрывается в блоке finaly
 *
 * @author lomov
 */
public class ShowFile2 {

    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        //Прежде всего необходимо убедится, в том, что программе
        //передаётся имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла.разшитение");
            return;
        }

        //Открытие файла и чтение из него
        //поа не вернётся знак конца файла EOF, и 
        //последующее закрытие файла в блоке finaly
        try {
            fin = new FileInputStream(args[0]);//Открыть файл

            //Читать байты, пока не встретиться символ EOF
            do {
                i = fin.read();//Читать из файла
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден, ошибка: " + exc);
        }catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e);
        } finally {

            try {
                if(fin != null)
                    fin.close();//Закрыть файл
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла: " + e);
            }
        }
        System.out.println();
    }
}
