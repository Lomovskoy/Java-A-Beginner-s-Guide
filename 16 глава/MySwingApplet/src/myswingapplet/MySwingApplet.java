//Простой апплет Swing
package myswingapplet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
    Для запуска впплета можно использовать следующий HTML-код:
    <object code="MySwingApplet" width=200 heidth=80>
    </object>
*/
public class MySwingApplet extends JApplet{
    JButton jbtnUp;
    JButton jbtnDown;
    
    JLabel jlab;
    
    //Инициализировать апплет
    @Override
    public void init(){
        try {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    makeGUI();//Инициализировать графический интерфейс
                }
            });
        } catch (Exception e) {
            System.out.println("Не смог создать, потому, что: " + e);
        }
    }

    //В этом впплете отсутствует необходимость переопределять
    //методы start(), stop(), destroy()
    
    //Установить и инициализировать графический интерфейс
    private void makeGUI(){
        //Задать менеджер компановки для апплета
        setLayout(new FlowLayout());
        
        //Создать две кнопки
        jbtnUp = new JButton("Up");
        jbtnDown = new JButton("Down");
        
        /* 
            Использование анонимного внутреннего класса
            для обработки событий
        */
        //Добавить слушатель событий кнопке Up
        jbtnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Вы нажали Up");
            }
        });
        
        //Добавить слушатель событий кнопки Down.
        //Для обработки событий кнопки Down
        //используется анонимный внутренний класс.
        jbtnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Вы нажали Down");
            }
        });
        
        //Добавить кнопки в панель содержимого
        add(jbtnUp);
        add(jbtnDown);
        
        //Создать текстовую метку
        jlab = new JLabel("Нажмите кнопку");
        
        //Добавить метку в панель содержимого
        add(jlab);
    }
}
