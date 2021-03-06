package autobox2;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * Автоупаковка и автораспаковка при передачые
 * параметров и возврате значений из методов
 * @author lomov
 */
public class AutoBox2 {
    
   //Этот метод принимает параметр типа Integer
    static void m(Integer v){//Поулчает Integer
        System.out.println("m() получил " + v);
    }

    //Этот метод возвращает параметр типа int
    static int m2(){//Возвращает int
        return 10;
    }
    
    //Этот метод возвращает параметр типа int
    static Integer m3(){// Возвращает Integer
        return 99;//Автоупаковка значение 99 в обьект Integer
    }
    
    public static void main(String[] args) {
        
        //Передача методу m() значения типа int.
        //Метод m() принимает переметр типа Integer
        //поэтому значение int автоматически упаковывается
        m(199);
        
        //Обьект iOb получает значение типа int, возвращаемое
        //методом m2(). Это значение автоматически упаковывается
        //что бы его можно было присвоить объекту iOb.
        Integer iOb = m2();
        System.out.println("Значение возвращённое из m2(): " + iOb);
        
        //Далее метод m3() ваозвращает значение типа Integer, которое
        //автоматически распаковывается и преобразуется в тип int.
        int i = m3();
        System.out.println("Значение возвращённое из m3(): " + i);
        
        //Далее методу Math.sqrt() в качестве параметра передаётся
        //объект iOb, в котором автоматически распаковывается, а его
        //значение повышается до типа double, требующегося для
        //выполнения данного метода
        iOb = 100;
        System.out.println("Корень квадрата из iOb = " + Math.sqrt(iOb));
    }
    
}
