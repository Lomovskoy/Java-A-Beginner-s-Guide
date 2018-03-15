/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxeventdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Демонстрация обработки событий Java FX для кнопок
 * @author lomov
 */
public class JavaFXEventDemo extends Application {
    
    Label response;
    
    @Override
    public void start(Stage myStage) {
        
        //Задать заголовок для приложения
        myStage.setTitle("Использование Java FX кнопок и событий.");
        
        //Использовать FlowPane для корневого узла. В данном
        //случае значение вертикального и горизонтального
        //зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);
        
        //Централизировать инструменты управления на сцене
        rootNode.setAlignment(Pos.CENTER);
         
        //Создать сцену
        Scene myScene = new Scene(rootNode, 350, 100);
         
        //Установить сцену на платформе
        myStage.setScene(myScene);
         
        //Создать метку
        response = new Label("Зажать кнопку");
         
        //Создать две кнопки.
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");
        
        //Обработать событие действия для кнопки Up анонимный внуцтренниу класс
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Вы нажали Up");
            }
        });
        
        //Обработать события действия для кнопки Down лямбда выражение
        btnDown.setOnAction((ActionEvent event) -> {
            response.setText("Вы нажали Down");
        });
        
        //Добавить метку и кнопку в граф сцены
        rootNode.getChildren().addAll(btnUp, btnDown, response);
        
        //Отобразить платформу и её сцену
        myStage.show();
    }

    public static void main(String[] args) {
        //Запустить приложение
        launch(args);
    }
    
}
