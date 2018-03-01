/**
 * Эта программа будет имитировать срач, между разными группами граждан.
 * Представители разных субкультур будут спорить с друг другом.
 * Программа юудет выполненна в многопотоке.
 * Пользователь выбирает время спора, запускаются все субкультуры, каждый через
 * рандомное время будет высказываться, победжит тот, чиих высказываний больше
 * Для наглядности высказывания будут подсвечиватсья разным цветом
 *
 */
package whoisright;

import classes.Person;

/**
 * Это главный класс программы тут будут вызываться все обьекты и их потоки
 *
 * @author lomov
 */
public class WhoIsRight {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Веган: ";
        String[] tatement1 = {"Я не ем мясо.", "Ненавижу сраных мясоедов.", "Веган сила!"};
        String name2 = "Гей: ";
        String[] tatement2 = {"Мальчиши карандаши.", "Сладкие мальчики.", "Мы за равные права!"};
        String name3 = "Гопник: ";
        String[] tatement3 = {"Поясни за шмот.", "Гоп стоп.", "Чё не по панятиям!"};

        System.out.println("Запуск срача.");
        Person vegan = new Person(name1, ANSI_GREEN, tatement1, Boolean.TRUE);
        Person gay = new Person(name2, ANSI_BLUE, tatement2, Boolean.TRUE);
        Person feminist = new Person(name3, ANSI_BLACK, tatement3, Boolean.TRUE);

        for (int i = 0; i < 10; i++) {
            System.out.println(ANSI_RED + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                System.out.println("У всех бомбануло.");
            }
        }
        
        vegan.setStart(Boolean.FALSE);
        gay.setStart(Boolean.FALSE);
        feminist.setStart(Boolean.FALSE);
        
        System.out.println("Завершение срача");
        System.out.println("*************************************************");
        System.out.println(vegan.getColor() + vegan.getName() + " набрал - " + vegan.getPoints() + " очков.");
        System.out.println(gay.getColor() + gay.getName() + " набрал - " + gay.getPoints() + " очков.");
        System.out.println(feminist.getColor() + feminist.getName() + " набрал - " + feminist.getPoints() + " очков.");
    }
}
