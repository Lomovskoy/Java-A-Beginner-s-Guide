package autobox;

/**
 * Демонстрация автоупаковки и автораспаковки
 * @author lomov
 */
public class AutoBox {

    public static void main(String[] args) {
        
        Integer iOb = 100;  //Автоупаковка и последующая
        int i = iOb;        //автораспаковка значения 100
        
        System.out.println(i + " " + iOb);
    }
    
}
