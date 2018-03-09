package lambdademo3;

/**
 * Функциональный онтерфейс тестирующий две строки
 * @author lomov
 */
public class LambdaDemo3 {

    public static void main(String[] args) {
        
        //Данное лямбда выражение определяет, является ли
        //одна строка частью другой
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        
        String str = "Это тест";
        
        System.out.println("Тестируемая строка: " + str);
        
        if(isIn.test(str, "Это"))
            System.out.println("'Это' найдено");
        else
            System.out.println("'Это' не найдено");
        
        if(isIn.test(str, "хуз"))
            System.out.println("'хуз' найдено");
        else
            System.out.println("'хуз' не найдено");
    }
    
}
