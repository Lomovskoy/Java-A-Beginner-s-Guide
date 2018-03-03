package wrap;

/**
 * Упаковка и распаковка значений в ручную
 * @author lomov
 */
public class Wrap {

    public static void main(String[] args) {
        
        Integer iOb = new Integer(100); //Упаковка значения 100
        
        int i = iOb.intValue();         //Распаковка значения 100
        
        System.out.println(i + " " + iOb);
        
    }
    
}
