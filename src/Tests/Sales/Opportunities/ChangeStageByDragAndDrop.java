package Tests.Sales.Opportunities;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class ChangeStageByDragAndDrop extends BaseTest {

    @Test(groups = { "good" })

    public void ChangeStageByDragAndDrop() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
        wait(seconds);
        opportunityPage.DragDropToProposition(driver);
        wait(seconds);

    }
}
