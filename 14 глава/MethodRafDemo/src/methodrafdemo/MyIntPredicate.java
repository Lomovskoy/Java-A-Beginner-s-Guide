package methodrafdemo;

/**
 * Данный класс определяет 3 статических метода, которые
 * проверяют соответсвие целого числа определённым условиям
 * @author lomov
 */
public class MyIntPredicate {
    
    //Статический метод, который возвращает true, если
    //заданное число простое
    static boolean isPrime(int n){
        if(n < 2) 
            return false;
        for (int i = 2; i < n/i; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    //Статический метод, который возвращает true, если
    //заданное число чётное
    static boolean isEvent(int n){
        return (n % 2) == 0;
    }
    
    //Статический метод, который возвращает true, если
    //заданное число положительное
    static boolean isPositive(int n){
        return n > 0;
    }
}
