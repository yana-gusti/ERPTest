package Tests.Sales.Companies;

import Methods.Sales.CompaniesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateIncorrectCompany extends BaseTest {
    @Test(groups = { "bad" })
    public void CreateIncorrectCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(4000);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(4000);
        String companyName = "!@#$";
        companyPage.createCorrectCompany(companyName);
        wait(1000);
        alertAcept();
        wait(1000);
        companyPage.cancel();
        wait(1000);
        personsPage.logOut(driver);
    }
}
