import Util.Router;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Router router = Router.getRouterInstance(primaryStage);
        router.initiateRouter();
    }


}
