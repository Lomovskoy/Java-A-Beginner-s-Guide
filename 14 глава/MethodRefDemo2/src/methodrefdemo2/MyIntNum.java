package methodrefdemo2;

/**
 * Данныйкласс хранит значения типа int и определяет метод
 * isFactor(), который возвращает значение true, еслиего аргумент
 * является делителем числа, хранящегося в классе
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
    
    //Возвратить true, если n делится на num
    boolean isFactor(int n){
        return (num % n) == 0;
    }
    
}
