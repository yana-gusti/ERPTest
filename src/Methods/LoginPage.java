package Methods;

import Methods.Sales.PersonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 25.12.13
 * Time: 13:13
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage extends PageBase {
    public WebElement userName;
    public WebElement password;
    public WebElement loginButton;
    public WebElement loginForm;
    public WebElement server;

    public LoginPage() throws IOException
    {
        super();
    }

    public void Init() {
//        loginForm = getDriver().findElement(By.id(getProperty("loginForm.id")));

    }


    private void loginAs(String _login, String _password) throws InterruptedException {
        userName = getDriver().findElement(By.id(getProperty("field.username.id")));
        password = getDriver().findElement(By.id(getProperty("field.password.id")));
        userName.sendKeys(_login);
        password.sendKeys(_password);
        loginButton = getDriver().findElement(By.xpath(getProperty("loginButton.xpath")));
        loginButton.click();
    }

    public PersonsPage successLogin(String _login, String _password) throws InterruptedException {
        loginAs(_login, _password);
        wait(2000);
        return new PersonsPage();
    }

    public LoginPage wrongLogin(String _login, String _password) throws InterruptedException, IOException{
        loginAs(_login, _password);

        wait(1000);
        return new LoginPage();
    }
    public LoginPage loginWithEmptyFields(String _login, String _password) throws InterruptedException, IOException{
        loginAs(_login, _password);
        wait(1000);
        return new LoginPage();
    }
}
