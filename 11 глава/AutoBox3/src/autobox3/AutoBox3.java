package autobox3;

/**
 * Автоупаковка и автораспаковка в выражених
 * @author lomov
 */
public class AutoBox3 {

    public static void main(String[] args) {
        
        Integer iOb, iOb2;
        int i;
        
        iOb = 99;
        System.out.println("Исходное значение iOb: " + iOb);
        
        //В следующем выражении iOb автоматически
        //распаковывается, производятся вычисления, а результат
        //снова упаковывется а обьект iOb
        ++iOb;
        System.out.println("После ++iOb: " + iOb);
        
        //Здесь выполняется автораспаковка объекта iOb,
        //к полученному значению прибавляется число 10,
        //а результат снова упаковываетсяф в обьект iOb
        iOb += 10;
        System.out.println("После iOb += 10: " + iOb);
        
        //Выполняется автораспаковка обьекта iOb, производится
        //вычисления, а результат снова упаковывается в обьект iOb
        
        iOb2 = iOb + (iOb / 3);
        System.out.println("После iOb2 = iOb + (iOb / 3): " + iOb2);
        
        //Вычисляется то же самое выражение, но
        //повторная упаковка не выполянется
        i = iOb + (iOb / 3);
        System.out.println("После i = iOb + (iOb / 3): " + i);
        
    }
    
}
