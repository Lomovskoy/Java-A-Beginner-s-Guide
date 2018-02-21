package rethrowdemo;

/**
 * Повторное генерирование исключений
 * @author imxo
 */
public class RethrowDemo {

    public static void main(String[] args) {
        
        try {
            Rethrow.genExeption();
        }catch(ArrayIndexOutOfBoundsException ехс) {
            // Повторно перехватить исключение сrенернровонноrо нскпючення
            System.out.println("Фaтaльнaя ошибка - " +
            "выполнение программы прервано!");
        }
    }
}
