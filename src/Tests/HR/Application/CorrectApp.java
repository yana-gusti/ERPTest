package Tests.HR.Application;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 23.05.2016.
 */
public class CorrectApp extends BaseTest {
    @Test(groups = { "good" })
    public void CreateCorrectApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        String firstName = "test";
        String lastName = "test";
        applicationsPage.createApplication(firstName, lastName);
        wait(1000);
//        assertEquals("Initial Qualification 1", getDriver().findElement(By.cssSelector("h2.columnName")).getText());
        wait(1000);
        personsPage.logOut();
    }
}
