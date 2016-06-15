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
public class EditPerson extends BaseTest {
    @Test(groups = { "good" })

    public void EditPerson() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);

        personsPage.SwitchOnList(driver);
        wait(1000);
        personsPage.viewPersonDetails(driver);
        wait(1000);
        personsPage.editPerson(driver);
        wait(1000);

        assertEquals("yana@mail.ru", getDriver().findElement(By.linkText("yana@mail.ru")).getText());
        wait(1000);
        personsPage.logOut(driver);
    }
}
