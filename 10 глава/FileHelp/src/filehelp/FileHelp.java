package filehelp;

import classes.Help;

/**
 * Упражнение 10.2
 *
 * Справочная система, использующая дисковый файл для хранения информации
 *
 * @author lomov
 */
public class FileHelp {

    public static void main(String[] args) {

        Help helpobj = new Help("help.txt");//Имя файласобержащего справочную информацию
        String topic;

        System.out.println("Воспользуйтесь справочной системой.\n"
                + "Для выхода из системы введите 'stop'.");
        do {
            topic = helpobj.getSelection();
            if (!helpobj.helpon(topic)) {
                System.out.println("Тема не найдена\n");
            }
        } while (topic.compareTo("stop") != 0);
    }
}
