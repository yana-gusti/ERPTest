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
public class FiltersPerson extends BaseTest {
    @Test(groups = {"good"})
    public void FiltersPerson() throws InterruptedException, IOException {
        PersonsPage personsPage = GoToPersonsPage();
        wait(1000);
        personsPage.removePerson(driver);
        wait(1000);
        alertAcept();
        wait(1000);
        String firstName1= "Anderson";
        String lastName1= "Andersonovich";
        String email1= "Andersonovich@re.re";
        String phone1= "11111111";
        String country1= "Ua";
        String firstName2= "Bon";
        String lastName2= "Bonovich";
        String email2= "Bonovich@re.ee";
        String phone2= "22222222";
        String country2= "UK";
        String firstName3= "Citrix";
        String lastName3= "Citrixovich";
        String email3= "Citrixovich@ee.ee";
        String phone3= "333333333";
        String country3= "USA";

        personsPage.createCorrectPerson(firstName1, lastName1, driver);
        wait(1000);
        personsPage.SwitchOnList(driver);
        wait(1000);

        assertEquals("Anderson", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Andersonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);
        personsPage.createCorrectPerson(firstName2, lastName2, driver);
        wait(1000);
        personsPage.SwitchOnList(driver);
        assertEquals("Bon", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Bonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);
        personsPage.createCorrectPerson(firstName3, lastName3, driver);
        personsPage.SwitchOnList(driver);
        wait(1000);
        assertEquals("Citrix", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Citrixovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);

        personsPage.logOut(driver);

    }
}
