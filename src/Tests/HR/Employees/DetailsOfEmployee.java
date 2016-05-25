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
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(5000);
//        String firstName = employeesPage.getProperty("firstName.good");
//        String lastName = employeesPage.getProperty("lastName.good");
//        employeesPage.createEmployee(firstName, lastName);
//        wait(3000);
        employeesPage.SwitchOnList(driver);
        wait(5000);
        employeesPage.viewEmployeeDetails(driver);
        wait(1000);
//        assertEquals("iana", getDriver().findElement(By.xpath(".//*[@id='employeeForm']/div[2]/div[1]/div[2]/div[1]/dl/dd[1]")).getText());
        wait(1000);
        employeesPage.cancel(driver);
        wait(2000);
        personsPage.logOut(driver);
    }
}
