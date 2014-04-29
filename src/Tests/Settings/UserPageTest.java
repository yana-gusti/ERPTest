package Tests.Settings;

import Methods.Sales.PersonsPage;
import Methods.Settings.UserPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 24.03.14
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
public class UserPageTest  extends BaseTest {
    Integer seconds=3000;

    @Test(groups = { "good" })
    public void CreateCorrectUser() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        UserPage userPage = personsPage.switchToUsers();
        wait(seconds);
        String userName = userPage.getProperty("userName.good");
        userPage.CreateNewUser(userName);
        wait(1000);
        userPage.LogOut();
    }
    @Test(groups = { "bad" })
    public void CreateIncorrectUser() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        UserPage userPage = personsPage.switchToUsers();
        wait(1000);
        String userName = userPage.getProperty("userName.bad");
        userPage.CreateNewUser(userName);
        wait(1000);
        alertAcept();
        wait(1000);
        userPage.Cancel();
        wait(1000);
        userPage.LogOut();
    }
    @Test(groups = { "bad" })
    public void CreateUserWithEmptyFields() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        UserPage userPage = personsPage.switchToUsers();
        wait(1000);
        String userName = userPage.getProperty("userName.empty");
        userPage.CreateNewUser(userName);
        wait(1000);
        alertAcept();
        wait(1000);
        userPage.Cancel();
        wait(1000);
        userPage.LogOut();
    }
    @Test(groups = { "good" })
    public void EditUser() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        UserPage userPage = personsPage.switchToUsers();
        wait(1000);
        userPage.EditUser();
        wait(1000);
        userPage.LogOut();
    }
    @Test(groups = { "good" })
    public void RemoveUser() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        UserPage userPage = personsPage.switchToUsers();
        wait(1000);
        userPage.DeleteUser();
        wait(1000);
        alertAcept();
        wait(1000);
        userPage.LogOut();
    }




}

