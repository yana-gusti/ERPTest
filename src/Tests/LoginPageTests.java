package Tests;

import Methods.LoginPage;
import Methods.Sales.PersonsPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 25.12.13
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */
public class LoginPageTests extends BaseTest {
    Integer seconds=3000;



    @Test(groups = { "bad" })
    public void LoginUnregisteredUserTest() throws InterruptedException, IOException
    {
        goHome();
        wait(seconds);

        LoginPage loginPage = new LoginPage();
        String username = loginPage.getProperty("username.bad");
        String password = loginPage.getProperty("password.bad");
        wait(1000);
        loginPage.wrongLogin(username, password);
        wait(1000);
        assertEquals("Such user doesn't registered", getDriver().findElement(By.cssSelector("div.error")).getText());

    }
    @Test(groups = { "good" })
    public void LoginRegisteredUserTest() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        assertEquals("backbone", getDriver().findElement(By.id("userName")).getText());
        wait(1000);
        personsPage.logOut();
    }
    @Test(groups = { "bad" })
    public void LoginWithBlankFieldsTest() throws InterruptedException, IOException
    {
        goHome();
        wait(seconds);
        LoginPage loginPage = new LoginPage();
        String username = loginPage.getProperty("username.empty");
        String password = loginPage.getProperty("password.empty");
        loginPage.loginWithEmptyFields(username, password);
    }



}

