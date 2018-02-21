package nesttrys;

/**
 * Использование вложенных блоков try
 * @author imxo
 */
public class NestTrys {

    public static void main(String[] args) {
        
        // Длина массива nurner превЬШiает длину массива denorn
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 } ;
        int denom [] = { 2, 0, 4 , 4 , 0, 8 } ;
        
        try { // внешний блок try Вnоженные бnокн try
            for(int i=0; i<numer.length; i++){
                try { // внутренний блок try
                   System.out.println(numer[i] + " / " +
                        denom[i] + " равно " +
                        numer[i]/denom[i]); 
                }catch (ArithmeticException ехс){
                    // Перехватить исключение
                    System.out.println("Пoпыткa деления на нуль");
                }
            }
        }catch (ArrayIndexOutOfBoundsException ехс){
            // Перехватить исключение
            System.out.println("Cooтвeтcтвyющий элемент не найден");
            System.out.println("Фaтaльнaя ошибка - выполнение программы прервано!");
        }
    }
}
