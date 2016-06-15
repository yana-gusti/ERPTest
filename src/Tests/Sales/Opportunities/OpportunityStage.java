package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class OpportunityStage extends BaseTest {
    @Test(groups = { "good" })

    public void OpportunityStage() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        wait(1000);
        opportunityPage.SwitchToListView(driver);
        wait(1000);
        opportunityPage.ChangeStage(driver);

    }
}
