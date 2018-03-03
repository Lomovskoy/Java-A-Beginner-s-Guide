package trafficlightdemo;

/**
 * Упражнение 12.1
 * Имитация автоматизированного светофора
 * с импользование перечисления
 * 
 * @author lomov
 */
public class TrafficLightDemo {

    public static void main(String[] args) {
        
        TrafficalLightSimulator t1 = 
                new TrafficalLightSimulator(TrafficalLightColor.GREEN);
        
        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
           
        t1.cansel();
    }
    
}
