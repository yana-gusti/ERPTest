package Tests.Sales;

import Methods.Sales.LeadsPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class LeadsPageTests extends BaseTest {
    Integer seconds=3000;



    @Test(groups = { "bad" })
    public void CreateIncorrectLead() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads();
        wait(seconds);
        String leadName = leadsPage.getProperty("leadName.bad");
        //steps
        leadsPage.createCorrectLead(leadName);
        wait(1000);
        alertAcept();
        wait(1000);
        leadsPage.cancel();
        wait(1000);
        leadsPage.logOut();
    }
    @Test(groups = { "bad" })
    public void CreateShortLead() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads();
        wait(seconds);
        String leadsName = leadsPage.getProperty("leadsName.short");
        //steps
        leadsPage.createCorrectLead(leadsName);
        wait(1000);
        alertAcept();
        wait(1000);
        leadsPage.cancel();
        wait(1000);
        leadsPage.logOut();
}

    //
//    @Test(groups = { "good" })
//    public void CreateCorrectLead() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(seconds);
//
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(seconds);
//        LeadsPage leadsPage = personsPage.switchToLeads();
//        wait(seconds);
//        String leadsName = leadsPage.getProperty("leadsName.good");
//        //steps
//        leadsPage.createCorrectLead(leadsName);
////        assertEquals("MS", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
//
//        wait(1000);
//        leadsPage.logOut();
//    }

    @Test(groups = { "bad" })

    public void CreateLeadWithBlankField() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads();
        wait(seconds);
        String leadsName = leadsPage.getProperty("leadsName.empty");
        //steps
        leadsPage.createCorrectLead(leadsName);
        wait(1000);
        alertAcept();
        wait(1000);
        leadsPage.cancel();
    }

    @Test(groups = { "good" })

      public void DetailsOfLead() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads();
        wait(seconds);
        leadsPage.viewLeadDetails();
        wait(1000);
        leadsPage.cancel();
//        assertEquals("MS", getDriver().findElement(By.cssSelector("h2")).getText());
        wait(2000);
        leadsPage.logOut();
    }

//    @Test(groups = { "good" })
//
//    public void Filter() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(2000);
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(1000);
//        LeadsPage leadsPage = personsPage.switchToLeads();
//        wait(1000);
//        leadsPage.ChangeStage();
//        wait(1000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
//        wait(1000);
//        leadsPage.logOut();
//
//    }
//
    @Test(groups = { "good" })

    public void RemoveLead() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads();
        wait(seconds);
        leadsPage.viewLeadDetails();
        wait(2000);
        leadsPage.removeLead();
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0 - 0 of 0 items", getDriver().findElement(By.cssSelector("div.countOnPage > div > span")).getText());
        wait(1000);
        leadsPage.logOut();

    }
    @Test(groups = { "good" })

    public void ToOpportunity() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        LeadsPage leadsPage = personsPage.switchToLeads();
        wait(seconds);
        String leadsName = leadsPage.getProperty("leadsName.good");
        //steps
        leadsPage.createCorrectLead(leadsName);
        wait(1000);
        leadsPage.viewLeadDetails();
        wait(1000);
        leadsPage.convertToOpportunity();
        wait(3000);
        leadsPage.logOut();

    }
    @Test(groups = { "good" })
    public void CheckStageLeads() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        LeadsPage leadsPage = personsPage.switchToLeads();
        wait(3000);
        String leadsName = leadsPage.getProperty("leadsName.good");
        leadsPage.createCorrectLead(leadsName);
        wait(3000);
        leadsPage.DeselectAllExeptOneInStageFilters();
        wait(1000);
        leadsPage.SelectOneStage();
        wait(1000);
        leadsPage.logOut();
    }

}
