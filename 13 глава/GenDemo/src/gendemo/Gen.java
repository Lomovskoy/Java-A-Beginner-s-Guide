package gendemo;

/**
 * Простой обощённый класс.
 * Здесь Т - это параметр типа, вместо которого
 * при создании обьекта класса Gen будет подставляться
 * реально существующий тиип.
 * 
 * @author lomov
 * @param <T>
 */
public class Gen <T>{//Т значит обощённый тип
    
    //Обьявление обьекта типа Т
    T ob;

    //Передать конструктору ссылку на обьект типа Т
    public Gen(T ob) {
        this.ob = ob;
    }
    
    //Вернуть обьект ob из метода
    public T getOb() {
        return ob;
    }
    
    //Отобразить тип обьекта Т
    void showTipe(){
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}
