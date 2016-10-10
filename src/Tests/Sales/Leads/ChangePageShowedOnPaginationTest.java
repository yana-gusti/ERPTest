package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class ChangePageShowedOnPaginationTest extends BaseTest {
    @Test(groups = {"good"})
    public void ChangePageShowedOnPaginationTest() throws InterruptedException, IOException {

        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.changePageShowedOnPagination(driver);
        wait(seconds);


    }
}