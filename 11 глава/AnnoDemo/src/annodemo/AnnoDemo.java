package annodemo;

/**
 * Пример использования аннотаций
 * @author lomov
 */
public class AnnoDemo {

    public static void main(String[] args) {
        
        MyClass myObj = new MyClass("тест");
        
        System.out.println(myObj.getMsg());
    }
    
}
