package Tests.MyProfile;

import Methods.MyProfile.LoginPage;
import Methods.MyProfile.MyProfilePage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by ��������� on 03.08.2015.
 */
public class MyProfilePageTest extends BaseTest {

    @Test(groups = { "good" })
    public void changePassPositive () throws InterruptedException, IOException
    {

        wait(3000);
        LoginPage loginPage = new LoginPage();
        String userName = loginPage.getProperty("username.admin");
        String pass = loginPage.getProperty("password.admin");
        String passNew = loginPage.getProperty("password.admin.new");
        loginPage.login(userName, pass);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile();
        wait(3000);
        myProfilePage.changePass(pass, passNew);
        personsPage.logOut();
        wait(3000);
        loginPage.login(userName, passNew);
        wait(3000);
        PersonsPage personsPage1 = new PersonsPage();
        MyProfilePage myProfilePage1= personsPage1.goToMyProfile();
        wait(3000);
        myProfilePage1.changePass(passNew, pass);
        personsPage.logOut();
    }

    @Test(groups = { "good" })
     public void changePassNegative () throws InterruptedException, IOException {

        wait(3000);
        LoginPage loginPage = new LoginPage();
        String userName = loginPage.getProperty("username.admin");
        String pass = loginPage.getProperty("password.admin");
        String passNew = "11";
        loginPage.login(userName, pass);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile();
        wait(3000);
        myProfilePage.changePass(pass, passNew);

    }

    @Test(groups = { "good" })
    public void changePassEmpty () throws InterruptedException, IOException {

        wait(3000);
        LoginPage loginPage = new LoginPage();
        String userName = loginPage.getProperty("username.admin");
        String pass = loginPage.getProperty("password.admin");
        String passNew = "";
        loginPage.login(userName, pass);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile();
        wait(3000);
        myProfilePage.changePass(pass, passNew);

    }
}
