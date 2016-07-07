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
    Integer seconds=10000;
    @Test(groups = { "good" })
    public void DetailsOfApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(seconds);
        applicationsPage.SwitchOnList(driver);
        wait(seconds);
        applicationsPage.viewAppDetails(driver);
        wait(seconds);
//        assertEquals("iana", getDriver().findElement(By.id("first")).getAttribute("value"));
//        wait(1000);
//        assertEquals("gusti", getDriver().findElement(By.id("last")).getAttribute("value"));
//        wait(1000);
        applicationsPage.cancelInDetails(driver);
    }
}
