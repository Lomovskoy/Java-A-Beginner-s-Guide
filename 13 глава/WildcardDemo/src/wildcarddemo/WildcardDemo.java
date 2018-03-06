package wildcarddemo;

/**
 * Демонстрация использования шаблона аргумента
 * @author lomov
 */
public class WildcardDemo {

    public static void main(String[] args) {
        
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<Long>(5L);
        
        System.out.println("Сравнение iOb и dOb: " + iOb.num + " и " + dOb.num);
        if(iOb.absEqual(dOb))
            System.out.println("Обсалютные значения совпадают");
        else
            System.out.println("Обсалютные значения отличаются");
        
        System.out.println();
        
        System.out.println("Сравнение iOb и lOb: " + iOb.num + " и " + lOb.num);
        if(iOb.absEqual(lOb))
            System.out.println("Обсалютные значения совпадают");
        else
            System.out.println("Обсалютные значения отличаются");
        
    }
    
}
