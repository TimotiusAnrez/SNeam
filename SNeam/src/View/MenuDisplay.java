package View;

import Util.Router;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuDisplay {
    private MenuBar menuBar;
    private Router routerInstance = Router.getRouterInstance(new Stage());
    
    public MenuBar displayInitial(){
        menuBar = new MenuBar();
        Menu menu = new Menu("Menu");

        MenuItem login = new MenuItem("Login");
        MenuItem register = new MenuItem("Register");

        login.setOnAction(e -> {
            routerInstance.displayLogin();
        });

        register.setOnAction(e -> {
            System.out.println("Clicked");
            routerInstance.displayRegister();
        });

        menu.getItems().addAll(login, register);
        menuBar.getMenus().add(menu);

        return menuBar;
    }

    public MenuBar dispayUserMenu(){
        menuBar = new MenuBar();

        Menu dashboard = new Menu("Dashboard");
        Menu logoutMenu = new Menu("Log Out");

        MenuItem home = new MenuItem("Home");
        MenuItem cart = new MenuItem("Cart");

        home.setOnAction(e -> {

        });

        home.setOnAction(e -> {

        });


        MenuItem logout = new MenuItem("Log Out");

        logout.setOnAction(e -> {
            routerInstance.displayLogin();
        });

        dashboard.getItems().addAll(home,cart);
        logoutMenu.getItems().addAll(logout);
        menuBar.getMenus().addAll(dashboard, logoutMenu);
        

        return menuBar;
    }

    public MenuBar displayAdminMenu(){
        menuBar = new MenuBar();

        return menuBar;
    }
    
}
