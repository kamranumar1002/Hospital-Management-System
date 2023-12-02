import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SignupController {

    @FXML
    private TextField newUsernameField;

    @FXML
    private PasswordField newPasswordField;

    private OnSignupSuccessListener onSignupSuccessListener;
    private OnLoginListener onLoginListener;

    private static final String USERS_FILE = "users.txt";

    @FXML
    private void handleSignup() {
        String newUsername = newUsernameField.getText();
        String newPassword = newPasswordField.getText();

        if (validateSignup(newUsername, newPassword)) {
            // Successful signup
            if (onSignupSuccessListener != null) {
                onSignupSuccessListener.onSignupSuccess();
            }
        } else {
            // Display an error message for unsuccessful signup
        }
    }

    private boolean validateSignup(String newUsername, String newPassword) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
            // Check if the username already exists
            if (isUsernameAvailable(newUsername)) {
                // Append the new user information to the file
                writer.write(newUsername + ":" + hashPassword(newPassword));
                writer.newLine();
                return true; // Signup successful
            } else {
                // Display an error message for duplicate username
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Signup unsuccessful
    }

    private boolean isUsernameAvailable(String username) {
        // Check if the username already exists in the file
        // Implement logic to read from the USERS_FILE and check for username availability
        return true;
    }

    private String hashPassword(String password) {
        // Implement password hashing (use a secure hashing algorithm)
        // In a real-world scenario, use a proper password hashing library
        return password;
    }

    @FXML
    private void showLogin() {
        if (onLoginListener != null) {
            onLoginListener.onLogin();
        }
    }

    public void setOnSignupSuccess(OnSignupSuccessListener listener) {
        this.onSignupSuccessListener = listener;
    }

    public void setOnLogin(OnLoginListener listener) {
        this.onLoginListener = listener;
    }
}
