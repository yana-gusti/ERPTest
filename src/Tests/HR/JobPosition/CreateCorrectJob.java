package Tests.HR.JobPosition;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateCorrectJob extends BaseTest{
    @Test(groups = { "good" })
    public void CreateCorrectJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(4000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(4000);
        String jobName = "QA Job";
        jobPositionsPage.createJobPosition(jobName, driver);


    }
}
