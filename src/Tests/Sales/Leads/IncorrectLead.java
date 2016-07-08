package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class IncorrectLead extends BaseTest {




    @Test(groups = { "bad" })
    public void CreateIncorrectLead() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        String leadName = "!!!!";
        //steps
        leadsPage.createCorrectLead(leadName, driver);
        wait(4000);
        leadsPage.cancel(driver);
    }
}
