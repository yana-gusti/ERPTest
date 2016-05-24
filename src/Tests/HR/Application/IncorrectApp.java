package Tests.HR.Application;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 23.05.2016.
 */
public class IncorrectApp extends BaseTest {
    @Test(groups = {"bad"})
    public void CreateIncorrectApp() throws InterruptedException, IOException {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(2000);
        String firstName = "!@#$";
        String lastName = "!@#$";
        applicationsPage.createApplication( firstName, lastName);
        wait(1000);
        applicationsPage.cancel();
        wait(6000);
        personsPage.logOut();
    }
}