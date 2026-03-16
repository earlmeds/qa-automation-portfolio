package pages;

public class LoginPage extends BasePage {
    String usernameField = "input#username";
    String passwordField = "input#password";

    public LoginPage(String browser) {
        super(browser);
    }

    public void login(String username, String password) {
        System.out.println("Logging in as " + username);
    }
}