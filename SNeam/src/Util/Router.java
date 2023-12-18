package Util;

import View.Login;
import View.Register;
import javafx.stage.Stage;

public class Router {
    private Stage primaryStage;
    private Login login;
    private Register register;
    private static Router routerInstance;


    private Router(Stage primaryStage) {
        this.primaryStage = primaryStage;
        
    }
    private Stage getStage(){
        return this.primaryStage;
    }

    public void displayLogin(){
        getStage().setScene(login.display());
    }
    
    public void displayRegister(){
        register = new Register();
        getStage().setScene(register.display());
    }
    
    public void initiateRouter(){
        login = new Login();
        getStage().setScene(login.display());
        getStage().show();
    }

    public static Router getRouterInstance(Stage stageInput){
        if (routerInstance == null){
            routerInstance = new Router(stageInput);
        }
        return routerInstance;
    }

}
