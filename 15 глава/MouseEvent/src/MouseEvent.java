//Демонстрация обратоки событий мыши
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

/*
  <applet code="MouseEvent" width=300 height=100>
  </applet>
 */
public class MouseEvent extends Applet 
        implements MouseListener, MouseMotionListener{

    String msg = "";
    int mouseX = 0, mouswY = 0;

    @Override
    public void init() {
        //Регистрация класса в качестве слушателя событий
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    //Обработчик события целчка мышью
    public void mouseCliked(MouseEvent me){
        mouseX = 0;
        mouswY = 10;
        msg = "Клик мышы";
        repaint();
    }

    //Обработчик события наведение указатьедля на область злемента
    public void mouseEntered(MouseEvent me){
        mouseX = 0;
        mouswY = 10;
        msg = "Мыш наведена";
        repaint();
    }
    
    //Обработчик события выхода указатьедля за область злемента
    public void mouseExited(MouseEvent me){
        mouseX = 0;
        mouswY = 10;
        msg = "Мыш ане области";
        repaint();
    }
    
    //Обработчик события нажатия на кнопку мыши
    public void mousePress(MouseEvent me){
        mouseX = me.getX();
        mouswY = me.getY();
        msg = "Кнопка нажата";
        repaint();
    }
    
    //Обработчик события отжатия на кнопку мыши
    public void mouseReleased(MouseEvent me){
        mouseX = me.getX();
        mouswY = me.getY();
        msg = "Кнопка отжата";
        repaint();
    }
    
    //Обработчик события перетаскивания указателя мыши
    public void mouseDragged(MouseEvent me){
        mouseX = me.getX();
        mouswY = me.getY();
        msg = "*";
        showStatus("Перетаскивается мышь в " + mouseX + ", " + mouswY);
        repaint();
    }
    //Обработчик события перемещения указателя мыши
    public void mouseMoved(MouseEvent me){
        showStatus("Перемещается мышь в " + me.getX() + ", " + me.getY());
        repaint();
    }
    
    //Отобразить сообщение в окне апплета
    //в тоске с текущами значениями Х У
    @Override
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouswY);
    }

}
