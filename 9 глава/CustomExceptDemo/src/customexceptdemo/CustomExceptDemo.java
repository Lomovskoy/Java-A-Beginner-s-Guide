package customexceptdemo;

/**
 * Использование специально создаваемого исключения
 * @author lomov
 */
public class CustomExceptDemo {

    public static void main(String[] args) {
        
        //В массиве number содержатся целые числа
        int numer[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int demon[] = {2, 0, 4, 4, 0, 8};
        
    
        for(int i = 0; i < numer.length; i++){
            try{
                if((numer[i]%2) != 0)
                    throw new NonIntResultExeption(numer[i], demon[i]);
                
                System.out.println(numer[i] + " / " + demon[i] + " = " + numer[i] / demon[i]);
            }catch(ArithmeticException exc){
                //Перехватить исключение
                System.out.println("Попытка деления на ноль");
            }catch(ArrayIndexOutOfBoundsException exc){
                //Перехватить исключение
                System.out.println("Соответствующий элемент не найден");
            }catch(NonIntResultExeption exc){
                //Перехватить исключение
                System.out.println(exc);
            }
            
            
        }
    }
    
}
