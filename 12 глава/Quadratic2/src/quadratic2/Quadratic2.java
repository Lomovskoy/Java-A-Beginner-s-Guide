package quadratic2;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Использование статического импорта для
 * помещения метода sqrt() и pow() в облать видимости
 * @author lomov
 */
public class Quadratic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // a, b и c представляют коэфициенты квадратного
        // квадратного уравнения ax2 + bx + c =0
        double a, b, c, x;
        
        //Решить квадратное уравнение 4x2 + x - 3 = 0
        a = 4;
        b = 1;
        c = -3;
        
        //Найти первый корень
        x = (-b + sqrt(pow(b, 2) - 4 * a * b * c)) / (2 * a);
        System.out.println("Первый корень: " + x);
        
        //Найти второй корень
        x = (-b - sqrt(pow(b, 2) - 4 * a * b * c)) / (2 * a);
        System.out.println("Второй корень: " + x);
    }
    
}
