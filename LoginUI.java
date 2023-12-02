import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class LoginUI {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Hyperlink signupLink;

    private OnLoginSuccessListener onLoginSuccessListener;
    private OnSignupListener onSignupListener;

    public void setOnLoginSuccess(OnLoginSuccessListener listener) {
        this.onLoginSuccessListener = listener;
    }

    public void setOnSignup(OnSignupListener listener) {
        this.onSignupListener = listener;
    }

    public Parent getView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));

        loader.setController(this);

        try {
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return new VBox(); // Placeholder, handle the error appropriately
        }
    }

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Implement login logic here
        // Check username and password against stored credentials

        if (onLoginSuccessListener != null) {
            onLoginSuccessListener.onLoginSuccess();
        }
    }

    @FXML
    private void showSignup() {
        if (onSignupListener != null) {
            onSignupListener.onSignup();
        }
    }
}
