package Tests.HR.Employees;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class DetailsOfEmployee extends BaseTest {
    @Test(groups = { "good" })
    public void DetailsOfEmployee() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(seconds);
        employeesPage.SwitchOnList(driver);
        wait(seconds);
        employeesPage.viewEmployeeDetails(driver);
        wait(seconds);
        employeesPage.cancel(driver);
    }
}
