package annodemo;

/**
 *  Пометить класс как не рекомендуемый к применению
 * @author lomov
 */
@Deprecated
public class MyClass {
    
    private String msg;

    public MyClass(String msg) {
        this.msg = msg;
    }
    
    @Deprecated
    public String getMsg() {
        return msg;
    }
    //...
}
