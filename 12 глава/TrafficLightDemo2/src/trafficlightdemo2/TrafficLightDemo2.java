package trafficlightdemo2;

/**
 * Упражнение 12.1 Имитация автоматизированного светофора с импользование
 * перечисления
 *
 * @author lomov
 */
public class TrafficLightDemo2 {

    private static final String ANSI_RED = "\u001B[31m";    //+
    private static final String ANSI_GREEN = "\u001B[32m";  //+
    private static final String ANSI_YELLOW = "\u001B[33m"; //+

    public static void main(String[] args) {

        TrafficalLightSimulator t1
                = new TrafficalLightSimulator(TrafficalLightColor.GREEN);

        for (int i = 0; i < 9; i++) {
            if(t1.tlc.ordinal() == 0)
                System.out.print(ANSI_RED);
            if(t1.tlc.ordinal() == 1)
                System.out.print(ANSI_GREEN);
            if(t1.tlc.ordinal() == 2)
                System.out.print(ANSI_YELLOW);
            
            System.out.println(t1.getColor());
            t1.waitForChange();

        }

        t1.cansel();
    }

}
