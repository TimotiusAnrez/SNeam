package View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class UserHome {

    Scene mainScene;
    BorderPane mainLayout;

    public Scene display(){

        mainLayout = new BorderPane();
        MenuBar userMenuBar = new MenuDisplay().dispayUserMenu();
        
        //? all of the component will live here
        HBox mainContainer = new HBox();
        
        Text banner = new Text("Hello, Customer");
        banner.setFont(new Font("Halvetica", 36));
        banner.setTextAlignment(TextAlignment.CENTER);
        mainContainer.getChildren().add(banner);
        

        //building scene
        mainLayout.setTop(userMenuBar);
        mainLayout.setCenter(mainContainer); 
        mainScene = new Scene(mainLayout, 1080, 720);

        return mainScene;
    }
}
