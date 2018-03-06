package simpgen;

/**
 * Просто обощённый класс с двумя параметрами типа: T и V
 * @author lomov
 */
public class TwoGen <T, V>{
    T ob1;
    V ob2;
    
    //Передать конструктору класса ссылки на объекты типов Т и V
    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    
    //Отобразить типы Т и V
    void showTypes(){
        System.out.println("Тип Т - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }
    
    T getOb1(){
        return ob1;
    }
    
    V getOb2(){
        return ob2;
    }
    
}
