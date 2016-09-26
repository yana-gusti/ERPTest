package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class SearchOpportunity extends BaseTest {

    @Test(groups = { "good" })

    public void SearchOpportunity() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        wait(seconds);
        opportunityPage.search(driver);
        wait(seconds);
    }
}