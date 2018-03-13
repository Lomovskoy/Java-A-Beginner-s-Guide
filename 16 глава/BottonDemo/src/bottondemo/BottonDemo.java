package bottondemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Демонстрация создания кнопки
 *
 * @author lomov
 */
public class BottonDemo implements ActionListener {

    JLabel jlab;

    BottonDemo() {

        //Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Пример кнопки");

        //Задать объект FlowLayout для для менеджера компановки
        jfrm.setLayout(new FlowLayout());

        //Задать исходные параметры фрейма
        jfrm.setLayout(new FlowLayout());
        
        //Задать исходные размеры фрейма
        jfrm.setSize(220, 90);
        
        //Прекрастить работу программы, если
        //пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Создать две кнопки
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");
        
        //Добавить слушателей действия
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);
        
        //Добавить кнопки в панель содержимого
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);
        
        //Создать метку
        jlab = new JLabel("Нажать кнопку");
        
        //Добавить метку во фреймы
        jfrm.add(jlab);
        
        //Отобразить фрейм
        jfrm.setVisible(true);

    }
    
    //Обработать события кнопки
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("Вы нажали Up");
        else
           jlab.setText("Вы нажали Down"); 
    }

    public static void main(String[] args) {
        
        //Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BottonDemo();
            }
        });
    }

}
