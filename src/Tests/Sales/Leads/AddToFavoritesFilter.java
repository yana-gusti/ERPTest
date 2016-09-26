package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class AddToFavoritesFilter extends BaseTest {
    @Test(groups = { "good" })
    public void AddToFavoritesFilter() throws InterruptedException, IOException
    {

        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.openFilterMenu(driver);
        wait(seconds);
        leadsPage.filterByContactName(driver);
        wait(seconds);
        leadsPage.addToFavoritesFilter(driver);
        wait(seconds);

    }
}
