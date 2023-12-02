import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SignupUI {

    @FXML
    private TextField newUsernameField;

    @FXML
    private PasswordField newPasswordField;

    @FXML
    private Hyperlink loginLink;

    private OnSignupSuccessListener onSignupSuccessListener;
    private OnLoginListener onLoginListener;

    public void setOnSignupSuccess(OnSignupSuccessListener listener) {
        this.onSignupSuccessListener = listener;
    }

    public void setOnLogin(OnLoginListener listener) {
        this.onLoginListener = listener;
    }

    public Parent getView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
        loader.setController(this);

        try {
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return new VBox(); // Placeholder, handle the error appropriately
        }
    }

    @FXML
    private void handleSignup() {
        String newUsername = newUsernameField.getText();
        String newPassword = newPasswordField.getText();

        // Implement signup logic here
        // Create a new user account with the provided credentials

        if (onSignupSuccessListener != null) {
            onSignupSuccessListener.onSignupSuccess();
        }
    }

    @FXML
    private void showLogin() {
        if (onLoginListener != null) {
            onLoginListener.onLogin();
        }
    }
}
