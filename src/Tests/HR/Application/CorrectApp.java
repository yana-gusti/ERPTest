package Tests.HR.Application;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by yana on 23.05.2016.
 */
public class CorrectApp extends BaseTest {




    @Test(groups = { "good" })
    public void CreateCorrectApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(3000);
        String firstName = "test";
        String lastName = "test";
        applicationsPage.createApplication(firstName, lastName, driver);
        wait(1000);
//        assertEquals("Initial Qualification 1", getDriver().findElement(By.cssSelector("h2.columnName")).getText());
        wait(1000);
        personsPage.logOut(driver);
    }
}
