package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class CreatePersonWithBlankFields extends BaseTest {
    @Test(groups = { "bad" })

    public void CreatePersonWithBlankFields() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        String firstName = "";
        String lastName = "";
        //steps
        personsPage.createCorrectPerson(firstName, lastName, driver);
        wait(3000);
        personsPage.cancel(driver);
        wait(2000);
        personsPage.logOut(driver);
    }
}
