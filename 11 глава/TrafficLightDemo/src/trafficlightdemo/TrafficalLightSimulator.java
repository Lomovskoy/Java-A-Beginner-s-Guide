package trafficlightdemo;

/**
 * Имитация автоматизации светофора
 * @author lomov
 */
public class TrafficalLightSimulator implements Runnable{
    
    private Thread thrd;            //поток для имитации световора
    private TrafficalLightColor tlc;//текущий цвет светофора
    boolean stop = false;           //для остановки имитации установить true
    boolean changed = false;        //true, если светофор переключается

    public TrafficalLightSimulator(TrafficalLightColor tlc) {
        this.tlc = tlc;
        
        thrd = new Thread(this);
        thrd.start();
    }

    public TrafficalLightSimulator() {
        tlc = TrafficalLightColor.RED;
        
        thrd = new Thread(this);
        thrd.start();
    }

    //Запуск имитауции автоматизированного светофора
    @Override
    public void run() {
        while (!stop) {            
            try {
                switch(tlc){
                    case GREEN:
                        Thread.sleep(10000);//зелёный на 10 секунд
                        break;
                    case YELLOW:
                        Thread.sleep(2000);//жёлтый на 2 секунды
                        break;
                    case RED:
                        Thread.sleep(12000);//красный на 12 сеекунд
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }
    
    //Переключение цвета светофора
    synchronized void changeColor(){
        
        switch(tlc){
            case RED:
                tlc = TrafficalLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficalLightColor.RED;
                break;    
            case GREEN:
                tlc = TrafficalLightColor.YELLOW;           
        }
        
        changed = true;
        notify();//уведомить о переключении цвета светофора
    }
    
    //Ожидании переключения цвета светафора
    synchronized void waitForChange(){
        try {
            while (!changed)                
                wait();//ожидать переключения цвета светофора
            
            changed = false;
        } catch (InterruptedException e) {
                System.out.println(e);
        }
    }
    
    //Возврат текущего цвета
    TrafficalLightColor getColor(){
        return tlc;
    }
    
    //Прекращение имитации светафора
    void cansel(){
        stop = true;
    }
    
}
