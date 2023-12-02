import javafx.application.Application;
import javafx.stage.Stage;

public class HospitalManagementSystemApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HospitalManagementController controller = new HospitalManagementController();
        controller.startApplication(primaryStage);
    }
}
