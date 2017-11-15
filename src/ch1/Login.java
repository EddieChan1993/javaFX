package ch1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Administrator on 2017-11-15.
 */
public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFx Welcome");

        //创建一个GridPane Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);//居中
        grid.setHgap(10);//垂直间距
        grid.setVgap(10);//水平间距
//        grid.setPadding(new Insets(25, 25, 25, 25));

        //创建控件
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
//        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//字体、字重(粗细)和字号
        grid.add(scenetitle,0,0,2,1);//0列0行，列跨度2，行跨度1

        //创建Label对象，放到第0列，第1行
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);//1列0行

        //创建文本输入框，放到第1列，第1行
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);//1列1行

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);//2列0行

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);//2列1行

        ///按钮
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);//HBox面板
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);//将按钮控件作为子节点
        grid.add(hbBtn,1,4);

        final Text actionTarget = new Text();//增加用于显示信息的文本
        grid.add(actionTarget,1,6);
        actionTarget.setId("actiontarget");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                actionTarget.setFill(Color.FIREBRICK);//设置文字颜色
                actionTarget.setText("登陆按钮按下");
            }
        });

        //创建场景
        Scene scene = new Scene(grid, 300, 275);
        //添加场景
        primaryStage.setScene(scene);

        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        //显示舞台
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}