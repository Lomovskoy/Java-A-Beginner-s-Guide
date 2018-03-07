/**
 * На массивы обощённого типа накладывается 2 существенных ограницения.
 * Во-первых, нельзя поулчить экземпляр массива, тип элементов которого 
 * опредлеляется параметром типа.
 * Во-вторых, нельзя создать массив обощённых ссылок на обьекты
 * конкретного типа. 
 */
package genarrays;

import java.util.Arrays;

public class GenArrays {

    public static void main(String[] args) {
        
        Integer n[] = {1, 2, 3, 4, 5};
        
        Gen<Integer> iOb = new Gen<>(50, n);
        
        //Невозможно создать массив обощённых ссылок
        //на обьект конкретного типа
        //Gen<Integer> gens[] = new Gen<Integer>[10];//Ошибка
        
        System.out.println(iOb.ob + " " + Arrays.deepToString(iOb.vals));
        //Следующее обьявление допустимо
        Gen<?> gens[] = new Gen<?>[10];
    }
    
}
