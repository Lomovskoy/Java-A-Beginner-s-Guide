package usethrowaыemethods;

/**
 * Использование методов класса ThrowaЫe
 * @author imxo
 */
public class UseThrowaЫeMethods {

    public static void main(String[] args) {
        
        try {
            ExcTest.genException();
        }catch (ArrayIndexOutOfBoundsException ехс) {
            
            // перехватить исключение
            System.out.println("Cтaндapтнoe сообщение: ");
            System.out.println(ехс);
            System.out.println("\nCтeк вызовов: ");
            ехс.printStackTrace();
        }
        System.out.println("Пocлe оператора catch");
    }
    
}
