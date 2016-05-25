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

    @Test(groups = { "bad" })
    public void CreateEmptyJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(5000);
        String jobName = "";
        jobPositionsPage.createJobPosition(jobName, driver);
        wait(3000);
        jobPositionsPage.cancel(driver);
        wait(6000);
        personsPage.logOut(driver);
    }

}
