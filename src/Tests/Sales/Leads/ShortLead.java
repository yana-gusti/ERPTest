package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class ShortLead extends BaseTest {
    @Test(groups = { "bad" })
    public void CreateShortLead() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(10000);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(10000);
        String leadsName = "a";
        //steps
        leadsPage.createCorrectLead(leadsName, driver);
        wait(4000);
        leadsPage.cancel(driver);
        wait(3000);
        personsPage.logOut(driver);
    }
}
