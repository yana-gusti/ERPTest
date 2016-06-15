package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class CreateOpportunityWithBlankField extends BaseTest {
    @Test(groups = { "bad" })

    public void CreateOpportunityWithBlankField() throws InterruptedException, IOException
    {
        String opportunityName = "";
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        wait(3000);

        //steps
        opportunityPage.createCorrectOpportunity(opportunityName, driver);
        wait(3000);
        opportunityPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);

    }
}
