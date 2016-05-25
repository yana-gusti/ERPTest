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
        wait(4000);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
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
        personsPage.logOut(driver);
    }
}
