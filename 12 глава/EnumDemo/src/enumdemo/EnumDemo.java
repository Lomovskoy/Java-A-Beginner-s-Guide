package enumdemo;

/**
 * Использование перечисления enum
 * @author lomov
 */
public class EnumDemo {

    public static void main(String[] args) {
        //Обьявление ссылки на перечисление Transport
        Transport tp;
        //Присвоение переменной tp, значение в виде константы AIRPLANE
        tp = Transport.AIRPLANE;
        
        //Отобразить перечислимое значение
        System.out.println("Значение tp = " + tp + "\n");
        //Проверка равенства 2х обьектов Transport
        tp = Transport.TRAIN;
        
        //Сравнение двух перечисляемых значение
        if(tp == Transport.TRAIN)
            System.out.println("tp содержит TRAIN");
        
        //Использование перечисления для управления оператором switch
        switch(tp){
            case CAR:
                System.out.println("Автомобиль перевозит людей");
                break;
            case TRUCK:
                System.out.println("Грузовик перевозит груз");
                break;
            case AIRPLANE:
                System.out.println("Самолёт летит");
                break;
            case TRAIN:
                System.out.println("Поезд движется по рельсамй");
                break;
            case BOAT:
                System.out.println("Лодка плывёт по воде");
                break;
        }
    }
    
}
