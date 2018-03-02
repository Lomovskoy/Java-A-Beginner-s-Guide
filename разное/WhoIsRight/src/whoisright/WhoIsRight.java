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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static javafx.scene.input.KeyCode.V;

/**
 * Это главный класс программы тут будут вызываться все обьекты и их потоки
 *
 * @author lomov
 */
public class WhoIsRight {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";  //+
    private static final String ANSI_RED = "\u001B[31m";    //+
    private static final String ANSI_GREEN = "\u001B[32m";  //+
    private static final String ANSI_YELLOW = "\u001B[33m"; //+
    private static final String ANSI_BLUE = "\u001B[34m";   //+
    private static final String ANSI_PURPLE = "\u001B[35m"; //+
    private static final String ANSI_CYAN = "\u001B[36m";   //+
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
        String name4 = "Феменистка: ";
        String[] tatement4 = {"Не служэил не мужик.", "Объюзинг, объюзинг!", "Организаторша."};
        String name5 = "Ватник: ";
        String[] tatement5 = {"Многоходовочка.", "Слава Русси.", "Крым нашь!"};
        String name6 = "Дагестанец: ";
        String[] tatement6 = {"Аллаху акбар.", "Куйран байран дорогой.", "Слыш дорогой, аца-ца-ца-ца-ца!"};
        String name7 = "Мясоед: ";
        String[] tatement7 = {"Я мужик и ем мясо.", "Хожу на охоту потому, что жизнь такая.", "Если коров не есть они умрут!"};
        

        System.out.println("\t\t ***************************** Запуск срача. ***************************** ");
        Person vegan = new Person(name1, ANSI_GREEN, tatement1, Boolean.TRUE);
        Person gay = new Person(name2, ANSI_CYAN, tatement2, Boolean.TRUE);
        Person redNeck = new Person(name3, ANSI_BLACK, tatement3, Boolean.TRUE);
        Person feminist = new Person(name4, ANSI_PURPLE, tatement4, Boolean.TRUE);
        Person patriot = new Person(name5, ANSI_RED, tatement5, Boolean.TRUE);
        Person immigrant = new Person(name6, ANSI_YELLOW, tatement6, Boolean.TRUE);
        Person men = new Person(name7, ANSI_BLUE, tatement7, Boolean.TRUE);

        for (int i = 0; i < 60; i++) {
            //System.out.println(ANSI_RED + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                System.out.println("У всех бомбануло.");
            }
        }
        
        vegan.setStart(Boolean.FALSE);
        gay.setStart(Boolean.FALSE);
        redNeck.setStart(Boolean.FALSE);
        feminist.setStart(Boolean.FALSE);
        patriot.setStart(Boolean.FALSE);
        immigrant.setStart(Boolean.FALSE);
        men.setStart(Boolean.FALSE);
                
        System.out.println("\t\t ***************************** Конец срача. ***************************** ");
        System.out.println(vegan.getColor() + vegan.getName() + " набрал:\t\t" + vegan.getPoints() + " очков.");
        System.out.println(gay.getColor() + gay.getName() + " набрал:\t\t" + gay.getPoints() + " очков.");
        System.out.println(redNeck.getColor() + redNeck.getName() + " набрал:\t" + redNeck.getPoints() + " очков.");
        System.out.println(feminist.getColor() + feminist.getName() + " набрал:\t" + feminist.getPoints() + " очков.");
        System.out.println(patriot.getColor() + patriot.getName() + " набрал:\t" + patriot.getPoints() + " очков.");
        System.out.println(immigrant.getColor() + immigrant.getName() + " набрал:\t" + immigrant.getPoints() + " очков.");
        System.out.println(men.getColor() + men.getName() + " набрал:\t" + men.getPoints() + " очков.");
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(vegan.getName(), vegan.getPoints());
        map.put(gay.getName(), gay.getPoints());
        map.put(redNeck.getName(), redNeck.getPoints());
        map.put(feminist.getName(), feminist.getPoints());
        map.put(patriot.getName(), patriot.getPoints());
        map.put(immigrant.getName(), immigrant.getPoints());
        map.put(men.getName(), men.getPoints());
        
        System.out.println("\t\t ***************************** Победил. ***************************** ");
        
        //Intager
        
        //for(Map.Entry<String, Integer> item : map.entrySet()){
        
            
           //System.out.printf("Ключ: " + item.getKey() + "  Значение: " + item.getValue() + " \n");
        //}
            
    }
}
