package excdemo3;

/**
 * Корректная обработка исключения и продолжение выполнения программы
 * @author imxo
 */
public class ExcDemo3 {

    public static void main(String[] args) {
        
        int numer[] = { 4, 8, 16, 32, 64, 128 };
        int denom[] = { 2, 0, 4, 4, 0, 8 } ;
        
        for(int i=0; i<numer.length; i++)
        try {
            System.out.println(numer[i] + " / " +
            denom[i] + " равно " +
            numer[i]/denom[i]);
        }catch (ArithmeticException ехс) {
            // Перехватить исключение
            System.out.println("Пoпыткa деления на нуль!");
        }
    }
    
}
