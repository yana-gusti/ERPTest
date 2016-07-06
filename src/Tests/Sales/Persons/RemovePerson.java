package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class RemovePerson extends BaseTest {
    Integer seconds = 10000;
    @Test(groups = { "good" })

    public void RemovePerson() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        personsPage.removePerson(driver);
        wait(seconds);
        alertAcept();
        wait(seconds);
//        assertEquals("0", getDriver().findElement(By.id("grid-count")).getText());
        wait(seconds);
        personsPage.logOut(driver);

    }
}
