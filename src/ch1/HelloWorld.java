package ch1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX的朱磊需要集成application.Application类
 * Stage(顶级容器)>Scene(所有内容容器-有图形节点Node构成的分成场景展现)
 * >root(节点包含按钮子节点)
 */
public class HelloWorld extends Application {

    @Override
    //start方法是JavaFX应用程序的入口
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            //事件处理器
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        StackPane root = new StackPane();//layout节点
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}