package Tests.Sales;

import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 06.01.14.
 */
public class OpportunitiesPageTests extends BaseTest {
    Integer seconds=3000;
    @Test(groups = { "bad" })
    public void CreateIncorrectOpportunity() throws InterruptedException, IOException
    {
     PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
        wait(seconds);
        String opportunityName = opportunityPage.getProperty("opportunityName.bad");
        //steps
        opportunityPage.createCorrectOpportunity(opportunityName);
        wait(1000);
        alertAcept();
        opportunityPage.cancel();
        wait(1000);
        opportunityPage.logOut();

    }
    @Test(groups = { "bad" })
    public void CreateShortOpportunity() throws InterruptedException, IOException
    {

      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
        wait(seconds);
        String opportunityName = opportunityPage.getProperty("opportunityName.short");
        //steps
        opportunityPage.createCorrectOpportunity(opportunityName);
        wait(1000);
        alertAcept();
        opportunityPage.cancel();
        wait(1000);
        opportunityPage.logOut();
      }

//    @Test(groups = { "good" })
//    public void CreateCorrectOpportunity() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(seconds);
//
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
//        wait(seconds);
//        String opportunityName = opportunityPage.getProperty("opportunityName.good");
//        //steps
//        opportunityPage.createCorrectOpportunity(opportunityName);
//
////        assertEquals("New 2", getDriver().findElement(By.cssSelector("div.columnNameDiv.new > h2.columnName")).getText());
//
//        wait(1000);
//        opportunityPage.logOut();
//    }

    @Test(groups = { "bad" })

    public void CreateOpportunityWithBlankField() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
        wait(seconds);
        String opportunityName = opportunityPage.getProperty("opportunityName.empty");
        //steps
        opportunityPage.createCorrectOpportunity(opportunityName);
        wait(1000);
        alertAcept();
        opportunityPage.cancel();
        wait(1000);
        opportunityPage.logOut();

    }

    @Test(groups = { "good" })

    public void DetailsOfOpportunity() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
        wait(seconds);
        opportunityPage.viewOpportunityDetails();
        wait(1000);
//        assertEquals("MS", getDriver().findElement(By.id("name")).getAttribute("value"));
        opportunityPage.cancel();
        wait(1000);
        opportunityPage.logOut();

    }

//    @Test(groups = { "good" })
//
//    public void OpportunityStage() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(1000);
//
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(1000);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
//        wait(1000);
//        opportunityPage.ChangeStage();
//        assertEquals("New (1 / 1 )", getDriver().findElement(By.cssSelector("h2.columnName")).getText());
//        wait(1000);
//        opportunityPage.logOut();
//        wait(1000);
//        String loginForm = loginPage.getProperty("loginForm.id");
//        Assert.assertTrue(loginPage.pageContains(loginForm));
//
//    }
//
    @Test(groups = { "good" })

    public void RemoveOpportunity() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
        wait(seconds);
        opportunityPage.SwitchToListView();
        wait(1000);
        opportunityPage.removeOpportunity();
        wait(1000);
        alertAcept();
//        String contentHolder = opportunityPage.getProperty("content-holder.value");
//        assertEquals("0 - 0 of 0 items", contentHolder);
        wait(1000);
        opportunityPage.logOut();

    }
    @Test(groups = { "good" })
    public void DragAndDropOpportunities() throws InterruptedException, IOException {
     PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities();
        wait(2000);
        String opportunityName = opportunityPage.getProperty("opportunityName.good");
        opportunityPage.createCorrectOpportunity(opportunityName);
        wait(1000);
        opportunityPage.DragDropToQualification();
        wait(1000);
        opportunityPage.DragDropToProposition();
        wait(1000);
        opportunityPage.DragDropToWon();
        wait(1000);
        opportunityPage.DragDropToLost();
        wait(1000);
        opportunityPage.DragDropToNew();
        wait(1000);
        opportunityPage.SwitchToListView();
        wait(1000);
        opportunityPage.logOut();
    }
    @Test(groups = { "good" })
    public void CheckStageOpportunities() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        OpportunitiesPage opportunitiesPage = personsPage.switchToOpportunities();
        opportunitiesPage.SwitchToListView();
        wait(1000);
        String opportunityName = opportunitiesPage.getProperty("opportunityName.good");
        opportunitiesPage.createCorrectOpportunity(opportunityName);
        wait(1000);
        opportunitiesPage.ChangeStage();
        opportunitiesPage.DeselectAllExeptOneInStageFilters();
        opportunitiesPage.SelectOneStage();
        wait(1000);
        opportunitiesPage.logOut();
    }
}
