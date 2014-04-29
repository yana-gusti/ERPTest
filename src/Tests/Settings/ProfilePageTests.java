package Tests.Settings;

import Methods.Sales.PersonsPage;
import Methods.Settings.ProfilePage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 24.03.14
 * Time: 14:23
 * To change this template use File | Settings | File Templates.
 */
public class ProfilePageTests extends BaseTest {
    Integer seconds=3000;

    @Test(groups = {"good"})
    public void CreateCorrectProfile() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        ProfilePage profilePage = personsPage.switchToProfile();
        wait(seconds);
        String profileName = profilePage.getProperty("profileName.good") ;
        profilePage.CreateNewProfile(profileName);
        wait(1000);
        profilePage.Logout();
    }
    @Test(groups = {"bad"})
    public void CreateIncorrectProfile() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        ProfilePage profilePage = personsPage.switchToProfile();
        wait(seconds);
        String profileName = profilePage.getProperty("profileName.bad") ;
        profilePage.CreateNewProfile(profileName);
        wait(1000);
        alertAcept();
        wait(1000);
        profilePage.Cancel();
        wait(1000);
        profilePage.Logout();
    }
    @Test(groups = {"bad"})
    public void CreateProfileWithEmptyField() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        ProfilePage profilePage = personsPage.switchToProfile();
        wait(seconds);
        String profileName = profilePage.getProperty("profileName.empty") ;
        profilePage.CreateNewProfile(profileName);
        wait(1000);
        alertAcept();
        wait(1000);
        profilePage.Cancel();
        wait(2000);
        profilePage.Logout();
    }
    @Test(groups = {"good"})
    public void EditProfile() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        ProfilePage profilePage = personsPage.switchToProfile();
        wait(seconds);
        String profileName = profilePage.getProperty("profileName.good") ;
        profilePage.CreateNewProfile(profileName);
        wait(1000);
        profilePage.EditProfile();
        wait(1000);
        profilePage.Logout();
    }
    @Test(groups = {"good"})
    public void DeleteProfile() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        ProfilePage profilePage = personsPage.switchToProfile();
        wait(seconds);
        profilePage.DeleteProfile();
        wait(1000);
        alertAcept();
        wait(1000);
        profilePage.Logout();
    }
}
