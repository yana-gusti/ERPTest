package Tests.Sales.Companies;

import Methods.Sales.CompaniesPage;

import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by puzzlefacePC on 02.01.14.
 */
public class CompaniesPageTests extends BaseTest {




    @Test(groups = { "bad" })
    public void CreateIncorrectCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        String companyName = "!@#$";
        companyPage.createCorrectCompany(companyName, driver);
        wait(1000);
        alertAcept();
        wait(1000);
        companyPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);
    }
    @Test(groups = { "bad" })
    public void CreateShortCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        String companyName = "a";
        companyPage.createCorrectCompany(companyName, driver);
        wait(1000);
        alertAcept();
        wait(1000);
        companyPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);
    }

    //
    @Test(groups = { "good" })
    public void CreateCorrectCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        String companyName = "Test";
        companyPage.createCorrectCompany(companyName, driver);
        wait(1000);
        assertEquals("MS", getDriver().findElement(By.linkText("MS")).getText());
        wait(1000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "bad" })

    public void CreateCompanyWithBlankField() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        String companyName = "";
        companyPage.createCorrectCompany(companyName, driver);
        wait(1000);
        alertAcept();
        wait(1000);
        companyPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);

    }

    @Test(groups = { "good" })

    public void DetailsOfCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(1000);
        companyPage.SwitchOnList(driver);
        wait(1000);
        companyPage.viewCompanyDetails(driver);
        wait(1000);
        assertEquals("MS", getDriver().findElement(By.cssSelector("span[title=\"MS\"]")).getText());
        wait(1000);
        personsPage.logOut(driver);

    }
    @Test(groups = { "good" })
    public void EditCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        companyPage.SwitchOnList(driver);
        wait(1000);
        companyPage.viewCompanyDetails(driver);
        wait(1000);
        companyPage.editCompany(driver);
        wait(1000);

        assertEquals("www.ua.com", getDriver().findElement(By.id("website")).getText());

        wait(1000);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void RemoveCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(1000);
        companyPage.SwitchOnList(driver);
        wait(1000);
        companyPage.viewCompanyDetails(driver);
        wait(1000);
        companyPage.removeCompany(driver);
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0", getDriver().findElement(By.id("grid-count")).getText());
        wait(1000);
        personsPage.logOut(driver);
    }
}
