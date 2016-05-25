package Tests.HR.Employees;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class RemoveEmployee extends BaseTest {

    @Test(groups = { "good" })
    public void RemoveEmployee() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
//        wait(3000);
//        String firstName = employeesPage.getProperty("firstName.remove");
//        String lastName = employeesPage.getProperty("lastName.remove");
//        employeesPage.createEmployee(firstName, lastName);
        wait(5000);
        employeesPage.SwitchOnList(driver);
        wait(5000);
        employeesPage.viewEmployeeDetails(driver);
        wait(3000);
        employeesPage.removeEmployee(driver);
        wait(3000);
        alertAcept();
//        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
//        wait(1000);
//        jobPositionsPage.removeJobPosition();
//        wait(1000);
//        alertAcept();
        wait(5000);
        personsPage.logOut(driver);
    }
}
