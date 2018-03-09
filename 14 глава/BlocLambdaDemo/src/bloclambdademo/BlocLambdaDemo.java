package bloclambdademo;

/**
 * Блочное лямбда-выражение
 * @author lomov
 */
public class BlocLambdaDemo {

    public static void main(String[] args) {
        
        //Данное блочнгое лямбда-выражеине возвращает наименьший
        //положительный делитель данного числа
        NumericFunc smallestF = (n) -> {
            int result = 1;
            
            //Получить обсалятное значение для n
            n = n < 0 ? -n: n;
            
            for (int i = 2; i < n/i; i++) 
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            return result;
        };
        
        System.out.println("Наименьшим делителем 12 является " + smallestF.func(12));
        System.out.println("Наименьшим делителем 11 является " + smallestF.func(11));
    }
    
}
