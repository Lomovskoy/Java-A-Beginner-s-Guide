package multicatch;

/**
 * Использование средства групового перехвата исключений
 * Примечание: для компиляции этого кода требуется JDK7
 * или более поздняя версия комплекта разработки
 * @author lomov
 */
public class MultiCatch {

    public static void main(String[] args) {
        
        int a = 88, b = 0;
        int result;
        char cgrs[] = {'A', 'B', 'C'};
        
        for (int i = 0; i < 2; i++) {
            try{
                if(i == 0)
                    //Сгенерировать исключение ArithmeticException
                    result = a/b;
                else
                    //Сгенерировать исключение ArrayIndexOutOfBoundsException
                    cgrs[5] = 'X';
            }
            //В этом операторе catch организуется перехват
            //обоих исключений
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Перехвачено исключение :" + e);
            }
        }
        System.out.println("Конец цикла");
    }
    
}
