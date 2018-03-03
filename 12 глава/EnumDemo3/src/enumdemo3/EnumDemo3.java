package enumdemo3;

/**
 * Использование перечисления enum
 * @author lomov
 */
public class EnumDemo3 {

    public static void main(String[] args) {
        //Обьявление ссылки на перечисление Transport
        Transport tp;
        
        //Отобразить скорость самолёта\
        System.out.println("Типичная скорость самолёта: " + 
                Transport.AIRPLANE.getSpeed() + " миль в час\n");
        
        //Отобразить все виды транспорта и их скорости
        System.out.println("Типичные скорости движения транспортных средств");
        
        for (Transport t : Transport.values()) 
            System.out.println(t + ": " + t.getSpeed() + " миль в час");
        
    }
}
