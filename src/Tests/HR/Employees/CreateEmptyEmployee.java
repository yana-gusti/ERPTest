package Tests.HR.Employees;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateEmptyEmployee extends BaseTest {

    @Test(groups = { "bad" })
    public void CreateEmptyEmployee() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(3000);
        String firstName = "";
        String lastName = "";
        employeesPage.createEmployee(firstName, lastName, driver);
        wait(5000);
//        alertAcept();
//        wait(1000);
        employeesPage.cancel(driver);
        wait(3000);
        personsPage.logOut(driver);
    }
}
