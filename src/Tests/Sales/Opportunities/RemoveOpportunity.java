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
    @Test(groups = { "good" })

    public void RemoveOpportunity() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        opportunityPage.SwitchToListView(driver);
        wait(1000);
        opportunityPage.removeOpportunity(driver);
        wait(1000);
        alertAcept();
//        String contentHolder = opportunityPage.getProperty("content-holder.value");
//        assertEquals("0 - 0 of 0 items", contentHolder);
        wait(1000);
        personsPage.logOut(driver);

    }

}
