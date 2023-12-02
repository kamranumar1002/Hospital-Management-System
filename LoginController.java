import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private OnLoginSuccessListener onLoginSuccessListener;
    private OnSignupListener onSignupListener;

    private static final String USERS_FILE = "users.txt";

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (validateLogin(username, password)) {
            // Successful login
            if (onLoginSuccessListener != null) {
                onLoginSuccessListener.onLoginSuccess();
            }
        } else {
            // Display an error message for unsuccessful login
        }
    }

    private boolean validateLogin(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(hashPassword(password))) {
                    return true; // Username and password match
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Invalid username or password
    }

    private String hashPassword(String password) {
        // Implement password hashing (use a secure hashing algorithm)
        // In a real-world scenario, use a proper password hashing library
        return password;
    }

    @FXML
    private void showSignup() {
        if (onSignupListener != null) {
            onSignupListener.onSignup();
        }
    }

    public void setOnLoginSuccess(OnLoginSuccessListener listener) {
        this.onLoginSuccessListener = listener;
    }

    public void setOnSignup(OnSignupListener listener) {
        this.onSignupListener = listener;
    }
}
