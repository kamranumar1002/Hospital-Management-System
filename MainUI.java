import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainUI {

    public VBox createMainUI() {
        VBox mainVBox = new VBox(20);
        mainVBox.setStyle("-fx-alignment: center;");

        Label welcomeLabel = new Label("Welcome to the Hospital Management System!");
        welcomeLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        mainVBox.getChildren().addAll(welcomeLabel);

        return mainVBox;
    }
}
