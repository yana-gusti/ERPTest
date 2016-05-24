package Tests.Sales;


import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by puzzlefacePC on 30.12.13.
 */
public class PersonsPageTests extends BaseTest {
    Integer seconds=3000;
    PersonsPage personsPage;



    @Test(groups = { "bad" })
    public void CreateIncorrectPerson() throws InterruptedException, IOException
    {
       personsPage = GoToPersonsPage();
        wait(seconds);
        String firstName = personsPage.getProperty("firstName.bad");
        String lastName = personsPage.getProperty("lastName.bad");
        personsPage.createCorrectPerson(firstName, lastName);
        wait(1000);
        alertAcept();
        wait(1000);
        personsPage.cancel();
        wait(1000);
        personsPage.logOut();
        wait(1000);

    }



    @Test(groups = { "good" })
    public void CreateCorrectPerson() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(seconds);
        wait(1000);
        String firstName = personsPage.getProperty("firstName.good");
        String lastName = personsPage.getProperty("lastName.good");
        //steps
        personsPage.createCorrectPerson(firstName, lastName);
        wait(1000);
        assertEquals("iana gusti", getDriver().findElement(By.cssSelector("a.gotoForm.title > span")).getText());

        personsPage.logOut();

    }



    @Test(groups = { "bad" })

    public void CreatePersonWithBlankFields() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(seconds);
        String firstName = personsPage.getProperty("firstName.empty");
        String lastName = personsPage.getProperty("lastName.empty");
        //steps
        personsPage.createCorrectPerson(firstName, lastName);
        wait(1000);
        alertAcept();
        wait(2000);
        personsPage.cancel();
        wait(2000);
        personsPage.logOut();
    }



    @Test(groups = { "good" })

    public void DetailsOfPerson() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(seconds);
        personsPage.SwitchOnList();
        wait(1000);
        personsPage.viewPersonDetails();
        wait(1000);

        assertEquals("iana gusti", getDriver().findElement(By.cssSelector("span[title=\"iana gusti\"]")).getText());
        wait(1000);
        personsPage.logOut();
    }
    @Test(groups = { "good" })

    public void EditPerson() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(seconds);

        personsPage.SwitchOnList();
        wait(1000);
        personsPage.viewPersonDetails();
        wait(1000);
        personsPage.editPerson();
        wait(1000);

        assertEquals("yana@mail.ru", getDriver().findElement(By.linkText("yana@mail.ru")).getText());
        wait(1000);
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void RemovePerson() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(seconds);
        personsPage.removePerson();
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0", getDriver().findElement(By.id("grid-count")).getText());
        wait(1000);
        personsPage.logOut();

    }
    @Test(groups = { "good" })
    public void VerifyPersonPerPage() throws InterruptedException, IOException {

        personsPage = GoToPersonsPage();
        wait(seconds);
        String first = personsPage.getProperty("Person1FirstName.id");
        String last = personsPage.getProperty("Person1LastName.id");
        personsPage.createCorrectPerson(first,last);
        wait(1000);
        String firstTwo = personsPage.getProperty("Person2FirstName.id");
        String lastTwo = personsPage.getProperty("Person2LastName.id");
        personsPage.createCorrectPerson(firstTwo,lastTwo);
        wait(1000);
        String firstThree = personsPage.getProperty("Person3FirstName.id");
        String lastThree = personsPage.getProperty("Person3LastName.id");
        personsPage.createCorrectPerson(firstThree,lastThree);
        wait(1000);
        String firstFour= personsPage.getProperty("firstName.good");
        String lastFour = personsPage.getProperty("lastName.good");
        personsPage.createCorrectPerson(firstFour,lastFour);
        wait(1000);
        String firstFive = personsPage.getProperty("lastName.good");
        String lastFive = personsPage.getProperty("firstName.good");
        personsPage.createCorrectPerson(firstFive,lastFive);
        wait(1000);
        String firstSix = personsPage.getProperty("firstName1.good");
        String lastSix = personsPage.getProperty("lastName1.good");
        personsPage.createCorrectPerson(firstSix,lastSix);
        wait(1000);
        personsPage.SwitchOnList();
        wait(1000);
        personsPage.Select5PerPage();
        wait(1000);
        personsPage.NextPage();
        wait(1000);
        personsPage.removePerson();
        wait(1000);
        alertAcept();
        wait(1000);
        personsPage.logOut();
    }
