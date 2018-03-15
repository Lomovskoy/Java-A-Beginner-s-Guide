package listviewdemo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Демонстрация использование списка
 * @author lomov
 */
public class ListViewDemo extends Application {
    
    Label response;
    
    //Переопределите метод start()
    @Override
    public void start(Stage myStage) {
        
        //Задать заголовок окна приложения
        myStage.setTitle("Демонстрация листа");
        
        //Использовать FlowPane для корневого узла. В данном
        //случае значение вертикального и горизонтального
        //зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);
        
        //Централизировать инструменты управления на сцене
        rootNode.setAlignment(Pos.CENTER);
         
        //Создать сцену
        Scene myScene = new Scene(rootNode, 200, 130);
        
        //Установить сцену на платформе
        myStage.setScene(myScene);
        
        //Создать метку
        response = new Label("Выберите тип компьютеров");
        
        //Создать объект типа для списка
        ObservableList<String> computerTypes = 
                FXCollections.observableArrayList("Смартфон", "Планшет", 
                        "Ноутбук", "Десктопный");
        
        //Создать список
        ListView<String> lvComputer = new ListView<>(computerTypes);
        
        //Задать значения высоты и шырины
        lvComputer.setPrefSize(100, 70);
        
        //Получить модель выбора для списка
        MultipleSelectionModel<String> lvSelModel = 
                lvComputer.getSelectionModel();
        
        //Использовать слушатель для реагирования на изменения
        //выделения в нутри списка
        lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, 
                    String oldValue, String newValue) {
                
                //Отобразить выбор
                response.setText("Компьютер выбран: " + newValue);
            }
        });
        
        //Добавить метку и список в граф сцены
        rootNode.getChildren().addAll(lvComputer, response);
        
        //Отобразитьплатформу и её суену
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
