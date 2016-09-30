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
public class RemoveFromFilterValues extends BaseTest {

    @Test(groups = { "good" })

    public void RemoveFromFilterValues() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        driver.findElement(By.linkText("Persons")).click();
        wait(seconds);
        personsPage.SwitchOnList(driver);
        wait(seconds);
        personsPage.openFilterMenu(driver);
        wait(seconds);
        personsPage.filterByFullName(driver);
        wait(seconds);
        personsPage.removeFilterValueFilter(driver);
        wait(seconds);
    }
}