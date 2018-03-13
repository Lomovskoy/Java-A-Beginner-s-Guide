package swingdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * Простая Swing-программа
 * @author lomov
 */
public class SwingDemo {

    SwingDemo(){
        
        //Создатьновый контейнер JFrame
        JFrame jfrm = new JFrame("Перое прилодение на Swing");
        
        //Установить начальный размер фрейма
        jfrm.setSize(350, 100);
        
        //Завершить работу программы, когда пользователь
        //закрывает приллодение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Создать текстовую метку
        JLabel jlab = new JLabel(" Swing предназначен для создания Java GUI.");
        
        //Добавить метку в панель содержимого
        jfrm.add(jlab);
        
        //Сделать фрейм видимым
        jfrm.setVisible(true);
    }
    
    public static void main(String args[]){
        
        //Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
    
}
