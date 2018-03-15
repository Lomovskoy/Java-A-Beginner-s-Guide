/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabledemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Демонстрация использования меток JavaFX
 * @author lomov
 */
public class JavaFXLableDemo extends Application {
    
    //Переопределить метод старт start()
    @Override
    public void start(Stage myStage) {
        //Задать заголовок окна приложения
        myStage.setTitle("Использовать Java FX метку.");
        
        //Использовать FlowPane для корневого узла
        FlowPane rootNode = new FlowPane();
        
        //Создатьсцену
        Scene myScene = new Scene(rootNode, 350, 200);
        
        //Установить сцену на платформе
        myStage.setScene(myScene);
        
        //Создать метку
        Label myLabel = new Label("Java FX очень мощный GUI");
        
        //Добавить метку в граф сцены
        rootNode.getChildren().add(myLabel);
        
        //Отобразить платформу и её сцену
        myStage.show();
    }

    public static void main(String[] args) {
        //Запустить приложение, вызвав метод launch()
        launch(args);
    }
    
}
