package genifdemo;

/** 
 * Реализовать интерфейс Containment с помощью массива,
 * предназначенного для хранения значений.
 * @author lomov
 * @param <T>
 */
public class MyClass<T> implements Containment<T>{
    // class MyClass implements Containment<Double>
    //Любой  класс, реализубщий обощённый интерфейс,
    //так же должен быть обощённым
    T[] arrayRef;

    public MyClass(T[] arrayRef) {
        this.arrayRef = arrayRef;
    }
    
    // Реализовать метод contains
    @Override
    public boolean contains(T o) {
        for (T x : arrayRef) 
            if (x.equals(o)) 
                return true;
        return false;
    }
}
