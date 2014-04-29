package Tests;

import Methods.MyProfilePage;
import Methods.Sales.PersonsPage;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Дом on 27.03.14.
 */
public class MyProfilePageTests extends BaseTest {
    @Test(groups = {"good"})
    public void ChangePasswordTest() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        MyProfilePage profilePage = personsPage.SwithToProfile();
        profilePage.SetNewPassword();
        profilePage.LogOut();
        profilePage.LoginWithNewPassword();
        profilePage.SwitchToProfile();
        profilePage.SetOldPassword();
        profilePage.LogOut();
    }
}
