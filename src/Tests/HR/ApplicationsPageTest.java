package Tests.HR;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationsPageTest extends BaseTest {
    @Test(groups = { "bad" })
    public void CreateIncorrectApp() throws InterruptedException, IOException
    {
        PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(2000);
        String firstName = applicationsPage.getProperty("firstName.bad");
        String lastName = applicationsPage.getProperty("lastName.bad");
        applicationsPage.createApplication(firstName, lastName);
        wait(1000);
//        assertEquals("First name field value is incorrect. It should start with letter or number\nLast name field value is incorrect. It should start with letter or number", closeAlertAndGetItsText());
        alertAcept();
        wait(1000);
        applicationsPage.cancel();
        wait(1000);
        applicationsPage.logOut();
    }

//    @Test(groups = { "good" })
//    public void CreateCorrectApp() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(3000);
//
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(3000);
//        ApplicationsPage applicationsPage = personsPage.switchToApplication();
//        wait(3000);
//        String firstName = applicationsPage.getProperty("firstName.good");
//        String lastName = applicationsPage.getProperty("lastName.good");
//        applicationsPage.createApplication(firstName, lastName);
//        wait(1000);
////        assertEquals("Initial Qualification 1", getDriver().findElement(By.cssSelector("h2.columnName")).getText());
//        wait(1000);
//        applicationsPage.logOut();
//    }

    @Test(groups = { "bad" })
    public void CreateShortApp() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        String firstName = applicationsPage.getProperty("firstName.short");
        String lastName = applicationsPage.getProperty("lastName.short");
        applicationsPage.createApplication(firstName, lastName);
        wait(1000);
//        assertEquals("First name field should be at least 2 characters long\nLast name field should be at least 2 characters long", closeAlertAndGetItsText());
        alertAcept();
        wait(1000);
        applicationsPage.cancel();
        wait(1000);
        applicationsPage.logOut();
    }

    @Test(groups = { "bad" })
    public void CreateEmptyApp() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        String firstName = applicationsPage.getProperty("firstName.empty");
        String lastName = applicationsPage.getProperty("lastName.empty");
        applicationsPage.createApplication(firstName, lastName);
        wait(1000);
//        assertEquals("First name field can not be empty\nLast name field can not be empty", closeAlertAndGetItsText());
        alertAcept();
        wait(1000);
        applicationsPage.cancel();
        wait(1000);
        applicationsPage.logOut();
    }

    @Test(groups = { "good" })
    public void DetailsOfApp() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        applicationsPage.SwitchOnList();
        wait(1000);
        applicationsPage.viewAppDetails();
        wait(1000);
//        assertEquals("iana", getDriver().findElement(By.id("first")).getAttribute("value"));
//        wait(1000);
//        assertEquals("gusti", getDriver().findElement(By.id("last")).getAttribute("value"));
//        wait(1000);
        applicationsPage.cancelInDetails();
        wait(1000);
        applicationsPage.logOut();
    }

    @Test(groups = { "good" })
    public void DoEmployeeFromApp() throws InterruptedException, IOException
    {
        PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        applicationsPage.SwitchOnList();
        wait(1000);
        applicationsPage.viewAppDetails();
        wait(1000);
        applicationsPage.createEmployee();
        wait(1000);
//        assertTrue(isElementPresent(By.linkText( gusti")));
        wait(1000);
        applicationsPage.logOut();
    }

    @Test(groups = { "good" })
    public void RemoveApp() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        applicationsPage.SwitchOnList();
        wait(2000);
        applicationsPage.removeApp();
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("1 - 1 of 1 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());

        wait(1000);
        applicationsPage.logOut();
    }
    @Test(groups = { "good" })
    public void DragAndDropApplications() throws InterruptedException, IOException {
        PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(1000);
        String firstName = applicationsPage.getProperty("firstName.good");
        String lastName = applicationsPage.getProperty("lastName.good");
        applicationsPage.createApplication(firstName, lastName);
        wait(1000);
        applicationsPage.DragDropToReadyToTeach();
        applicationsPage.DragDropToReadyFirstInterview();
        applicationsPage.DragDropToSecondInterview();
        applicationsPage.DragDropToIntership();
        applicationsPage.DragDropToContractSigned();
        applicationsPage.DragDropToContaractEnd();
        applicationsPage.DragDropToRefused();
        applicationsPage.DragDropToInitialQualification();
        wait(1000);
        applicationsPage.logOut();
    }
    @Test(groups = {"good"})
    public void CheckStage() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(1000);
        String firstName = applicationsPage.getProperty("firstName.good");
        String lastName = applicationsPage.getProperty("lastName.good");
        applicationsPage.createApplication(firstName, lastName);
        wait(1000);
        applicationsPage.SwitchToListView();
        wait(1000);
//        applicationsPage.ChangeStage();
        applicationsPage.DeselectAllExeptOneInStageFilters();
        applicationsPage.SelectFromStageFilter();
        wait(1000);
        applicationsPage.logOut();

    }
}
