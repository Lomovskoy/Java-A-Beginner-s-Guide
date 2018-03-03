package trafficlightdemo2;

/**
 * Перечисления цветов светофора
 * @author lomov
 */
public enum TrafficalLightColor {
    RED(10000), GREEN(10000), YELLOW(2000);
    
    //Добавдение переменной экземпляра
    private int time;
    
    //конструктор
    private TrafficalLightColor(int time) {
        this.time = time;//Добавление конструктора
    }
    
    //метод получения
    public int getSpeed() {
        return time;
    }
}
