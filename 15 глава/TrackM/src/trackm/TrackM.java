/* 
    Отслеживание перемещениямыши путём рисования линии.
    Признаками начала и конца линии являются нажатие
    и отпусканиекнопки мыши.
*/
package trackm;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
    <applet code="TrackM" width=300 height=100>
</applet>
 */
public class TrackM extends Applet 
        implements MouseListener, MouseMotionListener{

    int curX = 0, curY = 0; //Текущие коаржинаты
    int oldX = 0, oldY = 0; //Предыдущие коардинаты
    boolean draw;

    @Override
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
        draw = false;
    }
    
    /*
        Следующие три метода не используются, но их пустые
        реализации нужны, так как эти методы лбъявленны
        в интерфейса MouseListener
    */

    //Обработать наведение указателя мыши
    //на элемент пользовательского интерфейса
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    //Обработать отведение указателя мыши
    //на элемент пользовательского интерфейса
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    //Обработать щелчёк кнопкой мыши
    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    //Обработать нажатие кнопкой мыши
    @Override
    public void mousePressed(MouseEvent e) {
        //сохранить коардинаты
        oldX = e.getX();
        oldY = e.getY();
        draw = true;
    }
    
    //Обработать отпускание кнопки мыши
    @Override
    public void mouseReleased(MouseEvent e) {
        draw = false;
    }
    
    //Обработать перетаскивание мыши
    @Override
    public void mouseDragged(MouseEvent e) {
        //Сохранить соардинаты
       curX = e.getX();
       curY = e.getY();
       repaint();
    }

    //обработать перемещение мыши
    @Override
    public void mouseMoved(MouseEvent e) {
        //Отобразить состояние
        showStatus("Перемещение мыши: " + e.getX() + " " + e.getY());
    }
    
    //Отобразить лдинию в окне аплета
    @Override
    public void paint(Graphics g){
        if(draw)
            g.drawLine(oldX, oldY, curX, curY);
    }
}
