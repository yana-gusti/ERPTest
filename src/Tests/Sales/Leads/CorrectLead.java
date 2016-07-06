package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 26.05.2016.
 */
public class CorrectLead extends BaseTest {
    @Test(groups = { "good" })
    public void CreateCorrectLead() throws InterruptedException, IOException
    {
        Integer seconds=10000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        String leadsName = "MS";
        //steps
        leadsPage.createCorrectLead(leadsName, driver);
//        assertEquals("MS", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());

        wait(5000);

        personsPage.logOut(driver);
    }
}
