package swingfc2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Упражнение 16.1.
 * Утилита сравнения файлов на основе Swing
 * 
 * В этой версии предусмотрен флажок, установка которого задаёт
 * отображение позиции первого расхождения в содержимом
 * сравниваемых файлов
 * 
 * Для компиляции этой утилиты требуются JDK7
 * или более поздняя версия данного комплекта.
 * 
 * @author lomov
 */
public class SwingFC2 implements ActionListener{

    JTextField jtfFirst;//Хранит имя первого файла
    JTextField jtfSecond;//Хранит имя второго файла
    
    JButton jbtnComp;//Кнопка запуска операции сравнения файлов
    JLabel jlabFirst, jlabSecond;//метки, отображающие посказки
    JLabel jlabResult;//метка для отображения разультата сравнения
    
    JCheckBox jcbLoc;//Установить для отображения позициипервогонесовпадения

    public SwingFC2() {
        
        //Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Сравнить файлы");
        
        //Задать объект FlowLayout для менеджера компановки
        jfrm.setLayout(new FlowLayout());
        
        //Задать исходный расмеры фрейма
        jfrm.setSize(300, 150);
        
        //Прекратить работы программы, если
        //пользователь закрывает придлодение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Создать поля ввода имён файлов
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        
        //Задать команды действий для текстовых полей
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");
        
        //Создать кнопку сравнить
        JButton jbtnComp = new JButton("Сравнить");
        
        //Добавить слушатель событий для класса кнопки
        jbtnComp.addActionListener(this);
        
        //Создать метки
        jlabFirst = new JLabel("Первый файл: ");
        jlabSecond = new JLabel("Второй файл: ");
        jlabResult = new JLabel("");
        
        //Создать флажок
        jcbLoc = new JCheckBox("Показать позицию несовпадения");
        
        //Добавить компоненты в панель содержимого
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jcbLoc);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        
        //Отобразить фрейм
        jfrm.setVisible(true);
    }
    
    //Сравнить файлы после щелчка на кнопке
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        int i = 0, j = 0, count = 0;
        
        //Проверяем введены ли имена обоих файлов
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("Имя первого файла отсутствует");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("Имя второго файла отсутствует");
            return;
        }
        
        //Сравнить файлы, используя оператор try с ресурсами
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
                FileInputStream f2 = new FileInputStream(jtfSecond.getText())){
            
            //Сравнить содержание обоих файлов
            do {                
                i = f1.read();
                j = f2.read();
                if(i != j)
                    break;
                count++;
            } while (i != -1 && j != -1);
            
            if(i != j){
                if(jcbLoc.isSelected())
                    jlabResult.setText("Файлы не совпадают в месте " + count);
                else
                    jlabResult.setText("Файлы не совпадают.");
            }
            else
                jlabResult.setText("Файлы совпадают.");
            
        } catch (IOException e) {
            jlabResult.setText("Ошибка чтения файлов");
        }
    }
    
    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFC2();
            }
        });
    }
}
