package lambdaexeptiondemo;

/**
 * Генерация исключений в лямбда-выражением
 * @author lomov
 */
public class LambdaExeptionDemo {

    public static void main(String[] args) {
        
        double[] values = {1.0, 2.0, 3.0, 4.0};
        
        /**
         * Данное блочное лямбда-выражение может генерировать
         * исклдючение IOExeption. Следовательно, это исключение
         * должно быть указанно в операторе trows метода
         * ioAction() функционального интерфейса MyIOAction.
         */
        MyIOAction myIO = (rdr) -> {//ДАННОЕ ЛЯМБДА-ВЫРАЖЕНИЕ МОДЕТ ГЕНЕРИРОВАТЬ ИСКЛЮЧЕНИЕ
            int ch = rdr.read();//Модет генерировать исключение IOExeption
            
            //...
            return true;
        };
    }
    
}
