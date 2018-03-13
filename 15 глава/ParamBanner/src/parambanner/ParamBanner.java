/*
 * Простой апплет отобращающий баннер
 * с использованием параметров
 */
package parambanner;


import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="ParamBanner" width=300 height=50>
<param name=message value=" Мне нравится Java! ">
<param name=delay value=500>
</applet>
 */
public class ParamBanner extends Applet implements Runnable {

    String msg;
    int delay;
    Thread t;
    boolean stopFlag;

    //Инициализировать переменную tзначением null
    @Override
    public void init() {
        String temp;

        msg = getParameter("message");
        if (msg == null) {
            msg = "Java правит интернетом ";
        }

        temp = getParameter("delay");

        try {
            if (temp != null) {
                delay = Integer.parseInt(temp);
            } else {
                delay = 250;   //Если параметр не задан, 
            }                                //используется значение по умолчанию
        } catch (NumberFormatException e) {
            delay = 250;    //Если допущена ошибка,
            //используется значение по умолчанию
        }
        t = null;
    }

    //Запустить поток
    @Override
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    //Точка входа в поток, манипулирующий крупным заголовком
    @Override
    public void run() {
        char ch;

        //Повторное отображения банера
        for ( ; ; ) {
            try {
                repaint();
                Thread.sleep(delay);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                if (stopFlag) 
                    break;
            } catch (InterruptedException e) {
            }
        }
    }
    
    //Приостановить баннер
    @Override
    public void stop(){
        stopFlag = true;
    }
    
    //Отобразить баннер
    @Override
    public void paint(Graphics g){
        g.drawString(msg, 50, 30);
    }
}
