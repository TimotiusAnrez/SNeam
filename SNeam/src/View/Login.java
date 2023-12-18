package View;

import Util.Router;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {
    Scene primaryScene;
    MenuDisplay menuBar = new MenuDisplay();


    public Scene display(){

        BorderPane parent = new BorderPane();
        Text banner = new Text("Hello from login page");
        parent.setCenter(banner);
        parent.setTop(menuBar.displayInitial());


        
        primaryScene = new Scene(parent, 1080, 720);


        return primaryScene;
    }
}
