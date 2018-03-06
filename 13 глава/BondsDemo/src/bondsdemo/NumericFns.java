package bondsdemo;

/**
 * В этой версии класса NumericFns арнументом типа,
 * заменяющим параметр типа Т, должен стать класс Number
 * или производный от него подкласс, как показанно нижу.
 * @author lomov
 */
public class NumericFns <T extends Number>{
    
    T num;

    //Передать конструктору ссылку на числово обьект
    public NumericFns(T num) {
        this.num = num;
    }
    
    //Вернуть обратную величину
    double reciprocal(){
        return 1 / num.doubleValue();
    }
    
    //Вернутьт дробную часть
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
}
