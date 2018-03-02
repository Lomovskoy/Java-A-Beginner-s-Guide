package quadratic;

/**
 * Нахождение корней квадратного уравнения
 * @author lomov
 */
public class Quadratic {

    public static void main(String[] args) {
        
        // a, b и c представляют коэфициенты квадратного
        // квадратного уравнения ax2 + bx + c =0
        double a, b, c, x;
        
        //Решить квадратное уравнение 4x2 + x - 3 = 0
        a = 4;
        b = 1;
        c = -3;
        
        //Найти первый корень
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * b * c)) / (2 * a);
        System.out.println("Первый корень: " + x);
        
        //Найти второй корень
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * b * c)) / (2 * a);
        System.out.println("Второй корень: " + x);
    }
    
}
