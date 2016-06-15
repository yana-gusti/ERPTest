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
public class DetailsOfCompany extends BaseTest {
    @Test(groups = { "good" })

    public void DetailsOfCompany() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(4000);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(4000);
        companyPage.SwitchOnList(driver);
        wait(4000);
        companyPage.viewCompanyDetails(driver);
        wait(4000);
//        assertEquals("MS", getDriver().findElement(By.cssSelector("span[title=\"MS\"]")).getText());
        wait(4000);
        personsPage.logOut(driver);

    }
}