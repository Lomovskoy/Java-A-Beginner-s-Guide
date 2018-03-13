package tfdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Использования текстового поля
 * @author lomov
 */
public class TFDemo implements ActionListener{
    
    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;
    
    TFDemo(){
        
        //Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Использовать текстовое поле");
        
        //Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());
        
        //Задать исходные размеры фрейма
        jfrm.setSize(350, 120);
        
        //Прекрастить работу программы, если
        //пользователь закрывает прилдожение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Создать текстовое поле
        jtf = new JTextField(10);
        
        //Установить команду действия для текстового поля
        jtf.setActionCommand("myTf");
        
        //Создать кнопку реверс
        JButton jbtnRev = new JButton("Revers");
        
        //Добавить слушатели событий для текстового поля и кнопки
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);
        
        //Создать метки
        jlabPrompt = new JLabel("Введите текст: ");
        jlabContents = new JLabel("");
        
        //Добавить компоненты с панель содержимого
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);
        
        //Отобразить фрейм
        jfrm.setVisible(true);
    }

    //Обработать события действий
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getActionCommand().equals("Revers")) {
            //Была нажата кнопка Реверс
            String orgStr = jtf.getText();
            String resStr = "";
            
            //Обратить строку в текстовом поле
            for (int i = orgStr.length()-1; i >= 0; i--) 
                resStr += orgStr.charAt(i);
            
            //Сохранить обращённую строку
            jtf.setText(resStr);  
        }else{
            //Клавиша <Enter> нажата в тот момент, когда фокус
            //ввода находился в текстовом поле
            jlabContents.setText("Вы нажали Enter. Текст: " + jtf.getText());
        }
    }
    
    
    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации собьытий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
    
}
