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
        String firstName = "!@#";
        String lastName = "!@#";
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
        String firstName = "qwe";
        String lastName = "qwe";
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
        String firstName = "";
        String lastName = "";
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
        String first = "qwe";
        String last = "qwe";
        personsPage.createCorrectPerson(first,last);
        wait(1000);
        String firstTwo = "qaz";
        String lastTwo = "qaz";
        personsPage.createCorrectPerson(firstTwo,lastTwo);
        wait(1000);
        String firstThree = "qsx";
        String lastThree = "qsx";
        personsPage.createCorrectPerson(firstThree,lastThree);
        wait(1000);
        String firstFour= "qdc";
        String lastFour = "qdc";
        personsPage.createCorrectPerson(firstFour,lastFour);
        wait(1000);
        String firstFive = "rfv";
        String lastFive = "rfv";
        personsPage.createCorrectPerson(firstFive,lastFive);
        wait(1000);
        String firstSix = "aaa";
        String lastSix = "aaa";
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

        personsPage.createCorrectPerson(firstName1, lastName1);
        wait(1000);
        personsPage.SwitchOnList();
        wait(1000);

        assertEquals("Anderson", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Andersonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);
        personsPage.createCorrectPerson(firstName2, lastName2);
        wait(1000);
        personsPage.SwitchOnList();
        assertEquals("Bon", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Bonovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);
        personsPage.createCorrectPerson(firstName3, lastName3);
        personsPage.SwitchOnList();
        wait(1000);
        assertEquals("Citrix", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
        assertEquals("Citrixovich", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[4]")).getText());
        wait(1000);

        personsPage.logOut();

    }
}
