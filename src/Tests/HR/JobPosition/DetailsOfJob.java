package Tests.HR.JobPosition;

import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class DetailsOfJob extends BaseTest {

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
}
