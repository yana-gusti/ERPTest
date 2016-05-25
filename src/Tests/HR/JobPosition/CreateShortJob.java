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

}
