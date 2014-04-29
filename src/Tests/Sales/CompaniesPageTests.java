package Tests.Sales;

import Methods.Sales.CompaniesPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by puzzlefacePC on 02.01.14.
 */
public class CompaniesPageTests extends BaseTest {
    Integer seconds=3000;



    @Test(groups = { "bad" })
    public void CreateIncorrectCompany() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.switchToCompanies();
        wait(seconds);
        String companyName = companyPage.getProperty("companyName.bad");
        companyPage.createCorrectCompany(companyName);
        wait(1000);
        alertAcept();
        wait(1000);
        companyPage.cancel();
        wait(1000);
        companyPage.logOut();
    }
    @Test(groups = { "bad" })
    public void CreateShortCompany() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.switchToCompanies();
        wait(seconds);
        String companyName = companyPage.getProperty("companyName.short");
        companyPage.createCorrectCompany(companyName);
        wait(1000);
        alertAcept();
        wait(1000);
        companyPage.cancel();
        wait(1000);
        companyPage.logOut();
    }

    //
    @Test(groups = { "good" })
    public void CreateCorrectCompany() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.switchToCompanies();
        wait(seconds);
        String companyName = companyPage.getProperty("companyName.good");
        companyPage.createCorrectCompany(companyName);
        wait(1000);
        assertEquals("MS", getDriver().findElement(By.linkText("MS")).getText());
        wait(1000);
        companyPage.logOut();
    }

    @Test(groups = { "bad" })

    public void CreateCompanyWithBlankField() throws InterruptedException, IOException
    {
     PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.switchToCompanies();
        wait(seconds);
        String companyName = companyPage.getProperty("companyName.empty");
        companyPage.createCorrectCompany(companyName);
        wait(1000);
        alertAcept();
        wait(1000);
        companyPage.cancel();
        wait(1000);
        companyPage.logOut();

    }

    @Test(groups = { "good" })

    public void DetailsOfCompany() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.switchToCompanies();
        wait(1000);
        companyPage.SwitchOnList();
        wait(1000);
        companyPage.viewCompanyDetails();
        wait(1000);
        assertEquals("MS", getDriver().findElement(By.cssSelector("span[title=\"MS\"]")).getText());
        wait(1000);
        companyPage.logOut();

    }
    @Test(groups = { "good" })
    public void EditCompany() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.switchToCompanies();
        wait(seconds);
        companyPage.SwitchOnList();
        wait(1000);
        companyPage.viewCompanyDetails();
        wait(1000);
        companyPage.editCompany();
        wait(1000);

        assertEquals("www.ua.com", getDriver().findElement(By.id("website")).getText());

        wait(1000);
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void RemoveCompany() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.switchToCompanies();
        wait(1000);
        companyPage.SwitchOnList();
        wait(1000);
        companyPage.viewCompanyDetails();
        wait(1000);
        companyPage.removeCompany();
        wait(1000);
        alertAcept();
        wait(1000);
//        assertEquals("0", getDriver().findElement(By.id("grid-count")).getText());
        wait(1000);
        companyPage.logOut();
    }
}
