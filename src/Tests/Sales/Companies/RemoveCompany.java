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
    Integer seconds=3000;
    @Test(groups = { "good" })

    public void RemoveCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        companyPage.SwitchOnList(driver);
        wait(seconds);
        companyPage.viewCompanyDetails(driver);
        wait(seconds);
        companyPage.removeCompany(driver);
        wait(seconds);
        alertAcept();
        wait(seconds);
//        assertEquals("0", getDriver().findElement(By.id("grid-count")).getText());
        personsPage.logOut(driver);
    }
}
