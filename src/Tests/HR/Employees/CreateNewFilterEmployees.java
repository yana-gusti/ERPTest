package Tests.HR.Employees;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateNewFilterEmployees extends BaseTest {
    @Test(groups = {"good"})
    public void CreateNewFilterEmployees() throws InterruptedException, IOException {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
//        wait(3000);
//        String firstName = employeesPage.getProperty("firstName.remove");
//        String lastName = employeesPage.getProperty("lastName.remove");
//        employeesPage.createEmployee(firstName, lastName);
        wait(seconds);
        employeesPage.EmployeesFilter(driver);
    }
}
