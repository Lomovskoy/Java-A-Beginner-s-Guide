package usethrowaыemethods;

/**
 * Класс генерирующий исключение
 * @author imxo
 */
public class ExcTest {
    
    static void genException(){
        int nums[] = new int[4];
        System.out.println("Дo генерации исключения");
        
        // Сгенерировать исключение в связи с
        // выходом индекса за границы массива
        nums [7] = 10;
        System.out.println("Этa строка не будет отображаться");
    }
}
