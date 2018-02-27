package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * В классе Help открывается файл со справочной информацией, производится поиск
 * указанной темы, а затем отображается справочная информация. Обратите внимание
 * на то, что данный класс обрабатывает все исключения, освобождая от этого
 * вызывающий код.
 *
 * @author lomov
 */
public class Help {

    private String helpfile;

    public Help(String fname) {
        this.helpfile = fname;
    }

    //Отображает справочную интформацию по указанной теме
    public boolean helpon(String what) {
        int ch;
        String topic, info;

        //Открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                //Читать счимволы до тех пор, покане встретиться символ #
                ch = helpRdr.read();
                //Проверить, совпадеине темы
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    //Найти тему
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if (info != null) {
                                System.out.println(info);
                            }
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к файлу справки");
            return false;
        }
        return false;//ТЕМА НЕ НАЙДЕННА
    }

    //Получить тему стправки
    public String getSelection() {
        
        String topic = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Укажите тему: ");
        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении консоли");
        }
        return topic;
    }
}
