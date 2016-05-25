package Tests.HR.JobPosition;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class EditJob extends BaseTest {

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

}
