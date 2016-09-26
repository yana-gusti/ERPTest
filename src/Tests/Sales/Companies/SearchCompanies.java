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
public class SearchCompanies extends BaseTest {

    @Test(groups = { "good" })

    public void SearchCompanies() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        companyPage.search(driver);

    }
}
