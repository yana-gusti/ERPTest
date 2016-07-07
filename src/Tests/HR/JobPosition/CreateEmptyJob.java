package Tests.HR.JobPosition;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateEmptyJob extends BaseTest {
    Integer seconds=4000;
    @Test(groups = { "bad" })
    public void CreateEmptyJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(seconds);
        String jobName = "";
        jobPositionsPage.createJobPosition(jobName, driver);
        wait(seconds);
        jobPositionsPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }

}
