package usepredicateinterfase;

import java.util.function.Predicate;

/**
 * Использование вустроенного функционального интерфейса Predicate
 * @author lomov
 */
public class UsePredicateInterfase {

    public static void main(String[] args) {
        
        //Данно лямбда-выражение использует интерфейс
        //Predicate<Integer> для определения того, чётно ли
        //задангое число
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;
        
        if(isEven.test(4))
            System.out.println("4 - чётное число");
        if(!isEven.test(5))
            System.out.println("5 - не чётное число");
    }
    
}
