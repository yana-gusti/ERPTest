package Methods.MyProfile;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

/**
 * Created by ��������� on 03.08.2015.
 */
public class LoginPage extends BaseTest{
    public WebElement userName;
    public WebElement password;
    public WebElement loginButton;

    public void login(String _login, String _password, RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        driver.findElement(By.id("selectedDb")).click();
        WebElement dbItem = driver.findElement(By.xpath("//*[@data-id='sergey']"));
        dbItem.click();

        userName = driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/div[1]/input"));
        password = driver.findElement(By.id("upass"));
        userName.sendKeys(_login);
        password.sendKeys(_password);
        loginButton = driver.findElement(By.linkText("Sign In"));
        loginButton.click();

    }

    public PersonsPage loginPositive( RemoteWebDriver driver) throws IOException, InterruptedException {
        String login = "yana.gusti";
        String pass = "thinkmobiles2015";
        login(login, pass,  driver);
        wait(seconds);
        driver.findElement(By.linkText("Persons")).click();
        return new PersonsPage();
    }

    public void loginNegative(RemoteWebDriver driver) throws InterruptedException {
        String login = "user";
        String pass = "user";
        login(login, pass, driver);
    }

    public void loginEmpty(RemoteWebDriver driver) throws InterruptedException {
        String login = "";
        String pass = "";
        login(login, pass, driver);
    }
}
