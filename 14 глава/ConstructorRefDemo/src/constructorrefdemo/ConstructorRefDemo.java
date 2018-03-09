package constructorrefdemo;

/**
 * Демонстрация использования ссылок на конструкторы
 * @author lomov
 */
public class ConstructorRefDemo {

    public static void main(String[] args) {
        
        /**
         * Создать ссылку на конструктор myClass.
         * Поскольку метод func() интерфейса MyFunc принимает аргумент,
         * new ссылаетсяна параметризированный конструктор MyClass,
         * а не на конструктор по умолчанию.
         */
        MyFunc myClassCons = MyClass::new;//ССылка на конструктор
        
        //Создать экземпляр MyClassпосредством ссылки на конструктор
        MyClass mc = myClassCons.func("Тестирование");
        
        //Использовать только что созданный экземпляр MyClass
        System.out.println("Строка str в mc: " + mc.getStr());
    }
    
}
