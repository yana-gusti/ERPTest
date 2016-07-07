package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class CreateIncorrectOpportunity extends BaseTest {
    Integer seconds = 3000;
    @Test(groups = { "bad" })
    public void CreateIncorrectOpportunity() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        wait(seconds);
        String opportunityName = "!@#";
        //steps
        opportunityPage.createCorrectOpportunity(opportunityName, driver);
        wait(seconds);
        opportunityPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);

    }
}
