package Tests.Sales.Companies;

import Methods.Sales.CompaniesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateCompanyWithBlankField extends BaseTest {

    @Test (groups = { "good" })

    public void CreateCompanyWithBlankField() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        String companyName = "";
        companyPage.createCorrectCompany(companyName, driver);
        wait(seconds);
        companyPage.cancel(driver);

    }
}
