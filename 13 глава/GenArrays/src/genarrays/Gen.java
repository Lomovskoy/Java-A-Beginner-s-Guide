package genarrays;

/**
 * Обощённыетипы и массивы
 * @author lomov
 * @param <T>
 */
public class Gen<T extends Number> {
    
    T ob;
    
    T vals[];//допустимо

    public Gen(T ob, T[] vals) {
        this.ob = ob;
        
        //Cледующие выражения недопустимы
        //this.vals = new T[10];
        //Невозможно создать массив типа Т
        
        //Однако такой оператор допустим, присвоение ссылки на
        //существуеющицйц массив допустим.
        this.vals = vals;
    }
    
    
}
