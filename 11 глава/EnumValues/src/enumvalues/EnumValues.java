package enumvalues;

/**
 * Наппишите программу которая с помошью метода values
 * производит отображение констант и из значений
 * @author lomov
 */
public class EnumValues {

    public static void main(String[] args) {

        System.out.println("Константы Tools: ");
        
        for (Tools t : Tools.values())
            System.out.println(t + " имеет порядковое значение " + t.ordinal());

        
    }
    
}
