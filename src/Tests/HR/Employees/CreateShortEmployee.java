package Tests.HR.Employees;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateShortEmployee extends BaseTest {

    @Test(groups = { "bad" })
    public void CreateShortEmployee() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(4000);
        String firstName = "a";
        String lastName = "a";
        employeesPage.createEmployee(firstName, lastName, driver);
        wait(3000);
//        alertAcept();
//        wait(1000);
        employeesPage.cancel(driver);
        wait(3000);
        personsPage.logOut(driver);
    }
}
