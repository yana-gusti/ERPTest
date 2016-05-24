package Methods.MyProfile;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

/**
 * Created by ��������� on 03.08.2015.
 */
public class LoginPage extends BaseTest{
    public WebElement userName;
    public WebElement password;
    public WebElement loginButton;
    int sec = 4000;



    public LoginPage() throws IOException
    {
        super();
    }

    public void login(String _login, String _password, RemoteWebDriver driver) throws InterruptedException {
        wait(sec);
        new Select(driver.findElement(By.xpath(".//*[@id='dbs']"))).selectByVisibleText("sergey (144.76.56.111)");
        userName = driver.findElement(By.id("ulogin"));
        password = driver.findElement(By.id("upass"));
        userName.sendKeys(_login);
        password.sendKeys(_password);
        loginButton = driver.findElement(By.xpath(".//*[@id='loginForm']/fieldset/a"));
        loginButton.click();
        wait(sec);
    }

    public PersonsPage loginPositive( RemoteWebDriver driver) throws IOException, InterruptedException {
        String login = "yana.gusti";
        String pass = "thinkmobiles2015";
        login(login, pass,  driver);

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
