package Methods.MyProfile;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

/**
 * Created by ��������� on 03.08.2015.
 */
public class LoginPage extends Settings{
    public WebElement userName;
    public WebElement password;
    public WebElement loginButton;
    int sec = 4000;



    public LoginPage() throws IOException
    {
        super();
    }

    public void login(String _login, String _password) throws InterruptedException {
        wait(sec);
        new Select(getDriver().findElement(By.xpath(".//*[@id='dbs']"))).selectByVisibleText("sergey (144.76.56.111)");
        userName = getDriver().findElement(By.id("ulogin"));
        password = getDriver().findElement(By.id("upass"));
        userName.sendKeys(_login);
        password.sendKeys(_password);
        loginButton = getDriver().findElement(By.xpath(".//*[@id='loginForm']/fieldset/a"));
        loginButton.click();
        wait(sec);
    }

    public PersonsPage loginPositive() throws IOException, InterruptedException {
        String login = "yana.gusti";
        String pass = "thinkmobiles2015";
        login(login, pass);

        return new PersonsPage();
    }

    public void loginNegative() throws InterruptedException {
        String login = "user";
        String pass = "user";
        login(login, pass);
    }

    public void loginEmpty() throws InterruptedException {
        String login = "";
        String pass = "";
        login(login, pass);
    }
}
