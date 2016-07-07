package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by yana on 15.06.2016.
 */
public class DetailsOfPerson extends BaseTest {
    Integer seconds = 3000;
    @Test(groups = { "good" })

    public void DetailsOfPerson() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        personsPage.SwitchOnList(driver);
        wait(seconds);
        personsPage.viewPersonDetails(driver);
    }
}
