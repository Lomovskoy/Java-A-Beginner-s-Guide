//Использование окна состояния
import java.applet.Applet;
import java.awt.Graphics;

/*
 <applet code="SimpleApplet" width=200 height=60>
 </applet>
*/
public class StatusWindow extends Applet {

    //Отобразить содержание переменной msg в окне аплета
    @Override
    public void paint(Graphics g) {
        //Перерисовка содержимого окна
        g.drawString("Это оконный апплет.", 10, 20);
        showStatus("Это показывается окно статуса.");
    }
    
}
