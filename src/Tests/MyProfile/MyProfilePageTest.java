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
    Integer seconds=10000;

    @Test(groups = { "good" })
    public void changePassPositive () throws InterruptedException, IOException
    {

        wait(seconds);
        LoginPage loginPage = new LoginPage();
        String userName = "yana.gusti";
        String pass = "thinkmobiles2015";
        String passNew = "222222";
        loginPage.login(userName, pass,driver);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile(driver);
        wait(seconds);
        myProfilePage.changePass(pass, passNew);
        personsPage.logOut(driver);
        wait(seconds);
        loginPage.login(userName, passNew,driver);
        wait(seconds);
        PersonsPage personsPage1 = new PersonsPage();
        MyProfilePage myProfilePage1= personsPage1.goToMyProfile(driver);
        wait(seconds);
        myProfilePage1.changePass(passNew, pass);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })
     public void changePassNegative () throws InterruptedException, IOException {

        wait(seconds);
        LoginPage loginPage = new LoginPage();
        String userName = "yana.gusti";
        String pass = "thinkmobiles2015";
        String passNew = "11";
        loginPage.login(userName, pass, driver);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile(driver);
        wait(seconds);
        myProfilePage.changePass(pass, passNew);

    }

    @Test(groups = { "good" })
    public void changePassEmpty () throws InterruptedException, IOException {

        wait(seconds);
        LoginPage loginPage = new LoginPage();
        String userName = "yana.gusti";
        String pass = "thinkmobiles2015";
        String passNew = "";
        loginPage.login(userName, pass, driver);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile(driver);
        wait(seconds);
        myProfilePage.changePass(pass, passNew);

    }
}
