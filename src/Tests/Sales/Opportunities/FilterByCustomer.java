package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class FilterByCustomer extends BaseTest {

    @Test(groups = { "good" })

    public void FilterByCustomer() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        wait(seconds);
        opportunityPage.openFilterMenu(driver);
        wait(seconds);
        opportunityPage.filterByCustomer(driver);
        wait(seconds);
    }
}