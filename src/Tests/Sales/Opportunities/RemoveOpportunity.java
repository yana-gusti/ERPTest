package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class RemoveOpportunity extends BaseTest {
    Integer seconds = 10000;
    @Test(groups = { "good" })

    public void RemoveOpportunity() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        opportunityPage.SwitchToListView(driver);
        wait(seconds);
        opportunityPage.removeOpportunity(driver);
        wait(seconds);
        alertAcept();
//        String contentHolder = opportunityPage.getProperty("content-holder.value");
//        assertEquals("0 - 0 of 0 items", contentHolder);
        wait(seconds);
        personsPage.logOut(driver);

    }

}
