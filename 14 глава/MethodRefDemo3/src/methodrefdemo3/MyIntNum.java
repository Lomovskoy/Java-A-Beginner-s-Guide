package methodrefdemo3;

/**
 * Данный класс хранит значения типа int и определяет метод
 * isFactor(), который возвращает true, если его аргумент
 * является делителем числа, хранящегося в классе.
 * @author lomov
 */
public class MyIntNum {
    private int num;

    public MyIntNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    //Вернуть true, если n - делитель num
    boolean isFactor(int n){
        return (num % n) == 0;
    }
}
