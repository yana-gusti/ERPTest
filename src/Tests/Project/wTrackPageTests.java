package Tests.Project;

import Methods.Accounting.CustomerPaymentsPage;
import Methods.Project.WTrackPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Yana on 31.08.2015.
 */
public class wTrackPageTests extends BaseTest {
    Integer seconds=10000;

    @Test(groups = { "good" })

    public void createwTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        WTrackPage wTrackPage = personsPage.switchToWTrack(driver);
        wait(seconds);
        wTrackPage.createwTrackItem(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void editwTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        WTrackPage wTrackPage = personsPage.switchToWTrack(driver);
        wait(seconds);
        wTrackPage.editwTrackItem(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }




    @Test(groups = { "good" })

    public void removewTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        WTrackPage wTrackPage = personsPage.switchToWTrack(driver);
        wTrackPage.removewTrackItem(driver);
        personsPage.logOut(driver);
    }
}
