package Tests.HR.Application;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 23.05.2016.
 */
public class RemoveApp extends BaseTest {
    @Test(groups = { "good" })
    public void RemoveApp() throws InterruptedException, IOException {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(seconds);
        applicationsPage.SwitchOnList(driver);
        wait(seconds);
        applicationsPage.viewAppDetails(driver);
        wait(seconds);
        applicationsPage.removeApp(driver);
        wait(seconds);
        alertAcept();
        wait(seconds);
    }
}
