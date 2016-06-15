package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class RemovePerson extends BaseTest {
    @Test(groups = { "good" })

    public void RemovePerson() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        personsPage.removePerson(driver);
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0", getDriver().findElement(By.id("grid-count")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }
}
