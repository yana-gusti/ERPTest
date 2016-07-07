package Tests.Sales.Persons;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 15.06.2016.
 */
public class CreatePersonWithBlankFields extends BaseTest {
    Integer seconds = 3000;
    @Test(groups = { "bad" })

    public void CreatePersonWithBlankFields() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        driver.findElement(By.linkText("Persons")).click();
        wait(seconds);
        String firstName = "";
        String lastName = "";
        //steps
        personsPage.createCorrectPerson(firstName, lastName, driver);
        wait(seconds);
        personsPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }
}