//
//    @Test(groups = {"good"})
//    public void EditNewPerson() throws InterruptedException, IOException {
//        personsPage = GoToPersonsPage();
//        wait(seconds);
//        personsPage.SwitchOnList();
//        wait(2000);
//        personsPage.EditNoteNewPerson();
//        wait(1000);
//        assertEquals("TittleTEXT", getDriver().findElement(By.cssSelector("div.noteTitle")).getText());
//        wait(1000);
//        assertEquals("NoteText", getDriver().findElement(By.cssSelector("div.noteText")).getText());
//        assertEquals("Chrysanthemum.jpg", getDriver().findElement(By.xpath(".//*[@id='attachBody']/ul/li/a[1]")).getText());
//
//        wait(1000);
//        personsPage.I_hover_over_menu_item();
//        wait(1000);
//        personsPage.DeleteNoteNewPerson();
//        wait(2000);
//        alertAcept();
//        wait(1000);
//        personsPage.DeleteAttachNewPerson();
//        wait(1000);
//        alertAcept();
//        wait(3000);
//        personsPage.logOut();
//    }
//    @Test(groups = {"good"})
//    public void EditNoteAttachNewPerson() throws InterruptedException, IOException {
//        personsPage = GoToPersonsPage();
//        wait(seconds);
//        personsPage.SwitchOnList();
//        wait(2000);
//        personsPage.EditNoteNewPerson();
//        wait(2000);
//        assertEquals("TittleTEXT", getDriver().findElement(By.cssSelector("div.noteTitle")).getText());
//        wait(2000);
//        assertEquals("NoteText", getDriver().findElement(By.cssSelector("div.noteText")).getText());
//        wait(2000);
//        assertEquals("Chrysanthemum.jpg", getDriver().findElement(By.linkText("Chrysanthemum.jpg")).getText());
//        wait(2000);
//        personsPage.I_hover_over_menu_item();
//        personsPage.EditNotePerson();
//        wait(2000);
//        assertEquals("TittleTEXTTittleTEXT", getDriver().findElement(By.cssSelector("div.noteTitle")).getText());
//        wait(2000);
//        assertEquals("NoteTextNoteText", getDriver().findElement(By.cssSelector("div.noteText")).getText());
//        wait(2000);
//        personsPage.ClickOnAttachNewPerson();
//        wait(1000);
//        personsPage.logOut();
//    }
    @Test(groups = {"good"})
    public void FiltersPerson() throws InterruptedException, IOException {
        personsPage = GoToPersonsPage();
        wait(1000);
        personsPage.removePerson();
        wait(1000);
        alertAcept();
        wait(1000);
        String firstName1= personsPage.getProperty("Person1FirstName.id");
        String lastName1= personsPage.getProperty("Person1LastName.id");
        String email1= personsPage.getProperty("EmailPerson1.id");
        String phone1= personsPage.getProperty("PhonePerson1.id");
        String country1= personsPage.getProperty("CountryPerson1.id");
        String firstName2= personsPage.getProperty("Person2FirstName.id");
        String lastName2= personsPage.getProperty("Person2LastName.id");
        String email2= personsPage.getProperty("EmailPerson2.id");
        String phone2= personsPage.getProperty("PhonePerson2.id");
        String country2= personsPage.getProperty("CountryPerson2.id");
        String firstName3= personsPage.getProperty("Person3FirstName.id");
        String lastName3= personsPage.getProperty("Person3LastName.id");
        String email3= personsPage.getProperty("EmailPerson3.id");
        String phone3= personsPage.getProperty("PhonePerson3.id");
        String country3= personsPage.getProperty("CountryPerson3.id");

        personsPage.CreateNewPerson(firstName1, lastName1, email1, phone1, country1);
        wait(1000);
        personsPage.SwitchOnList();
        wait(1000);
        personsPage.EditNoteNewPerson();
        wait(1000);
        personsPage.SwitchOnList();
        wait(1000);
        assertEquals("Anderson", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Andersonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);
        personsPage.CreateNewPerson(firstName2, lastName2, email2, phone2, country2);
        wait(1000);
        personsPage.SwitchOnList();
        wait(1000);
        personsPage.EditNoteNewPerson();
        wait(1000);
        personsPage.SwitchOnList();
        wait(1000);
        assertEquals("Bon", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Bonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);
        personsPage.CreateNewPerson(firstName3, lastName3, email3, phone3, country3);
        personsPage.SwitchOnList();
        wait(1000);
        personsPage.EditNoteNewPerson();
        wait(1000);
        personsPage.SwitchOnList();
        wait(1000);
        assertEquals("Citrix", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Citrixovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);
        personsPage.FirstNameFilterPerson();
        wait(1000);
        assertEquals("Anderson", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Bon", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr[2]/td[3]")).getText());
        assertEquals("Citrix", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr[3]/td[3]")).getText());
        wait(1000);
        personsPage.PhoneFilterPerson();
        wait(1000);
        assertEquals("333333333", getDriver().findElement(By.linkText("333333333")).getText());
        assertEquals("444444444", getDriver().findElement(By.linkText("444444444")).getText());
        assertEquals("555555555", getDriver().findElement(By.linkText("555555555")).getText());
        personsPage.LastNameFilterPerson();
        wait(1000);
        assertEquals("Andersonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        assertEquals("Bonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr[2]/td[4]")).getText());
        assertEquals("Citrixovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr[3]/td[4]")).getText());
        wait(1000);
        personsPage.EmailFilterPerson();
        wait(1000);
        assertEquals("5@mail.ru", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[5]")).getText());
        assertEquals("6@mail.ru", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr[2]/td[5]")).getText());
        assertEquals("7@mail.ru", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr[3]/td[5]")).getText());
        wait(1000);
        personsPage.CountryFilterPerson();
        wait(1000);
        assertEquals("America", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[7]")).getText());
        assertEquals("Canada", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[2]/td[7]")).getText());
        assertEquals("Xantra", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[3]/td[7]")).getText());
        wait(1000);
        personsPage.CreatedByFilterPerson();
        wait(1000);
        assertEquals("Anderson", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).getText());
        assertEquals("Bon", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[2]/td[3]")).getText());
        assertEquals("Citrix", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[3]/td[3]")).getText());
        wait(1000);
        personsPage.EditedByFilterPerson();
        wait(1000);
        assertEquals("Anderson", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).getText());
        assertEquals("Bon", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[2]/td[3]")).getText());
        assertEquals("Citrix", getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[3]/td[3]")).getText());
        wait(1000);
        personsPage.logOut();

    }
}
