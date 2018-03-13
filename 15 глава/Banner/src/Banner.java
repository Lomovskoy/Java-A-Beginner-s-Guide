/**
 * Упражнение 15.1
 * 
 * Простой апплет банера.
 * 
 * В этом апплете создаётся поток, управляющий прокруткой
 * текста сообщения, хранящегося в переменной msg,
 * справа налево в локне аплета.
 */
import java.applet.Applet;
import java.awt.Graphics;

/*
  <applet code="Banner" width=300 height=50>
  </applet>
 */
public class Banner extends Applet implements Runnable{
    String msg = " Java правит интернетом ";
    Thread t;
    boolean stopFlag;

    //Этот метод вызывается первым
    @Override
    public void init() {
        // инициализация
        t = null;
    }

    //Этот метод вызывается вторым после метода init(). Он
    //Вызывается так же при каждом запуске аплета.
    @Override
    public void start() {
        //Запуск или возобновление выполнения потока
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    
    //Точка входа в поток,выполняющий анимацию банера
    @Override
    public void run() {
        //Перерисовать банер
        for( ; ; ){
            try{
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    break;
            }catch(InterruptedException e){
                
            }
        }
    }

    //Этот метод вызывается для приостановки аплета
    @Override
    public void stop() {
        //Приостановка выподлнения
        stopFlag = true;
        t = null;
    }

    //Этот метод вызывается для обновления данных в окне апплета.
    @Override
    public void paint(Graphics g) {
        //Перерисовка содержимого окна
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }

    //Этот метод выполняетсяпоследним для уничтожения апплета.
    @Override
    public void destroy() {
        //Выполнение завершающих дествий
    }
}
