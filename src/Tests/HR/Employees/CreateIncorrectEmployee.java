package Tests.HR.Employees;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateIncorrectEmployee extends BaseTest {
    Integer seconds=4000;
    PersonsPage personsPage;
    @Test(groups = { "bad" })
    public void CreateIncorrectEmployee() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(seconds);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(seconds);
        String firstName = "!@#$";
        String lastName = "!@#$";
        employeesPage.createEmployee(firstName, lastName, driver);
        wait(seconds);
//        alertAcept();
//        wait(1000);
        employeesPage.cancel(driver);
    }
}
