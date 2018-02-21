package excdemol;

/**
 * Демонстрация обработки исключений
 * @author imxo
 */
public class ExcDemol {

    public static void main(String[] args) {
        
        int nums[] = new int[4];
        try{
            System.out.println("Дo генерации исключения");
            nums [7] = 10;
            System.out.println("Этa строка не будет отображаться");
        }catch (ArrayIndexOutOfBoundsException ехс) {
            System.out.println("Bыxoд за границы массива!");
        }
        System.out.println("Пocлe оператора catch");
    } 
}
