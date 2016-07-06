package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class RemoveLead extends BaseTest {
    @Test(groups = { "good" })

    public void RemoveLead() throws InterruptedException, IOException
    {
        Integer seconds=10000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.viewLeadDetails(driver);
        wait(3000);
        leadsPage.removeLead(driver);
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }
}
