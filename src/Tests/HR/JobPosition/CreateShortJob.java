package Tests.HR.JobPosition;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateShortJob extends BaseTest {
    Integer seconds=10000;
    @Test(groups = { "bad" })
    public void CreateShortJob() throws InterruptedException, IOException
    {

        PersonsPage personsPage = GoToPersonsPage();
        wait();
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(seconds);
        String jobName = "a";
        jobPositionsPage.createJobPosition(jobName, driver);
        wait(seconds);
        jobPositionsPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }

}
