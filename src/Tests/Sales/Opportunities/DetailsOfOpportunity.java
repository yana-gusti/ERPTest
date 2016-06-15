package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class DetailsOfOpportunity extends BaseTest {
    @Test(groups = { "good" })

    public void DetailsOfOpportunity() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        opportunityPage.viewOpportunityDetails(driver);
        wait(1000);
//        assertEquals("MS", getDriver().findElement(By.id("name")).getAttribute("value"));
        opportunityPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);

    }
}
