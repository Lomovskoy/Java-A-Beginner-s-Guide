/**
 * Перепешите программу CopyFile4, таким образом, чтобы
 * в ней использовались классы, представляющиесимвольные потоки.
 * На этот раз воспользуйтесь оператором try с ремсурсами
 * для автоматического закрытия файла.
 */
package copyfile4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String s;

        //Создать и использовать объект fileReader, помещённый
        //в оболочку на основе класса BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("newfile.txt"))) {

            try (FileWriter fw = new FileWriter("test.txt")) {
                //Чтрение строк из файла с отображение их на экране
                while ((s = br.readLine()) != null) {

                    s = s.replaceAll(" ", "_");
                    s = s + "\r\n";//добавить символы перевода строки
                    fw.write(s);
                }
            } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода :" + exc);
        }
    }
}
