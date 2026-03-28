import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() {
        loginPage.navigate("https://www.saucedemo.com");
        loginPage.login("standard_user", "secret_sauce");

        String title = loginPage.getPageTitle();
        org.junit.jupiter.api.Assertions.assertEquals("Products", title);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
