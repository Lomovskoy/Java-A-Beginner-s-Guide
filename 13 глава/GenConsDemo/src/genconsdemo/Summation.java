package genconsdemo;

/**
 * Использовние обобщённого конструктора
 * @author lomov
 */
public class Summation {
    
    private int sum;

    //Обощённый конструктор
    <T extends Number> Summation(T arg) {
        sum = 0;
        
        for (int i = 0; i < arg.intValue(); i++) {
            sum+=1;
        }
    }
    
    int getSum(){
        return sum;
    }
}
