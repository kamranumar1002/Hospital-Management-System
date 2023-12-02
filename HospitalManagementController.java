import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HospitalManagementController {

    private HospitalManagementView view;

    public void startApplication(Stage primaryStage) {
        view = new HospitalManagementView(this);
        setRoot(view.getView());

        primaryStage.setTitle("Hospital Management System");
        primaryStage.show();
    }

    public void setRoot(Parent root) {
        Scene scene = new Scene(root, 800, 600);
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
    }
}
