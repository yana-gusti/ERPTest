package Tests.HR.Application;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 23.05.2016.
 */
public class EmptyApp extends BaseTest {
    @Test(groups = { "bad" })
    public void CreateEmptyApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(seconds);
        String firstName = "";
        String lastName = "";
        applicationsPage.createApplication( firstName, lastName, driver);
        wait(seconds);
        applicationsPage.cancel(driver);
    }
}
