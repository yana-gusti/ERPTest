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
        String userName = "yana.gusti";
        String pass = "thinkmobiles2015";
        String passNew = "222222";
        loginPage.login(userName, pass,driver);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile(driver);
        wait(3000);
        myProfilePage.changePass(pass, passNew);
        personsPage.logOut(driver);
        wait(3000);
        loginPage.login(userName, passNew,driver);
        wait(3000);
        PersonsPage personsPage1 = new PersonsPage();
        MyProfilePage myProfilePage1= personsPage1.goToMyProfile(driver);
        wait(3000);
        myProfilePage1.changePass(passNew, pass);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })
     public void changePassNegative () throws InterruptedException, IOException {

        wait(3000);
        LoginPage loginPage = new LoginPage();
        String userName = "yana.gusti";
        String pass = "thinkmobiles2015";
        String passNew = "11";
        loginPage.login(userName, pass, driver);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile(driver);
        wait(3000);
        myProfilePage.changePass(pass, passNew);

    }

    @Test(groups = { "good" })
    public void changePassEmpty () throws InterruptedException, IOException {

        wait(3000);
        LoginPage loginPage = new LoginPage();
        String userName = "yana.gusti";
        String pass = "thinkmobiles2015";
        String passNew = "";
        loginPage.login(userName, pass, driver);
        PersonsPage personsPage = new PersonsPage();
        MyProfilePage myProfilePage= personsPage.goToMyProfile(driver);
        wait(3000);
        myProfilePage.changePass(pass, passNew);

    }
}
