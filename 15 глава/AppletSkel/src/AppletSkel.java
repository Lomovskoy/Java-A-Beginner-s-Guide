import java.applet.Applet;
import java.awt.Graphics;

/*
 <applet code="SimpleApplet" width=200 height=60>
 </applet>
*/
public class AppletSkel extends Applet {

    //Этот метод вызывается первым
    @Override
    public void init() {
        // инициализация
    }

    //Этот метод вызывается вторым после метода init(). Он
    //Вызывается так же при каждом запуске аплета.
    @Override
    public void start() {
        //Запуск или возобновление выполнения
    }

    //Этот метод вызывается для приостановки аплета
    @Override
    public void stop() {
        //Приостановка выподлнения
    }

    //Этот метод выполняетсяпоследним для уничтожения апплета.
    @Override
    public void destroy() {
        //Выполнение завершающих дествий
    }

    //Этот метод вызывается для обновления данных в окне апплета.
    @Override
    public void paint(Graphics g) {
        //Перерисовка содержимого окна
    }
    
}
