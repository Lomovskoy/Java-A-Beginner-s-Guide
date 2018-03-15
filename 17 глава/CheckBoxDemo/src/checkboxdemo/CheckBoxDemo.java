package checkboxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Демонстрация использования флажков
 * @author lomov
 */
public class CheckBoxDemo extends Application {
    
    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;
    
    Label response;
    Label selection;
    
    String computers;
    
    //Запустить метод старт
    @Override
    public void start(Stage myStage) {
        
        //Задать заголовок окнаприложения
        myStage.setTitle("Демонстрация Check Boxes");
        
        //Использовать FlowPane для корневого узла. В данном
        //случае значение вертикального и горизонтального
        //зазоров составляет 10.
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        
        //Централизировать инструменты управления на сцене
        rootNode.setAlignment(Pos.CENTER);
         
        //Создать сцену
        Scene myScene = new Scene(rootNode, 230, 200);
        
        //Установить сцену на платформе
        myStage.setScene(myScene);
        
        Label heading = new Label("Какой компьюрет выберите вы?");
        
        //Сощздать метку. Извещающую об ихзменениях состояния флага
        response = new Label("");
        
        //Сощздать метку. Извещающую об выьоре любого флага
        selection = new Label("");
        
        //Создать флажки
        cbSmartphone = new CheckBox("Смартфон");
        cbTablet = new CheckBox("Планшет");
        cbNotebook = new CheckBox("Ноутбук");
        cbDesktop = new CheckBox("Десктопный");
        
        //Обработка событий действий для флажков
        cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                if(cbSmartphone.isSelected())
                    response.setText("Смартфон был выбран");
                else
                    response.setText("Смартфон был удалён");
                showAll();
            }
        });
        cbTablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                if(cbSmartphone.isSelected())
                    response.setText("Планшет был выбран");
                else
                    response.setText("Планшет был удалён");
                showAll();
            }
        });
        cbNotebook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                if(cbSmartphone.isSelected())
                    response.setText("Ноутбук был выбран");
                else
                    response.setText("Ноутбук был удалён");
                showAll();
            }
        });
        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                if(cbSmartphone.isSelected())
                    response.setText("Десктопный был выбран");
                else
                    response.setText("Десктопный был удалён");
                showAll();
            }
        });
        
        //Добавить элементы управления в граф сцены
        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet, 
                cbNotebook, cbDesktop, response, selection);
        
        //Отобразить платформу и её сцену
        myStage.show();
    }

    void showAll(){
        computers = "";
        if(cbSmartphone.isSelected())
            computers += "Смартфон";
        if(cbDesktop.isSelected())
            computers += "Десктоп";
        if(cbNotebook.isSelected())
            computers += "Ноутбук";
        if(cbTablet.isSelected())
            computers += "Планшет ";
        selection.setText("Компьютер выбран: " + computers);
    }


    public static void main(String[] args) {
        //Запустит приложение
        launch(args);
    }
    
}
