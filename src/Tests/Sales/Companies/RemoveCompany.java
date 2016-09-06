package Tests.Sales.Companies;

import Methods.Sales.CompaniesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class RemoveCompany extends BaseTest {

    @Test(groups = { "good" })

    public void RemoveCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        companyPage.SwitchOnList(driver);
        wait(seconds);
        companyPage.removeCompany(driver);
        wait(seconds);
        alertAcept(driver);
    }
}
