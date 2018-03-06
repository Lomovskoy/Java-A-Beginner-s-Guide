package useboudedwildcard;

/**
 * Следующий пример классадемонстрирует типы обьектов класса Gen, 
 * которые могут переданы методу test()
 * @author lomov
 */
public class UseBoudedWildcard {

    /**
     * Здесь знак ? устанавливает соответствие
     * классу А или произвольным от него подклассам.
     * В объявлении этого метода используется
     * ограниченный метасимвольный аргумент
     * @param o 
     */
    static void test(Gen<? extends A> o){
        //Что бы определить нижнюю границу значений нуждно использовать
        //<? super подкласс>
    }
    
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        Gen<A> w = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);
        
        //Эти вызовы метода test() допустимы
        test(w);
        test(w2);
        test(w3);
        
        //Этот вызов метода test() не допустимы
        //так как обьект w4 не относится к подклассу A
        //test(w4);//Ошибка
    }
    
}
