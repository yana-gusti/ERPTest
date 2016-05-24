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

    PersonsPage personsPage;
    @Test(groups = { "bad" })
    public void CreateIncorrectJob() throws InterruptedException, IOException
    {
     personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "!@#$";
        jobPositionsPage.createJobPosition(jobName);
        wait(3000);
        jobPositionsPage.cancel();
        wait(6000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })
    public void CreateCorrectJob() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "QA Job";
        jobPositionsPage.createJobPosition(jobName);


    }

    @Test(groups = { "bad" })
    public void CreateShortJob() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "a";
        jobPositionsPage.createJobPosition(jobName);
        wait(3000);
        jobPositionsPage.cancel();
        wait(6000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "bad" })
    public void CreateEmptyJob() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        String jobName = "";
        jobPositionsPage.createJobPosition(jobName);
        wait(3000);
        jobPositionsPage.cancel();
        wait(6000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })
    public void DetailsOfJob() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        jobPositionsPage.viewJobDetails();
        wait(2000);
        jobPositionsPage.cancel();
//        assertEquals("QA", getDriver().findElement(By.cssSelector("h3.left")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }

    @Test(groups = { "good" })
    public void EditJob() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(4000);
        jobPositionsPage.editJobPosition();
        wait(4000);
        personsPage.logOut(driver);

    }

    @Test(groups = { "good" })
    public void RemoveJob() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        jobPositionsPage.removeJobPosition();
        wait(3000);
        alertAcept();
        wait(4000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
//        wait(1000);
        personsPage.logOut(driver);
    }
}
