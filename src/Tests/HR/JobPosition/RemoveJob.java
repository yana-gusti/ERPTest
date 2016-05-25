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
        wait(1000);
        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
        wait(3000);
        jobPositionsPage.removeJobPosition(driver);
        wait(3000);
        alertAcept();
        wait(4000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
//        wait(1000);
        personsPage.logOut(driver);
    }
}
