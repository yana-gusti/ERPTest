package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class CreateIncorrectPerson extends BaseTest {
    @Test(groups = { "bad" })
    public void CreateIncorrectPerson() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        String firstName = "!@#";
        String lastName = "!@#";
        personsPage.createCorrectPerson(firstName, lastName, driver);
        wait(3000);
        personsPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);
        wait(1000);

    }
}
