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
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        String firstName = applicationsPage.getProperty("firstName.empty");
        String lastName = applicationsPage.getProperty("lastName.empty");
        applicationsPage.createApplication(driver, firstName, lastName);
        wait(1000);
        applicationsPage.cancel(driver);
        wait(6000);
        applicationsPage.logOut(driver);
    }
}
