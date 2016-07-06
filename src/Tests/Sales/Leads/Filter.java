package Tests.Sales.Leads;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by yana on 26.05.2016.
 */
public class Filter extends BaseTest {
    @Test(groups = { "good" })

    public void Filter() throws InterruptedException, IOException
    {
        Integer seconds=10000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(1000);
        leadsPage.ChangeStage(driver);
        wait(1000);
//        assertEquals("1 - 0 of 1 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }

}
