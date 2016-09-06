package Tests.HR;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
public class JobPositionsPageTest extends BaseTest {


    @Test(groups = { "bad" })
    public void CreateIncorrectJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "!@#$";
        jobPositionsPage.createJobPosition(jobName, driver);
        wait(3000);
        jobPositionsPage.cancel(driver);
        wait(6000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })
    public void CreateCorrectJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "QA Job";
        jobPositionsPage.createJobPosition(jobName,driver);


    }

    @Test(groups = { "bad" })
    public void CreateShortJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "a";
        jobPositionsPage.createJobPosition(jobName, driver);
        wait(3000);
        jobPositionsPage.cancel(driver);
        wait(6000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "bad" })
    public void CreateEmptyJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "";
        jobPositionsPage.createJobPosition(jobName, driver);
        wait(3000);
        jobPositionsPage.cancel(driver);
        wait(6000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })
    public void DetailsOfJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        jobPositionsPage.viewJobDetails(driver);
        wait(2000);
        jobPositionsPage.cancel(driver);
//        assertEquals("QA", getDriver().findElement(By.cssSelector("h3.left")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }

    @Test(groups = { "good" })
    public void EditJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(4000);
        jobPositionsPage.editJobPosition(driver);
        wait(4000);
        personsPage.logOut(driver);

    }

    @Test(groups = { "good" })
    public void RemoveJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        jobPositionsPage.removeJobPosition(driver);
        wait(3000);
        alertAcept(driver);
        wait(4000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
//        wait(1000);
        personsPage.logOut(driver);
    }
}
