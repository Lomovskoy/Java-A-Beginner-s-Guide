package constructorrefdemo;

/**
 * MyFunc - функциональный интерфейс, метод которого
 * выозвращает ссылку на MyClass
 * @author lomov
 */
public interface MyFunc {
    MyClass func(String s);
}
