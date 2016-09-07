package Tests.HR.JobPosition;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class RemoveJob extends BaseTest {

    @Test(groups = { "good" })
    public void RemoveJob() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(seconds);
        jobPositionsPage.removeJobPosition(driver);
        wait(seconds);
        alertAcept(driver);
    }
}
