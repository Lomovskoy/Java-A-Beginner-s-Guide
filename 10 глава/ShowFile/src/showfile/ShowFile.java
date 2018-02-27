package showfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Отображение текстового файла. При вызове этой программы следует указать имя
 * файла, содержимое которогть ребуетсяпрочитать. Например, для вывода на экран
 * содержимого файла TEST.txt необходжиммо ввести в командной строке следующую
 * команду. java ShowFile TEST.txt
 *
 * @author lomov
 */
public class ShowFile {

    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        //Прежде всего необходимо убедится, в том, что программе
        //передаётся имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла.разшитение");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);//Открыть файл
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден, ошибка: " + exc);
        }

        try {
            //Читать байты, пока не встретиться символ EOF
            do {
                i = fin.read();//Читать из файла
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e);
        } finally {

            try {
                fin.close();//Закрыть файл
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла: " + e);
            }
        }
        System.out.println();
    }
}
