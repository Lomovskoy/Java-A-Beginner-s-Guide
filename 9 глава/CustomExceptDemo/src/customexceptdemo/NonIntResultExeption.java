package customexceptdemo;

/**
 * Создать исключение
 * @author lomov
 */
public class NonIntResultExeption extends Exception{
    
    int n;
    int d;

    public NonIntResultExeption(int n, int d) {
        this.n = n;
        this.d = d;
    }
    
    public String toString(){
        return "Результат операции " + n + " / " + d + " не является целым числом.";
    }
}
