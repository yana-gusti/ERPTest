package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class VerifyPersonPerPage extends BaseTest {
    @Test(groups = { "good" })
    public void VerifyPersonPerPage() throws InterruptedException, IOException {

        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        String first = "qwe";
        String last = "qwe";
        personsPage.createCorrectPerson(first,last,driver);
        wait(1000);
        String firstTwo = "qaz";
        String lastTwo = "qaz";
        personsPage.createCorrectPerson(firstTwo,lastTwo, driver);
        wait(1000);
        String firstThree = "qsx";
        String lastThree = "qsx";
        personsPage.createCorrectPerson(firstThree,lastThree, driver);
        wait(1000);
        String firstFour= "qdc";
        String lastFour = "qdc";
        personsPage.createCorrectPerson(firstFour,lastFour, driver);
        wait(1000);
        String firstFive = "rfv";
        String lastFive = "rfv";
        personsPage.createCorrectPerson(firstFive,lastFive, driver);
        wait(1000);
        String firstSix = "aaa";
        String lastSix = "aaa";
        personsPage.createCorrectPerson(firstSix,lastSix, driver);
        wait(1000);
        personsPage.SwitchOnList(driver);
        wait(1000);
        personsPage.Select5PerPage(driver);
        wait(1000);
        personsPage.NextPage(driver);
        wait(1000);
        personsPage.removePerson(driver);
        wait(1000);
        alertAcept();
        wait(1000);
        personsPage.logOut(driver);
    }
}
