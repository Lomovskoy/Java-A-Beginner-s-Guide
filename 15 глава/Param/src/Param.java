//Передача параметров Апплету
import java.applet.Applet;
import java.awt.Graphics;

/*
  <applet code="Param" width=200 height=60>
    <param name=author value="Герберт Шилд">
    <param name=purpose value="Демонстрация переметров">
    <param name=version value=2>
  </applet>
*/
public class Param extends Applet {

    String author;
    String purpose;
    int ver;

    //Этот метод вызывается вторым после метода init(). Он
    //Вызывается так же при каждом запуске аплета.
    @Override
    public void start() {
        //Запуск или возобновление выполнения
        String temp;
        
        author = getParameter("author");
        if (author == null) 
            author = "Не найден";
        
        purpose = getParameter("purpose");
        if (purpose == null) 
            purpose = "Не найден";
        
        temp = getParameter("version");
        try {
            if (temp != null) 
                ver = Integer.parseInt(temp);
            else
                ver = 0;
        } catch (NumberFormatException e) {
            ver = -1; // код ошибки
        }
    }

    @Override
    public void paint(Graphics g){
        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("By: " + author, 10, 40);
        g.drawString("Version: " + ver, 10, 60);
    }
}
