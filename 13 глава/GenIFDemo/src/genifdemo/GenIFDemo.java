package genifdemo;

/**
 * Демонстрация использования обощенного интерфейса
 * @author lomov
 */
public class GenIFDemo {

    public static void main(String[] args) {
        
        Integer x[] = {1, 2, 3};
        
        MyClass<Integer> ob = new MyClass<Integer>(x);
        
        if(ob.contains(2))
            System.out.println("2 содержится в ob");
        else
            System.out.println("2 не содержится в ob");
        
        if(ob.contains(5))
            System.out.println("5 содержится в ob");
        else
            System.out.println("5 не содержится в ob");
        
        //Следующие строки кода недопустимы, так как обьект ob
        //является вариантом реализации интерфейса Containment для
        //типа Integer, а значение 9.25 другого типа
        //if(ob.contains(9.25))
        //    System.out.println("9.25 не содержится в ob");
    }
    
}
