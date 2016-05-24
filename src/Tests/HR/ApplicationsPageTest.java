package Tests.HR;

import Methods.HR.ApplicationsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
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
       PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(2000);
        String firstName = applicationsPage.getProperty("firstName.bad");
        String lastName = applicationsPage.getProperty("lastName.bad");
        applicationsPage.createApplication(driver, firstName, lastName);
        wait(1000);
        applicationsPage.cancel(driver);
        wait(6000);
        applicationsPage.logOut(driver);
    }

    @Test(groups = { "good" })
    public void CreateCorrectApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        String firstName = applicationsPage.getProperty("firstName.good");
        String lastName = applicationsPage.getProperty("lastName.good");
        applicationsPage.createApplication(driver, firstName, lastName);
        wait(1000);
//        assertEquals("Initial Qualification 1", getDriver().findElement(By.cssSelector("h2.columnName")).getText());
        wait(1000);
        applicationsPage.logOut(driver);
    }

    @Test(groups = { "bad" })
    public void CreateShortApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        String firstName = applicationsPage.getProperty("firstName.short");
        String lastName = applicationsPage.getProperty("lastName.short");
        applicationsPage.createApplication(driver, firstName, lastName);
        wait(1000);
        applicationsPage.cancel(driver);
        wait(6000);
        applicationsPage.logOut(driver);
    }

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

    @Test(groups = { "good" })
    public void DetailsOfApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
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
        applicationsPage.logOut(driver);
    }

//    @Test(groups = { "good" })
//    public void DoEmployeeFromApp() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(3000);
//        ApplicationsPage applicationsPage = personsPage.switchToApplication();
//        wait(3000);
//        applicationsPage.SwitchOnList();
//        wait(1000);
//        applicationsPage.viewAppDetails();
//        wait(3000);
//        applicationsPage.createEmployee();
//        wait(1000);
////        assertTrue(isElementPresent(By.linkText( gusti")));
//        wait(10000);
//        applicationsPage.logOut();
//    }

    @Test(groups = { "good" })
    public void RemoveApp() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(3000);
        applicationsPage.SwitchOnList(driver);
        wait(5000);
        applicationsPage.removeApp(driver);
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("1 - 1 of 1 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());

        wait(1000);
        applicationsPage.logOut(driver);
    }
//    @Test(groups = { "good" })
//    public void DragAndDropApplications() throws InterruptedException, IOException {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(3000);
//        ApplicationsPage applicationsPage = personsPage.switchToApplication();
//        wait(1000);
//        String firstName = applicationsPage.getProperty("firstName.good");
//        String lastName = applicationsPage.getProperty("lastName.good");
//        applicationsPage.createApplication(firstName, lastName);
//        wait(5000);
//        applicationsPage.DragDropToReadyToTeach();
//        wait(2000);
//        applicationsPage.DragDropToReadyFirstInterview();
//        wait(2000);
//        applicationsPage.DragDropToSecondInterview();
//        wait(2000);
//        applicationsPage.DragDropToIntership();
//        wait(2000);
//        applicationsPage.DragDropToContractSigned();
//        wait(2000);
//        applicationsPage.DragDropToContaractEnd();
//        wait(2000);
//        applicationsPage.DragDropToRefused();
//        wait(2000);
//        applicationsPage.DragDropToInitialQualification();
//        wait(1000);
//        applicationsPage.logOut();
//    }

}
