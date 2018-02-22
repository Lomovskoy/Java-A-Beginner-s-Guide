/*
    Реализация использования инфтерфейсов 
    интерфейс Series и реализующие его методцы
*/

package seriesdemo;

import classes.ByTows;

public class SeriesDemo {

    public static void main(String[] args) {
        ByTows ob = new ByTows();
        
        for(int i=0; i < 5; i++)
            System.out.println("Следющее значение: " + ob.getNext());
        
        System.out.println("\nСброос");
        ob.reset();
        
        for(int i=0; i < 5; i++)
            System.out.println("Следющее значение: " + ob.getNext());
        
        
        System.out.println("\nНачальное значение: 100");
        ob.setStart(100);
        
        for(int i=0; i < 5; i++)
            System.out.println("Следющее значение: " + ob.getNext());
    }
    
}
