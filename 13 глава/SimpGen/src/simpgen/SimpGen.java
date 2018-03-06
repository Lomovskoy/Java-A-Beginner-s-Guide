package simpgen;

/**
 * Демонстрация класса TwoGen
 * @author lomov
 */
public class SimpGen {

    public static void main(String[] args) {
        
        //Передача типа Integer параметру Т и типа String параметру V
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обощения");
        
        //Отобразить типы
        tgObj.showTypes();
        
        //Получить и отобразить значения
        int v = tgObj.getOb1();
        System.out.println("значение: " + v);
        
        String str = tgObj.getOb2();
        System.out.println("значение: " + str);
    }
    
}
