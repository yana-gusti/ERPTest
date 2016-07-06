package Tests.Sales.Leads;

import Methods.Sales.PersonsPage;
import Methods.Sales.LeadsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class LeadsPageTests extends BaseTest {
    Integer seconds=10000;



    @Test(groups = { "bad" })
    public void CreateIncorrectLead() throws InterruptedException, IOException
    {
       PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        String leadName = "!!!!";
        //steps
        leadsPage.createCorrectLead(leadName, driver);
        wait(4000);
        leadsPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);
    }
    @Test(groups = { "bad" })
    public void CreateShortLead() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        String leadsName = "a";
        //steps
        leadsPage.createCorrectLead(leadsName, driver);
        wait(4000);
        leadsPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);
}


    @Test(groups = { "good" })
    public void CreateCorrectLead() throws InterruptedException, IOException
    {
        Integer seconds=3000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        String leadsName = "MS";
        //steps
        leadsPage.createCorrectLead(leadsName, driver);
//        assertEquals("MS", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());

        wait(1000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "bad" })

    public void CreateLeadWithBlankField() throws InterruptedException, IOException
    {
        Integer seconds=3000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        String leadsName = "";
        //steps
        leadsPage.createCorrectLead(leadsName, driver);
        wait(1000);
        alertAcept();
        wait(1000);
        leadsPage.cancel(driver);
    }

    @Test(groups = { "good" })

      public void DetailsOfLead() throws InterruptedException, IOException
    {
        Integer seconds=3000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.viewLeadDetails(driver);
        wait(1000);
        leadsPage.cancel(driver);
//        assertEquals("MS", getDriver().findElement(By.cssSelector("h2")).getText());
        wait(2000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void Filter() throws InterruptedException, IOException
    {
        Integer seconds=3000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(1000);
        leadsPage.ChangeStage(driver);
        wait(1000);
        assertEquals("1 - 0 of 1 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }

    @Test(groups = { "good" })

    public void RemoveLead() throws InterruptedException, IOException
    {
        Integer seconds=3000;
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        leadsPage.viewLeadDetails(driver);
        wait(2000);
        leadsPage.removeLead(driver);
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }
    @Test(groups = { "good" })

    public void ToOpportunity() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads(driver);
        wait(seconds);
        String leadsName = "MS";
        //steps
        leadsPage.createCorrectLead(leadsName, driver);
        wait(1000);
        leadsPage.viewLeadDetails(driver);
        wait(1000);
        leadsPage.convertToOpportunity(driver);
        wait(3000);
        personsPage.logOut(driver);

    }


}
