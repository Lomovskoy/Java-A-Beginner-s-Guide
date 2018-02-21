package defaultmethoddemo;

import implementation.MyIFimp;
import implementation.MyIFimp2;
import interfaces.MyIF;

/**
 * Использование интерфейсного метода по умолчанию
 * @author imxo
 */
public class DefaultMethodDemo {

    public static void main(String[] args) {
        
        MyIFimp obj = new MyIFimp();
        
        // Вызов метода getUserID() возможен, поскольку он явно
        // реализован классом MyIFimp
        System.out.println("Идeнтификaтop пользователя " +
            obj.getUserID());
        // Вызов метода getAdminID() также возможен, поскольку
        // предоставляется его реализация по умолчанию
        System.out.println("Идeнтификaтop администратора: " +
            obj.getAdminID());
       
        MyIFimp2 obj2 = new MyIFimp2();
       
        //Предоставляются реализации обоих методов -
        // getUserID() и getAdminID()
        System.out.println("Идeнтификaтop пользователя " +
            obj2.getUserID());
        System.out.println("Идeнтификaтop администратора: " +
            obj2.getAdminID());
        
        int uID = MyIF.getUniversalID();
        System.out.println(uID);
    }
    
}
