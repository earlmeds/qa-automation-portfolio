import pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String url = "https://www.saucedemo.com";
        String username = "standard_user";
        String password = "secret_sauce";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(url);
        loginPage.login(username, password);

        String title = loginPage.getPageTitle();
        System.out.println("Page title is: " + title);

        if (title.equals("Products")) {
            System.out.println("+ + LOGIN TEST PASSED");
        } else {
            System.out.println("+ + LOGIN TEST FAILED");
        }

        System.out.println("Login successful!");
        Thread.sleep(5000);

        driver.quit();
    }
}
