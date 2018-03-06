package wildcarddemo;

/**
 * Использование шаблона аргумента
 * Шаблон аргумента ? позволяеь принимать несколько типов аргументов
 * в границе extends Number, и сравнивать их, в отличии от опператора
 * Т который позволядет принмимать 2 любых но одинаковых аргумента
 * и сравнивать их
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
    
    //Проверить равенство абсолютных значений 2х обьектов
    boolean absEqual(NumericFns<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}
