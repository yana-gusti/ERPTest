package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class CreateCorrectOpportunity extends BaseTest {
    @Test(groups = { "good" })
    public void CreateCorrectOpportunity() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        wait(3000);
        String opportunityName = "Test";
        //steps
        opportunityPage.createCorrectOpportunity(opportunityName, driver);

//        assertEquals("New 2", getDriver().findElement(By.cssSelector("div.columnNameDiv.new > h2.columnName")).getText());

        wait(1000);
        personsPage.logOut(driver);
    }
}
