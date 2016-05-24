package Tests.HR.Application;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 23.05.2016.
 */
public class DetailsOfApp extends BaseTest {
    @Test(groups = { "good" })
    public void DetailsOfApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(3000);
        applicationsPage.SwitchOnList(driver);
        wait(3000);
        applicationsPage.viewAppDetails(driver);
        wait(3000);
//        assertEquals("iana", getDriver().findElement(By.id("first")).getAttribute("value"));
//        wait(1000);
//        assertEquals("gusti", getDriver().findElement(By.id("last")).getAttribute("value"));
//        wait(1000);
        applicationsPage.cancelInDetails(driver);
        wait(1000);
        personsPage.logOut(driver);
    }
}
