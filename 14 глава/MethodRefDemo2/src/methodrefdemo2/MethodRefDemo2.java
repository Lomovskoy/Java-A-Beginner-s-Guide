package methodrefdemo2;

/**
 * Использование ссылки на метод экземпляра.
 * @author lomov
 */
public class MethodRefDemo2 {

    public static void main(String[] args) {
        boolean result;
        
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        
        //Создать ссылку ip на на метод isFactor()
        IntPredicate ip = myNum::isFactor;
        
        //Использовать ссылку для вызова метода isFactor()
        //через метод test
        result = ip.test(3);
        if (result) 
            System.out.println("3 является делителем " + myNum.getNum());
        
        //Создать ссылку на метод isFactor для объекта myNum2
        //и использовать её для вызова метода isFactor()
        //через метод test()
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) 
            System.out.println("3 не является делителем " + myNum2.getNum());
        
    }
    
}
