package effectsandtransformsdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 * Демонстрация повротоа, масштабирования, отражения и размытия
 * элементов управления
 * @author lomov
 */
public class EffectsAndTransformsDemo extends Application {
    
    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;
    
    //Сощдать начальные объекты преобразований и эффектов
    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);
    
    //Создать кнопки
    Button btnRotate = new Button("Rotate");
    Button btnBlur = new Button("Blur off");
    Button btnScale = new Button("Scale");
    Label reflect = new Label("Визуальный эффекты");
    
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
        
        //Добавить поворот в списокпреобразований для кнопки Rotate
        btnRotate.getTransforms().add(rotate);
        
        //Добавить масштабирование в список преобразований
        //для кнопки Scale
        btnScale.getTransforms().add(scale);
        
        //Задать эффект отражения для метки
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);
        
        //Обработать события действия для кнопок
        btnRotate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //ПРи каждом нажатии на кнопку она поворачивается
                //на 30 градусов
                angle += 15.0;
                
                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth()/2);
                rotate.setPivotY(btnRotate.getHeight()/2);
            }
        });
        
        btnScale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //При каждом нажатии кнопки изменяются ей размеры
                scaleFactor += 0.1;
                if(scaleFactor > 2.0)
                    scaleFactor = 0.4;
                
                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });
        
        btnBlur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //Пи каждом нажатии изменяется степень размытия
                if(blurVal == 10.0){
                    blurVal = 1.0;
                    btnBlur.setEffect(null);
                    btnBlur.setText("Blur off");
                }else{
                    blurVal++;
                    btnBlur.setEffect(blur);
                    btnBlur.setText("Blur on");
                }
                blur.setWidth(blurVal);
                blur.setHeight(blurVal);
            }
        });
        
        //Добвить метку и кнопки в граф сцены
        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);
        
        //Отобразить платформу и её сцену
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
