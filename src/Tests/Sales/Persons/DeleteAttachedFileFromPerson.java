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
public class DeleteAttachedFileFromPerson extends BaseTest {

    @Test(groups = { "good" })

    public void DeleteAttachedFileFromPerson() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        driver.findElement(By.linkText("Persons")).click();
        wait(seconds);
        personsPage.SwitchOnList(driver);
        wait(seconds);
        personsPage.viewPersonDetails(driver);
        wait(seconds);
        personsPage.removeAttachFileToLead(driver);
        wait(seconds);

    }
}