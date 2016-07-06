package Tests.HR.Application;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 23.05.2016.
 */
public class ShortApp extends BaseTest {
    Integer seconds=10000;
    @Test(groups = { "bad" })
    public void CreateShortApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(seconds);
        String firstName = "a";
        String lastName = "a";
        applicationsPage.createApplication(firstName, lastName, driver);
        wait(seconds);
        applicationsPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }
}
