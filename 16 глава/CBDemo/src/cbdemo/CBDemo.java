package cbdemo;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * Демонстрация использования флажков
 * @author lomov
 */
public class CBDemo implements ItemListener{
    
    JLabel jlabseleSelected;
    JLabel jlabseleChanget;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;
    
    CBDemo(){
        
        //Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Демонстрция Chesk Boxes");
        
        //Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());
        
        //Задать исходные размеры фрейма
        jfrm.setSize(300, 120);
        
        //Прекратить работц программы, если
        //пользователь закрываетпридодение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Создать пустые метки
        jlabseleSelected = new JLabel("");
        jlabseleChanget = new JLabel("");
        
        //Создать флжки
        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbGamma = new JCheckBox("Gamma");
        
        //События, генерируемые флажками, генерируются
        //одним методом itemStateChanged()?
        //реализованным в классе CBDemo
        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);
        
        //Добавить флажки и метки в панель содержимого
        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabseleChanget);
        jfrm.add(jlabseleSelected);
        
        //Отобразить фрейм
        jfrm.setVisible(true);
    }
    
    //Обработчик фоажков
    @Override
    public void itemStateChanged(ItemEvent ie) {
        String str = "";
        
        //Получить ссылку на флавжок, с которым связанно событие
        JCheckBox cb = (JCheckBox)ie.getItem();
        
        //Сообщеить о том, состояние какого флажка изменилось
        if (cb.isSelected()) 
            jlabseleChanget.setText(cb.getText() + " только что был выбран");
        else
            jlabseleChanget.setText(cb.getText() + " только что был очищен");
        
        //Сообщить о всех установленных флажках
        if (jcbAlpha.isSelected()) {
            str += "Alpha ";
        }
        if (jcbBeta.isSelected()) {
            str += "Beta ";
        }
        if (jcbGamma.isSelected()) {
            str += "Gamma";
        }
        
        jlabseleSelected.setText("Нажатые флажки: " + str);
    }

    public static void main(String[] args) {
        // Cоздать фрейм в потоке диспетчеризации задач
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CBDemo();
            }
        });
    }
    
}
