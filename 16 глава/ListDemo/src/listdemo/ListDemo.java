package listdemo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Демонстрация использования простого типа JList
 * @author lomov
 */
public class ListDemo implements ListSelectionListener{

    JList<String> jlist;
    JLabel jlab;
    JScrollPane jscrlp;
    
    //Создать массив имён
    String names[] = {"Кирилл", "Вика", "Сергей",
                    "Миша", "Браин", "Олег",
                    "Вадим", "Алина", "Арина",
                    "Анна", "Александр", "Алла"};
    
    ListDemo(){
        //Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("JList Demo");
        
        //Задать объект FlowLayout для мессенджера компановки
        jfrm.setLayout(new FlowLayout());
        
        //Задать исходный размеры фрейма
        jfrm.setSize(250, 160);
        
        //Пруекратить работу программы, если
        //пользователь закрыл окно
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Создать объект JList
        jlist = new JList<String>(names);
        
        //Задать режим выбора одиночных элементов
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Добавить список в панель с полосами прокрутки
        jscrlp = new JScrollPane(jlist);
        
        //Задать предпочтительный размеры прокручиваемой панели
        jscrlp.setPreferredSize(new Dimension(120, 90));
        
        //Создать метку для отображения результатов выбора
        jlab = new JLabel("Пожалуйста выберите имя");
        
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
            jlab.setText("Выбранное имя: " + names[idx]);
        else
            jlab.setText("Пожалуйста выберите имя");
    }
    
    public static void main(String[] args) {
        //Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
