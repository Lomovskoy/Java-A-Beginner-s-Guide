package threadcom;

/**
 * Это класс имитации часов
 *
 * @author lomov
 */
public class TickTock {

    String state;//Содержит сведения о состоянии часов

    synchronized void tick(boolean running) {

        if (!running) {//остановить часы
            state = "ticked";
            notify();//увыедомить ожидающие потоки
            return;
        }

        System.out.print("Tick ");
        state = "ticked";//установить текущее состояние после такта "Tick"

        notify();//позволить выполняться методу tock()

        try {
            while (!state.equals("tocked"))
                wait();//ожидание завершения потока от tock()
        } catch (InterruptedException e) {
            System.out.println("Прерывание потока");
        } 
    }
    
    synchronized void tock(boolean running){
        
        if (!running) {//остановить часы
            state = "tocked";
            notify();//увыедомить ожидающие потоки
            return;
        }
        
        System.out.println("Tock");
        state = "tocked";//установить текущее состояние после такта "Tock"
        
        notify();//позволить выполняться методу tick()
        
        try {
            while (!state.equals("ticked")) 
                wait();//ожидание завершения потока от tick()
        } catch (InterruptedException e) {
            System.out.println("Прерывание потока");
        } 
    }
}
