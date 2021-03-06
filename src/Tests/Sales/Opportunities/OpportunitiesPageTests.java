//package Tests.Sales.Opportunities;
//
//import Methods.Sales.PersonsPage;
//import Methods.Sales.OpportunitiesPage;
//import Tests.Base.BaseTest;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//import static org.testng.Assert.assertEquals;
//
///**
// * Created by puzzlefacePC on 06.01.14.
// */
//public class OpportunitiesPageTests extends BaseTest {
//    Integer seconds=3000;
//    @Test(groups = { "bad" })
//    public void CreateIncorrectOpportunity() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
//        wait(seconds);
//        String opportunityName = "!@#";
//        //steps
//        opportunityPage.createCorrectOpportunity(opportunityName);
//        wait(1000);
//        alertAcept();
//        opportunityPage.cancel();
//        wait(1000);
//        personsPage.logOut(driver);
//
//    }
//    @Test(groups = { "bad" })
//    public void CreateShortOpportunity() throws InterruptedException, IOException
//    {
//
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
//        wait(seconds);
//        String opportunityName = "a";
//        //steps
//        opportunityPage.createCorrectOpportunity(opportunityName);
//        wait(1000);
//        alertAcept();
//        opportunityPage.cancel();
//        wait(1000);
//        personsPage.logOut(driver);
//      }
//
//    @Test(groups = { "good" })
//    public void CreateCorrectOpportunity() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
//        String opportunityName = "Test";
//        //steps
//        opportunityPage.createCorrectOpportunity(opportunityName);
//
////        assertEquals("New 2", getDriver().findElement(By.cssSelector("div.columnNameDiv.new > h2.columnName")).getText());
//
//        wait(1000);
//        personsPage.logOut(driver);
//    }
//
//    @Test(groups = { "bad" })
//
//    public void CreateOpportunityWithBlankField() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
//        String opportunityName = "";
//        //steps
//        opportunityPage.createCorrectOpportunity(opportunityName);
//        wait(1000);
//        alertAcept();
//        opportunityPage.cancel();
//        wait(1000);
//        personsPage.logOut(driver);
//
//    }
//
//    @Test(groups = { "good" })
//
//    public void DetailsOfOpportunity() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
//        opportunityPage.viewOpportunityDetails();
//        wait(1000);
////        assertEquals("MS", getDriver().findElement(By.id("name")).getAttribute("value"));
//        opportunityPage.cancel();
//        wait(1000);
//        personsPage.logOut(driver);
//
//    }
//
//    @Test(groups = { "good" })
//
//    public void OpportunityStage() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
//        wait(1000);
//        opportunityPage.SwitchToListView();
//        wait(1000);
//        opportunityPage.ChangeStage();
//        personsPage.logOut(driver);
//
//    }
//
//    @Test(groups = { "good" })
//
//    public void RemoveOpportunity() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        OpportunitiesPage opportunityPage = personsPage.switchToOpportunities(driver);
//        opportunityPage.SwitchToListView();
//        wait(1000);
//        opportunityPage.removeOpportunity();
//        wait(1000);
//        alertAcept();
////        String contentHolder = opportunityPage.getProperty("content-holder.value");
////        assertEquals("0 - 0 of 0 items", contentHolder);
//        wait(1000);
//        personsPage.logOut(driver);
//
//    }
//
//
//}
