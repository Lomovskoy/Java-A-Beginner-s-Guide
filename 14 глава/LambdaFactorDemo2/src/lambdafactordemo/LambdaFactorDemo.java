package lambdafactordemo;

/**
 * Напишите блочное лямбда выражение отдающее факториал переданного ему числа
 *
 * @author lomov
 */
public class LambdaFactorDemo {

    public static void main(String[] args) {

        MyFunc<Long> fact = (n) -> {

            long ret = 1;
            for (int i = 1; i <= n; ++i) {
                ret *= i;
            }
            return ret;

            //рекурсивный метод
            //if (n == 0) {
            //    return 1;
            //}
            //return n * factorial(n-1);
        };
        
        System.out.println("Факториал числа 4 = " + fact.func(4L));
        
        System.out.println("Факториал числа -4 = " + fact.func(-4L));
        
        System.out.println("Факториал числа 8 = " + fact.func(12L));
    }

}
