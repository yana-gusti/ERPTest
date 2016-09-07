package Tests.Accounting;

import Methods.Accounting.ChartOfAccount;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yanag on 10.08.2016.
 */
public class CreateChartOfAccount extends BaseTest {
    @Test(groups = { "good" })
    public void CreateCorrectChartOFAccount() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
       ChartOfAccount chartOfAccount = personsPage.switchToChartOfAccount(driver);
        wait(seconds);
        chartOfAccount.createChartOfAccount(driver);
        wait(seconds);
    }
}
