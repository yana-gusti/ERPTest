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
public class RemoveFromFavoritesFilter extends BaseTest {

    @Test(groups = { "good" })

    public void RemoveFromFavoritesFilter() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CompaniesPage companyPage = personsPage.goToCompanies(driver);
        wait(seconds);
        companyPage.SwitchOnList(driver);
        wait(seconds);
        companyPage.openFilterMenu(driver);
        wait(seconds);
        companyPage.filterByCountry(driver);
        wait(seconds);
        companyPage.removeFromFavoritesFilter(driver);
        wait(seconds);

    }
}
