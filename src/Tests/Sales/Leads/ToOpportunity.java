package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class ToOpportunity extends BaseTest {
    @Test(groups = { "good" })

    public void ToOpportunity() throws InterruptedException, IOException
    {
        Integer seconds = 3000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(3000);
        leadsPage.viewLeadDetails(driver);
        wait(1000);
        leadsPage.convertToOpportunity(driver);
        wait(3000);
        personsPage.logOut(driver);

    }
}