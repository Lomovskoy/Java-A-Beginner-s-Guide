//Простой аплет отображающий текущее время
package clock;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/*
<object code="Clock" width=200 heidht=50>
</object>
*/
public class Clock extends Applet implements Runnable{
    String msg;
    Thread t;
    Calendar clock;
    boolean stopFlag;
    
    //Инициализировать аплет
    @Override
    public void init(){
        t = null;
        msg = "";
    }
    
    //Запустить поток
    @Override
    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    //Точка входа в поток, отображающий время
    @Override
    public void run() {
        //Повторно отобразить время
        for( ; ; ){
            try {
                repaint();
                Thread.sleep(1000);
                if(stopFlag)
                    break;
            } catch (InterruptedException e) {
            }
        }
    }
    
    //Приостановить поток
    @Override
    public void stop(){
        stopFlag = true;
        t = null;
    }
    
    //Отобразить время
    @Override
    public void paint(Graphics g){
 
        clock = Calendar.getInstance();
        clock.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        msg = "Текущее время: " + Integer.toString(clock.get(Calendar.HOUR));
        msg = msg + ":" + Integer.toString(clock.get(Calendar.MINUTE));
        msg = msg + ":" + Integer.toString(clock.get(Calendar.SECOND));
        g.drawString(msg, 30, 30);
    }
}
