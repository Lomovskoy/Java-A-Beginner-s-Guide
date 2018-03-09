package lambdaargumentdemo;

/**
 *
 * @author lomov
 */
public class LambdaArgumentDemo {

    /**
     * В данном методе типом первого параметра является функциональный
     * интерфейс. Следовательно, ему можно передать ссылку на любой экземпляр
     * этого интерфейса, в том числе и на экземпляр, созданный посредством
     * лямбда-выражения. С помощью второго параметра задаётся строка, подлежащая
     * обработке.
     *
     * @param sf
     * @param s
     * @return
     */
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;

        System.out.println("Входная строка: " + inStr);

        /**
         * Определяется лямбда-выражение, распологающее содержимое строки в
         * обратном порядке, и присвойте его переменной, ссылающейся на
         * StringFunc
         */
        StringFunc revers = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        /**
         * Передайте revers методу changeStr() в качестве первого аргумента
         * Передайте входящую строку в качестве второго аргумента.
         */
        outStr = changeStr(revers, inStr);
        System.out.println("Обращённая строка: " + outStr);

        /**
         * Данное ламбда-выражение заменяет пробелы дефисами. Оно внедряется
         * непосредственно в вызов метода changeStr().
         */
        outStr = changeStr((str) -> str.replace(' ', '_'), inStr);
        System.out.println("Строка с заменёнными пробелами: " + outStr);

        /**
         * Данное блочное лямбда выражение обращает регистр букув в строке. Оно
         * также внедряется непосредственно в вызов метода changeStr().
         */
        outStr = changeStr((str) -> {
            String result = "";
            char ch;

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result += Character.toLowerCase(ch);
                } else {
                    result += Character.toUpperCase(ch);
                }
            }
            return result;
        }, inStr);
        
        System.out.println("Строка с заменёнными регистрами букв: " + outStr);
        
        /**
         * Данное лямбда-выражение удаляет все пробелы в строке 
         * и возвращает результат, передав его методу changeStr()
         */
        outStr = changeStr((str) -> str.replace(" ", ""), inStr);
        System.out.println("Строка с удалёнными пробелами: " + outStr);
    }

}
