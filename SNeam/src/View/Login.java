package View;

import Controller.AuthController;
import Util.Router;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {
    Scene primaryScene;
    
    private void validateCredential(String email, String password) {
        AuthController control = new AuthController();
        
        if (control.validateUser(email, password)) {
            Router router = Router.getRouterInstance(new Stage());
            router.displayUserHome();
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Invalid Request");
            alert.setHeaderText("Wrong Credential");
            alert.setContentText("Email or Password is invalid");
            alert.show();
        }
        
    }
    
    public Scene display(){
        
        BorderPane mainLayout = new BorderPane();
        MenuDisplay menuBar = new MenuDisplay();
        mainLayout.setTop(menuBar.displayInitial());
        
        VBox mainContainer = new VBox();
        Text banner = new Text("Login");
        banner.setFont(Font.font("Verdana", FontWeight.BOLD , 45));
        mainContainer.setMaxWidth(480);
        mainContainer.setSpacing(5);
        mainContainer.setAlignment(Pos.CENTER);

        VBox emailContainer = new VBox();
        Label emailLabel = new Label("Email");
        TextField email = new TextField();
        emailContainer.setMaxWidth(480);
        emailContainer.getChildren().addAll(emailLabel, email);


        VBox passwordContainer = new VBox();
        Label passwordLabel = new Label("Password");
        PasswordField password = new PasswordField();
        passwordContainer.setMaxWidth(480);
        passwordContainer.getChildren().addAll(passwordLabel, password);
        
        Button submit = new Button("Sign In");

        
        submit.setOnAction(e -> {
            String emailInput = email.getText();
            String passwordInput = password.getText();
            validateCredential(emailInput, passwordInput);
            
        });
        
        mainContainer.getChildren().addAll(banner, emailContainer, passwordContainer, password, submit);
        mainLayout.setCenter(mainContainer);
        
        primaryScene = new Scene(mainLayout, 1080, 720);



        return primaryScene;
    }
}
