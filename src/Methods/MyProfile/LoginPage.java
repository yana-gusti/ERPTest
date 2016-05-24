package Methods.MyProfile;

import Methods.Base.PageBase;
import Methods.Sales.PersonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

/**
 * Created by ��������� on 03.08.2015.
 */
public class LoginPage extends PageBase{
    public WebElement userName;
    public WebElement password;
    public WebElement loginButton;
    int sec = 2000;

    @Override
    protected void Init() {

    }

    public LoginPage() throws IOException
    {
        super();
    }

    public void login(String _login, String _password) throws InterruptedException {
        wait(sec);
        new Select(getDriver().findElement(By.id("dbs"))).selectByVisibleText("sergey (144.76.56.111)");
        userName = getDriver().findElement(By.id(getProperty("field.username.id")));
        password = getDriver().findElement(By.id(getProperty("field.password.id")));
        userName.sendKeys(_login);
        password.sendKeys(_password);
        loginButton = getDriver().findElement(By.xpath(getProperty("loginButton.xpath")));
        loginButton.click();
        wait(sec);
    }

    public PersonsPage loginPositive() throws IOException, InterruptedException {
        String login = getProperty("username.admin");
        String pass = getProperty("password.admin");
        login(login, pass);

        return new PersonsPage();
    }

    public void loginNegative() throws InterruptedException {
        String login = getProperty("username.bad");
        String pass = getProperty("password.bad");
        login(login, pass);
    }

    public void loginEmpty() throws InterruptedException {
        String login = getProperty("username.empty");
        String pass = getProperty("password.empty");
        login(login, pass);
    }
}
