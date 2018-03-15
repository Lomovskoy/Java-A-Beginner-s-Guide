/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfileddemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author lomov
 */
public class TextFiledDemo extends Application {

    TextField tf;
    Label response;
    
    //Переопредешлить метод
    @Override
    public void start(Stage myStage) {
        //Задать заголовок для приложения
        myStage.setTitle("Демонстрация текстовой строки.");
        
        //Использовать FlowPane для корневого узла. В данном
        //случае значение вертикального и горизонтального
        //зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);
        
        //Централизировать инструменты управления на сцене
        rootNode.setAlignment(Pos.CENTER);
         
        //Создать сцену
        Scene myScene = new Scene(rootNode, 230, 140);
         
        //Установить сцену на платформе
        myStage.setScene(myScene);
         
        //Создать метку
        response = new Label("Зажать кнопку");
        
        //Создать кнопку для получения текста
        Button btnGetText = new Button("Получить имя");
        
        //Создать текстовое поле
        tf = new TextField("Введите имя");
        
        //Задать подсказку
        tf.setPromptText("Введите имя");
        
        //Задать количество столбцов
        tf.setPrefColumnCount(15);
        
        /*
            Использовать лямбда-выражение, обрабатывающие события действий
            для текстового поля. События действий генерируются при нажатии
            клавиши Enter в то время, когда фокус ввода находится в
            текстовом поле. В данном случае обработка события
            заключается в получении иотображении текста.
        */
        tf.setOnAction((ae) -> response.setText("Нажфт Enter. Имя: " + tf.getText()));
        
        //Использовать лямбда-выражение для получение текста из
        //текстового поля при нажатии кнопки
        btnGetText.setOnAction((ae) -> response.setText("Нажата кнопка. Имя: " + tf.getText()));
        
        //Использовать разделитель, длялучшей организациивывода
        Separator separator = new Separator();
        separator.setPrefWidth(180);
        
        //Добавить элементы управления в груф сцены
        rootNode.getChildren().addAll(tf, btnGetText, separator, response);
        
        //Отобразить платформу и сцену.
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
