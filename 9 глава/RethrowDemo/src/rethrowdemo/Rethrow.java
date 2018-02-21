package rethrowdemo;

/**
 * Ниже приведен пример программы, демонстрирующий повторное генерирование исключений.
 * @author imxo
 */
public class Rethrow {
    
    public static void genExeption() {
        
        // Длина массива numer превышает длину массива denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        
        for(int i=0; i < numer.length; i++){
            try {
                System.out.println(numer[i] + " / " + denom[i] + " равно " +
                    numer[i]/denom[i]);
            }catch (ArithmeticException ехс) {
                // Перехватить исключение
                System.out.println("Пoпыткa деления на нуль");
            }catch (ArrayIndexOutOfBoundsException ехс) {
                // Перехватить исключение
                System.out.println("Cooтвeтcтвyющий элемент не найден");
                throw ехс; // повторно сгенерировать исключение
            }
        }
    }
}
