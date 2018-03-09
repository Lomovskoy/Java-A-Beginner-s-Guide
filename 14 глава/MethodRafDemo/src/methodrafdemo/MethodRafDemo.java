package methodrafdemo;

/**
 * Демонстрация использования ссылок на статичские методы.
 * @author lomov
 */
public class MethodRafDemo {

    /**
     * В данном методе типом первого параметра является
     * функциональный интерфейс. Следовательно, ему можно передать
     * ссылку на любой экземплят этого интерфейса, в том чиле и на 
     * экземпляр, созданный посредством ссылку на метод.
     * @param p
     * @param v
     * @return 
     */
    static boolean numTest(IntPredicate p, int v){
        return p.test(v);
    }

    public static void main(String[] args) {
        
        boolean result;
        
        //Здесь методу numTest() передаётся ссылка на метод isPrime()
        result = numTest(MyIntPredicate::isPrime, 17);
        if(result)
            System.out.println("17 - простое число");
        
        //Здесь методу numTest() передаётся ссылка на метод isEvent
        result = numTest(MyIntPredicate::isEvent, 12);
        if(result)
            System.out.println("12 - чётное число");
        
        //Здесь методу numTest() передаётся ссылка на метод isPositive
        result = numTest(MyIntPredicate::isPositive, 11);
        if(result)
            System.out.println("12 - положительное число");
    }
    
}
