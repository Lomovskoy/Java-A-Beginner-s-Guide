package constructorrefdemo;

/**
 * 
 * @author lomov
 */
public class MyClass {
    private String str;
    
    //Этот конструктор принимает аргумент
    public MyClass(String str) {
        this.str = str;
    }
    
    //Это конструктор по умолчению
    public MyClass() {
        this.str = "";
    }
    
    //...

    public String getStr() {
        return str;
    }

}
