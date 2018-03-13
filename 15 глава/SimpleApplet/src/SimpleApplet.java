import java.applet.Applet;
import java.awt.Graphics;

/*
    <applet code="SimpleApplet" width=200 height=60>
    </applet>
*/

//Аплет с минимальными функционалом
public class SimpleApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello applet!", 50, 25);
    }

}
