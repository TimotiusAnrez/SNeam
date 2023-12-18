package View;

import java.sql.SQLException;

import Controller.AuthController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Register {

    private Scene primaryScene;
    private MenuDisplay menuBar = new MenuDisplay();
    private BorderPane mainLayout;

    private void displayWarning(String errorTitle, String errorHeader, String errorMessage){
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(errorTitle);
        alert.setHeaderText(errorHeader);
        alert.setContentText(errorMessage);
        alert.show();
    }


    private void validateInformation(String Username, String Password, String ConfirmPassword, String PhoneNumber, String Email){
        final String errorTitle = "Invalid Input";
        String errorHeader = "";
        String errorMessage = "";
        AuthController control = new AuthController();

        if(!(Username.length() >= 4 && Username.length() <= 20)){
            errorHeader = "Username is invalid";
            errorMessage = "Username must contain 4 - 20 character";
            displayWarning(errorTitle, errorHeader, errorMessage);
            return;
        }

        if(!(Email.contains("@"))){
            errorHeader = "Email is invalid";
            errorMessage = "Email must contain @";
            displayWarning(errorTitle, errorHeader, errorMessage);
            return;
        }

        if(!(Password.length() >= 6 && Password.length() <= 20)){
            errorHeader = "Password is invalid";
            errorMessage = "Password must contains 6 - 20 characters";
            displayWarning(errorTitle, errorHeader, errorMessage);
            return;
        }

        if(!(Password.matches("^[a-zA-Z0-9_]+$"))){
            errorHeader = "Password is invalid";
            errorMessage = "Password must be alphanumeric";
            displayWarning(errorTitle, errorHeader, errorMessage);
            return;
        }

        if(!(Password.equals(ConfirmPassword))){
            errorHeader = "Password is invalid";
            errorMessage = "Password must be the same with confirm password";
            displayWarning(errorTitle, errorHeader, errorMessage);
            return;
        }

        if(!(PhoneNumber.matches("^[0-9]+$"))){
            errorHeader = "Phone number is invalid";
            errorMessage = "Phone number must be numeric";
            displayWarning(errorTitle, errorHeader, errorMessage);
            return;
        }

        if(!(PhoneNumber.length() >= 9 && PhoneNumber.length() <= 20)){
            errorHeader = "Phone number is invalid";
            errorMessage = "Phone number must be 9 - 20 numbers";
            displayWarning(errorTitle, errorHeader, errorMessage);
            return;
        }

        try {
            if(!(control.validateEmail(Email))){
                
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Scene display(){
        
        mainLayout = new BorderPane();
        mainLayout.setTop(menuBar.displayInitial());
        
        VBox mainContainer = new VBox();
        Text banner = new Text("Register");
        banner.setFont(Font.font("Verdana", FontWeight.BOLD , 45));
        mainContainer.setMaxWidth(480);
        mainContainer.setSpacing(5);
        mainContainer.setAlignment(Pos.CENTER);

        VBox usernameContainer = new VBox();
        Label usernameLabel = new Label("Username");
        TextField username = new TextField();
        usernameContainer.setMaxWidth(480);
        usernameContainer.getChildren().addAll(usernameLabel, username);


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
        
        VBox confirmPasswordContainer = new VBox();
        Label confirmPasswordLabel = new Label("Confirm Password");
        PasswordField confirmPassword = new PasswordField();
        confirmPasswordContainer.setMaxWidth(480);
        confirmPasswordContainer.getChildren().addAll(confirmPasswordLabel, confirmPassword);

        VBox phoneContainer = new VBox();
        Label phoneLabel = new Label("Phone Number");
        TextField phone = new TextField();
        phoneContainer.setMaxWidth(480);
        phoneContainer.getChildren().addAll(phoneLabel, phone);

        Button submit = new Button("Sign Up");
        submit.setPadding(new Insets(5));
        submit.setMinHeight(18);

        
        submit.setOnAction(e -> {
            String emailInput = email.getText();
            String passwordInput = password.getText();
            validateInformation(passwordInput, emailInput, passwordInput, passwordInput, passwordInput);
            
        });
        
        mainContainer.getChildren().addAll(banner, usernameContainer, emailContainer, passwordContainer, confirmPasswordContainer, phoneContainer, submit);
        mainLayout.setCenter(mainContainer);
        
        primaryScene = new Scene(mainLayout, 1080, 720);
        return primaryScene;
    }
}
