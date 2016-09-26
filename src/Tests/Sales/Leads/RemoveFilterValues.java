package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class RemoveFilterValues extends BaseTest {
    @Test(groups = { "good" })
    public void RemoveFilterValues() throws InterruptedException, IOException
    {

        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.openFilterMenu(driver);
        wait(seconds);
        leadsPage.filterBySource(driver);
        wait(seconds);
        leadsPage.removeFilterValueFilter(driver);
        wait(seconds);

    }
}
