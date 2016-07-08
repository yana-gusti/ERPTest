package Tests.MyProfile;

import Methods.MyProfile.LoginPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by ��������� on 03.08.2015.
 */
public class LoginPageTest extends BaseTest{

    @Test(groups = { "good" })
    public void positiveLogin () throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        assertEquals("yana.gusti", getDriver().findElement(By.id("userName")).getText());
        wait(seconds);
        personsPage.logOut(driver);
    }
    @Test(groups = { "bad" })
    public void negativeLogin () throws InterruptedException, IOException
    {

        LoginPage loginPage = new LoginPage();
        loginPage.loginNegative(driver);
        assertEquals("Wrong Password or such user doesn't registered", getDriver().findElement(By.cssSelector("div.error")).getText());

    }
    @Test(groups = { "good" })
    public void loginWithEmptyFields() throws InterruptedException, IOException
    {

        LoginPage loginPage = new LoginPage();
        loginPage.loginEmpty(driver);
        assertEquals("Login must be longer than 3 characters\nPassword must be longer than 3 characters", getDriver().findElement(By.cssSelector("div.error")).getText());

    }
}
