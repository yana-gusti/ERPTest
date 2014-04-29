package Tests.Sales;

import Methods.Sales.PersonsPage;
import Methods.Sales.SalesDashboard;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Любомир on 21.03.14.
 */
public class SalesDashboardTest extends BaseTest {
    @Test(groups = {"good"})
    public void SalesDashboard() throws InterruptedException, IOException {
     PersonsPage personsPage = GoToPersonPage();
        wait(2000);
        SalesDashboard DashboardPage = personsPage.switchToSalesDashboard();
        DashboardPage.LeadsByDate7D();
        DashboardPage.LeadsByDate30D();
        DashboardPage.LeadsByDate90D();
        DashboardPage.LeadsByDate12M();
        DashboardPage.SwitchToLeadsBySourse();
        DashboardPage.LeadsBySourceAll();
        DashboardPage.LogOut();
    }
}
