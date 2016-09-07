package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class ToOpportunityWithoutCustomer extends BaseTest {
    @Test(groups = { "good" })

    public void ToOpportunityWithout() throws InterruptedException, IOException
    {

        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.viewLeadDetails(driver);
        wait(seconds);
        leadsPage.convertToOpportunity(driver);
        wait(seconds);
        leadsPage.selectWithoutCustomer(driver);
        wait(seconds);
        leadsPage.selectWithoutCustomerFromMenu(driver);
        wait(seconds);
        leadsPage.createOpportunity(driver);

    }
}
