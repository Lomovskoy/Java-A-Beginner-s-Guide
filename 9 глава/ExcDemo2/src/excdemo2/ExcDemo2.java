package excdemo2;

/**
 * Исключение может быть сгенерировано одним методом,
 * а перехвачено другим
 * @author imxo
 */
public class ExcDemo2 {

    public static void main(String[] args) {
        
        try {
            ExcTest.genException();
            // А здесь исключение перехватывается
        }catch (ArrayIndexOutOfBoundsException ехс) { 
            System.out.println("Bыxoд за границы массива!");
            System.out.println("Пocлe оператора catch");
        }
    }
}
