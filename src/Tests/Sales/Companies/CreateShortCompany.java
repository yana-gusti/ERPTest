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

    @Test(groups = { "bad" })
    public void CreateShortCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(4000);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(4000);
        String companyName = "a";
        companyPage.createCorrectCompany(companyName, driver);
        wait(4000);
        companyPage.cancel(driver);
        wait(1000);
        personsPage.logOut(driver);
    }
}
