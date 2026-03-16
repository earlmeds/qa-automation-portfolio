class LoginPage extends BasePage {
    String usernameField = "input#username";
    String passwordField = "input#password";

    LoginPage(String browser) {
        super(browser);
    }

    void login(String username, String password) {
        System.out.println("Logging in as " + username);
    }
}