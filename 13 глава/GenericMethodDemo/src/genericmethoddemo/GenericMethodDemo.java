package genericmethoddemo;

/**
 * Пример простого обощения метода
 * @author lomov
 */
public class GenericMethodDemo {

    //обощённый метод
    //Т наследуцет интерфайс Comparable опредеолённый в пакете java.leng
    //чтогарантирует что в метод можно передовать обьектыпопускаюшщие сравнение.
    static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] y){
        
        //Массивы, имеющие рахную длинну, не могут быть одинаковыми
        if(x.length != y.length)
            return false;
        
        for (int i = 0; i < x.length; i++) 
            if(!x[i].equals(y[i]))
                return false;//Массивы не равны
        
        return true;//Содержание массива совпадает
    }
   
    public static void main(String[] args) {
        
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 3, 4, 5, 6};
        
        if (arrayEqual(nums, nums)) 
            System.out.println("nums эквивалентен nums");
        
        if (arrayEqual(nums, nums2)) 
            System.out.println("nums эквивалентен nums2");
        
        if (arrayEqual(nums, nums3)) 
            System.out.println("nums эквивалентен nums3");
        
        if (arrayEqual(nums, nums4)) 
            System.out.println("nums эквивалентен nums4");
        
        //создать массив типа Double
        Double dvals[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        
        //Следующаястрока не будетскомпилированна
        //так как типы массивов не совпадают
        //if (arrayEqual(nums, dvals)) 
        //    System.out.println("nums эквивалентен nums4");
    }
    
}
