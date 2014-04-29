package Tests.Settings;

import Methods.Sales.PersonsPage;
import Methods.Settings.GroupPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 24.03.14
 * Time: 14:59
 * To change this template use File | Settings | File Templates.
 */
public class GroupPageTests extends BaseTest {
    Integer seconds=3000;
    @Test(groups = { "good" })
    public void CreateCorrectGroup() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        GroupPage groupPage= personsPage.switchToGroup();
        wait(seconds);
        String name = groupPage.getProperty("groupname.good");
        groupPage.CreateGroup(name);
        wait(1000);
        groupPage.LogOut();

    }
    @Test(groups = { "bad" })
    public void CreateIncorrectGroup() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        GroupPage groupPage= personsPage.switchToGroup();
        wait(seconds);
        String name = groupPage.getProperty("groupname.bad");
        groupPage.CreateGroup(name);
        wait(1000);
        alertAcept();
        wait(1000);
        groupPage.CancelButton();
        wait(1000);
        groupPage.LogOut();
    }
    @Test(groups = { "bad" })
    public void CreateGroupWithEmptyFields() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        GroupPage groupPage= personsPage.switchToGroup();
        wait(seconds);
        String name = groupPage.getProperty("groupname.empty");
        groupPage.CreateGroup(name);
        wait(1000);
        alertAcept();
        wait(1000);
        groupPage.CancelButton();
        wait(1000);
        groupPage.LogOut();
    }
    @Test(groups = { "good" })
    public void EditGroup() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        GroupPage groupPage= personsPage.switchToGroup();
        wait(seconds);
        groupPage.EditGroup();
        wait(1000);
        groupPage.LogOut();

    }
    @Test(groups = { "good" })
    public void RemoveGroup() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        GroupPage groupPage= personsPage.switchToGroup();
        wait(seconds);
        groupPage.DeleteGroup();
        wait(1000);
        alertAcept();
        wait(1000);
        groupPage.LogOut();
    }
}
