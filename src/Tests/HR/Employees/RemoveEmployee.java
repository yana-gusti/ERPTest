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
    Integer seconds=4000;
    @Test(groups = { "good" })
    public void RemoveEmployee() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
//        wait(3000);
//        String firstName = employeesPage.getProperty("firstName.remove");
//        String lastName = employeesPage.getProperty("lastName.remove");
//        employeesPage.createEmployee(firstName, lastName);
        wait(seconds);
        employeesPage.SwitchOnList(driver);
        wait(seconds);
        employeesPage.viewEmployeeDetails(driver);
        wait(seconds);
        employeesPage.removeEmployee(driver);
        wait(seconds);
        alertAcept();
//        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
//        wait(1000);
//        jobPositionsPage.removeJobPosition();
//        wait(1000);
//        alertAcept();
        wait(seconds);
        personsPage.logOut(driver);
    }
}
