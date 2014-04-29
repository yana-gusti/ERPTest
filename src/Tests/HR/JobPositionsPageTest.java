package Tests.HR;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
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
      PersonsPage  personsPage = GoToPersonPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
        wait(1000);
        String jobName = jobPositionsPage.getProperty("jobName.bad");
        jobPositionsPage.createJobPosition(jobName);
        wait(1000);
        alertAcept();
        wait(1000);
        jobPositionsPage.cancel();
        wait(1000);
        jobPositionsPage.logOut();
    }

    @Test(groups = { "good" })
    public void CreateCorrectJob() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
        wait(1000);
        String jobName = jobPositionsPage.getProperty("jobName.good");
        jobPositionsPage.createJobPosition(jobName);
        wait(1000);
        assertEquals("QA", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        wait(1000);
        jobPositionsPage.logOut();

    }

    @Test(groups = { "bad" })
    public void CreateShortJob() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
        wait(1000);
        String jobName = jobPositionsPage.getProperty("jobName.short");
        jobPositionsPage.createJobPosition(jobName);
        wait(1000);
        alertAcept();
        wait(1000);
        jobPositionsPage.cancel();
        wait(1000);
        jobPositionsPage.logOut();
    }

    @Test(groups = { "bad" })
    public void CreateEmptyJob() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
        wait(1000);
        String jobName = jobPositionsPage.getProperty("jobName.empty");
        jobPositionsPage.createJobPosition(jobName);
        wait(1000);
        alertAcept();
        wait(1000);
        jobPositionsPage.cancel();
        wait(1000);
        jobPositionsPage.logOut();
    }

    @Test(groups = { "good" })
    public void DetailsOfJob() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
        wait(1000);
        jobPositionsPage.viewJobDetails();
        wait(1000);
        jobPositionsPage.cancel();
//        assertEquals("QA", getDriver().findElement(By.cssSelector("h3.left")).getText());
        wait(1000);
        jobPositionsPage.logOut();

    }

//    @Test(groups = { "good" })
//    public void EditJob() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(3000);
//
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(1000);
//        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
//        wait(1000);
//        jobPositionsPage.viewJobDetails();
//        wait(1000);
//        jobPositionsPage.editJobPosition();
//        wait(1000);
//        assertEquals("Main", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
//        wait(1000);
//        jobPositionsPage.logOut();
//
//    }

    @Test(groups = { "good" })
    public void RemoveJob() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
        wait(1000);
        jobPositionsPage.removeJobPosition();
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
//        wait(1000);
        jobPositionsPage.logOut();
    }
}
