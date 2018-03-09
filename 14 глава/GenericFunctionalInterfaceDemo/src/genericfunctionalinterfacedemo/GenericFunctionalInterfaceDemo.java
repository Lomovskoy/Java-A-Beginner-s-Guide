package genericfunctionalinterfacedemo;

/**
 * Использование обощённого функционального выражения
 * @author lomov
 */
public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {
        
        //Данное лямбда-выражение определяет, является ли
        //одно целое число делителем другого
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;
        
        if (isFactor.test(10, 2))
            System.out.println("2 является делителем 10");
        System.out.println();
        
        //Данное лямбда-выражение опредеяет, является ли
        //одно число типа Double делителем другого
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        
        if (isFactorD.test(212.0, 4.0))
            System.out.println("4 является делителем 212");
        System.out.println();
        
        //Данное лямбда-выражение определяет, является ли
        //одна строка частью другой
        SomeTest<String> isIn = (n, d) -> (n.indexOf(d)) != -1;
        
        String str = "Обощённый функционаьный интерфейс";
        
        System.out.println("Тестируемоя строка: " + str);
        
        if (isIn.test(str, "fase"))
            System.out.println("'fase' является частью " + str);
        else
            System.out.println("'fase' не является частью " + str);
        System.out.println();
    }
    
}
