package throwdemo;

/**
 * Генерирование исключения вручную
 * @author imxo
 */
public class ThrowDemo {

    public static void main(String[] args) {
        
        try {
            System.out.println("Дo оператора throw");
            throw new ArithmeticException();
        }catch (ArithmeticException ехс) {
            // Перехватить исключение
            System.out.println("Иcключeниe перехвачено");
        }
        System.out.println("Пocлe блока try/catch");
    }
}
