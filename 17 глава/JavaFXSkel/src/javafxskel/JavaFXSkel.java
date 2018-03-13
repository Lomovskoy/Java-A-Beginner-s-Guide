package javafxskel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Каркас приложений Java
 * @author lomov
 */
public class JavaFXSkel extends Application {
    
    public static void main(String[] args) {
        
        System.out.println("Запуск приложения Java FX");
        
        //Запуститьприложение вызывая метод launch()
        launch(args);
    }

    //Переопределить метод init()
    @Override
    public void init() throws Exception {
        System.out.println("Втеле метода init()");
    }

    //Переопределить метод start()
    @Override
    public void start(Stage myStage) throws Exception {
        
        System.out.println("В теле метода start()");
        
        //Установить заголовок окна приложения
        myStage.setTitle("Каркас приложения Java FX");
        
        //Создать корневой узел. В данном случае
        //используется плавающаякомпановка, но возможны
        //и другие варианты.
        FlowPane rootNode = new FlowPane();
        
        //Создать сцену
        Scene myScene = new Scene(rootNode, 350, 200);
        
        //Установить сцену на платформе
        myStage.setScene(myScene);
        
        //Отобразить платформу вместе с её сценой
        myStage.show();
    }

    //Переопределить метод stop()
    @Override
    public void stop() throws Exception {
        System.out.println("В теле метода stop()");
    }
    
    
    
}
