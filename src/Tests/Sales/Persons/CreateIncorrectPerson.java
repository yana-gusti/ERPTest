package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class CreateIncorrectPerson extends BaseTest {
    Integer seconds = 10000;
    @Test(groups = { "bad" })
    public void CreateIncorrectPerson() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        String firstName = "!@#";
        String lastName = "!@#";
        personsPage.createCorrectPerson(firstName, lastName, driver);
        wait(seconds);
        personsPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);
        wait(seconds);

    }
}
