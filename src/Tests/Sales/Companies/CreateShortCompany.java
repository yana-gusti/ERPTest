package Tests.Sales.Companies;

import Methods.Sales.CompaniesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateShortCompany extends BaseTest {
    Integer seconds=3000;
    @Test(groups = { "bad" })
    public void CreateShortCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        String companyName = "a";
        companyPage.createCorrectCompany(companyName, driver);
        wait(seconds);
        companyPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }
}
