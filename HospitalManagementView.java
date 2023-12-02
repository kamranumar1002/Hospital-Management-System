import javafx.scene.Parent;
import javafx.scene.layout.VBox;

public class HospitalManagementView {

    private HospitalManagementController controller;

    public HospitalManagementView(HospitalManagementController controller) {
        this.controller = controller;
    }

    public Parent getView() {
        return createLoginUI();
    }

    private Parent createLoginUI() {
        LoginUI loginUI = new LoginUI();

        // Set the login success listener
        loginUI.setOnLoginSuccess(() -> showMainUI());

        // Set the signup listener
        loginUI.setOnSignup(() -> showSignupUI());

        return loginUI.getView();
    }

    private Parent createSignupUI() {
        SignupUI signupUI = new SignupUI();

        // Set the signup success listener
        signupUI.setOnSignupSuccess(() -> showMainUI());

        // Set the login listener
        signupUI.setOnLogin(() -> showLoginUI());

        return signupUI.getView();
    }

    private void showLoginUI() {
        // Switch back to the login UI
        controller.setRoot(createLoginUI());
    }

    private void showSignupUI() {
        // Switch to the signup UI
        controller.setRoot(createSignupUI());
    }

    private void showMainUI() {
        // Create and show the main UI
        MainUI mainUI = new MainUI();
        controller.setRoot(mainUI.createMainUI());
    }
}
