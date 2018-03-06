package bondsdemo;

/**
 * Демонстрация класса NumericFns
 * @author lomov
 */
public class BondsDemo {

    public static void main(String[] args) {
        
        //Доступно, потому, что Integer является подклассом Number
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);
        
        System.out.println("Обратная величина iOb - " + iOb.reciprocal());
        System.out.println("Дробная часть iOb - " + iOb.fraction());
        
        System.out.println();
        
        //Применение класса Double также допустимо
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        
        System.out.println("Обратная величина dOb - " + dOb.reciprocal());
        System.out.println("Дробная часть dOb - " + dOb.fraction());
        
        //Следующая строчка не будет компилироваться, так как
        //класс String не являетсяпроизводным от класса Nunber
        //NumericFns<String> sOb = new NumericFns<String>("5");
    }
    
    
}
