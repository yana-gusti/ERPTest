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
    @Test(groups = { "bad" })
    public void CreateShortApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(3000);
        String firstName = "";
        String lastName = "";
        applicationsPage.createApplication(firstName, lastName, driver);
        wait(1000);
        applicationsPage.cancel(driver);
        wait(6000);
        personsPage.logOut(driver);
    }
}
