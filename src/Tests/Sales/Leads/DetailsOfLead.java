package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class DetailsOfLead extends BaseTest {
    @Test(groups = { "good" })

    public void DetailsOfLead() throws InterruptedException, IOException
    {
        Integer seconds=3000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.viewLeadDetails(driver);
        wait(1000);
        leadsPage.cancel(driver);
//        assertEquals("MS", getDriver().findElement(By.cssSelector("h2")).getText());
        wait(2000);
        personsPage.logOut(driver);
    }

}
