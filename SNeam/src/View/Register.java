package View;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class Register {

    private Scene primaryScene;
    private MenuDisplay menuBar = new MenuDisplay();

    public Scene display(){
        
        BorderPane parent = new BorderPane();
        Text banner = new Text("Hello from register page");
        parent.setCenter(banner);
        parent.setTop(menuBar.displayInitial());

        primaryScene = new Scene(parent, 1080, 720);

        return primaryScene;
    }
}
