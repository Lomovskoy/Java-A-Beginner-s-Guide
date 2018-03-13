package filehelpswing;

import classes.Help;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Упражнение 16.18
 *
 * Справочная система, использующая дисковый файл для хранения информации
 * и написанна с импользованием груфического интерфейчас Swing
 *
 * @author lomov
 */
public class FileHelpSwing implements ListSelectionListener{
    
    JList<String> jlist;
    JLabel jlab;
    JScrollPane jscrlp;
    Help helpobj;
    //Создать массив имён
    ArrayList names;
    String names2[];

    public FileHelpSwing() {
        
        //Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Help Demo");
        
        //Задать объект FlowLayout для мессенджера компановки
        jfrm.setLayout(new FlowLayout());
        
        //Задать исходный размеры фрейма
        jfrm.setSize(250, 360);
        
        //Пруекратить работу программы, если
        //пользователь закрыл окно
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Создать объект JList
        helpobj = new Help("help.txt");//Имя файласобержащего справочную информацию
        names = helpobj.getNameList();
        
        names2 = new String[names.size()];
        for (int i = 0; i < names2.length; i++) {
            names2[i] = (String) names.get(i);
        }
        
        //Создать объект JList
        jlist = new JList<String>(names2);
        
        //Задать режим выбора многих элементов 
        //так же этустроку можно просто удалить
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Добавить список в панель с полосами прокрутки
        jscrlp = new JScrollPane(jlist);
        
        //Задать предпочтительный размеры прокручиваемой панели
        jscrlp.setPreferredSize(new Dimension(120, 90));
        
        //Создать метку для отображения результатов выбора
        jlab = new JLabel("<html>Воспользуйтесь <br>справочной системой.<html>");
        
        //Добавить обработчик событий выбора элемента из списка
        jlist.addListSelectionListener(this);
        
        //Добавить список и метку в панель содержимого
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        
        //Отобразить фрейм
        jfrm.setVisible(true);
        
    }
    
    //Обработать события выбора элемента из списка
    @Override
    public void valueChanged(ListSelectionEvent le) {
        //Получить индекс элемента, состояния выбора
        //которого было изменено
        int idx = jlist.getSelectedIndex();
        
        
        //Отобразить результат выбора, если элемент был выбран
        if (idx != -1)
            jlab.setText(helpobj.helpon(names2[idx]));
        else
            jlab.setText("Пожалуйста выберите имя");
    }

    public static void main(String[] args) {
        
        //Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FileHelpSwing();
            }
        });
    }
}
