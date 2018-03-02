package enumdemo4;

/**
 * Использование методов osdinal() и compairTo()
 * @author lomov
 */
public class EnumDemo4 {

    public static void main(String[] args) {
        //Обьявление ссылки на перечисление Transport
        Transport tp, tp2, tp3;
       
        //Получить порядковы номера с помошью метода osdinal()
        System.out.println("Константы перечисления Transport и "
                + "их порядковые значения");
        for (Transport t : Transport.values()) 
            System.out.println(t + " " + t.ordinal());//получаем порядковый номер
        
        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;
        
        System.out.println();
        
        //Демонстрация использования метода compairTo()
        if (tp.compareTo(tp2) < 0) {
            System.out.println(tp + " идёт перед " + tp2);
        }
        if (tp.compareTo(tp2) > 0) {
            System.out.println(tp2 + " идёт перед " + tp);
        }
        if (tp.compareTo(tp3) == 0) {
            System.out.println(tp + " совпадает " + tp3);
        }
    }
    
}
