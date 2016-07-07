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
public class IncorrectApp extends BaseTest {
    Integer seconds=10000;
    @Test(groups = {"bad"})
    public void CreateIncorrectApp() throws InterruptedException, IOException {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(seconds);
        String firstName = "!@#$";
        String lastName = "!@#$";
        applicationsPage.createApplication( firstName, lastName, driver);
        wait(seconds);
        applicationsPage.cancel(driver);
    }
}