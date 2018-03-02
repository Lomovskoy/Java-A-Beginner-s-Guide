package enumdemo2;

/**
 * Использование перечисления enum
 * @author lomov
 */
public class EnumDemo2 {

    public static void main(String[] args) {
        //Обьявление ссылки на перечисление Transport
        Transport tp;

        System.out.println("Константы Transport: ");
        
        //Применение метода value()
        Transport allTransport[] = Transport.values();//Получение массива констант типа Transport
        for (Transport t : allTransport)
            System.out.println(t);
        
        /*for (Transport t : Transport.values())
            System.out.println(t);*/
        
        System.out.println();
        
        //Применение метода valueOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp содержит " + tp);
    }
    
}
