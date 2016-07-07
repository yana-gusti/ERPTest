package Tests.Sales.Companies;

import Methods.Sales.CompaniesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by yana on 25.05.2016.
 */
public class EditCompany extends BaseTest{
    Integer seconds=3000;
    @Test(groups = { "good" })
    public void EditCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        companyPage.SwitchOnList(driver);
        wait(seconds);
        companyPage.viewCompanyDetails(driver);
        wait(seconds);
        companyPage.editCompany(driver);
        wait(seconds);

        wait(1000);
        personsPage.logOut(driver);
    }
}
