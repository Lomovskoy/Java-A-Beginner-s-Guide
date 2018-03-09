package methodrefdemo3;

/**
 * Использование ссылки на метод экземпляра для обращения
 * к любому интерфейсу
 * @author lomov
 */
public class MethodRefDemo3 {

    public static void main(String[] args) {
        
        boolean result;
        
        MyIntNum myNum1 = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        
        //Создать ссылку на inp экземплярный метод isFactor()
        MyIntNumPredicate inp = MyIntNum::isFactor; //Ссылка на метод любого 
                                                    //обьекта класса
        //Вызвать метод isFactor() для объекта myMun1
        result = inp.test(myNum1, 3);
        if (result) 
            System.out.println("3 является делителем " + myNum1.getNum());
        
        //Вызвать метод isFactor() для объекта myNum2
        if(!(inp.test(myNum2, 3)))
            System.out.println("3 не является делителем " + myNum2.getNum());
    }
    
}
