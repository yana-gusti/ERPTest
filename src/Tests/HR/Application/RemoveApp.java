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
    public void RemoveApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication(driver);
        wait(3000);
        applicationsPage.SwitchOnList(driver);
        wait(5000);
        applicationsPage.viewAppDetails(driver);
        wait(1000);
        applicationsPage.removeApp(driver);
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("1 - 1 of 1 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());

        wait(1000);
        personsPage.logOut(driver);
    }
}
