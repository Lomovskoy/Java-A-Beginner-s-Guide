package lambdarangedemo2;

/**
 * Составьте лямюбда-выражение, которое возваращает значение true, если число
 * принадлежит к диапазону чисел 1-20, включительно. Сойдайте функциональный 
 * интерфейс дял него.
 * @author lomov
 */
public class LambdaRangeDemo2 {

    public static void main(String[] args) {
        
        MyFunc isEven = (n) -> (n >= 10 & n <= 20);
        
        if(isEven.test(15))
            System.out.println("15 находится в диапазоне от 10 до 20");
        if(!isEven.test(5))
            System.out.println("5 не находится в диапазоне от 10 до 20");
    }
    
}
