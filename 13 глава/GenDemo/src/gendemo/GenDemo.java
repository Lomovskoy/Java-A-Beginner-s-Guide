package gendemo;

/**
 * Демонстрация исчпользования обощённого класса
 * @author lomov
 */
public class GenDemo {

    public static void main(String[] args) {
        
        //Создать ссылку на объект типа Gen<Intager>
        Gen<Integer> iOb;
        
        //Создать объект типа Gen<Integer> и присвоить ссылку на 
        //него переменной iOb. Обратите внимание на автоупаковку при
        //инкапсуляции значения 88 в обьекте типа Intager
        iOb = new Gen<Integer>(88);
        
        //Отобразить тип данных, используемых в обьекте iOb
        iOb.showTipe();
        
        //Получить значения из объекта iOb. Обратите внимание
        //на то, что приведение типов хдесь не требуется
        int v = iOb.getOb();
        System.out.println("значение: " + v);
        
        System.out.println();
        
        //Создать обьект типа Gen для строк
        Gen<String> strOb = new Gen<String>("Тестирование обощений");
        
        //Отобразить тип данных, используемых в обьекте iOb
        strOb.showTipe();
        
        //Получить значения из объекта iOb. Обратите внимание
        //на то, что приведение типов хдесь не требуется
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
    
}
