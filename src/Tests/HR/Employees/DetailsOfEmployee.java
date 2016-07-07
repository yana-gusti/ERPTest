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
    Integer seconds=4000;
    @Test(groups = { "good" })
    public void DetailsOfEmployee() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(seconds);
//        String firstName = employeesPage.getProperty("firstName.good");
//        String lastName = employeesPage.getProperty("lastName.good");
//        employeesPage.createEmployee(firstName, lastName);
//        wait(3000);
        employeesPage.SwitchOnList(driver);
        wait(seconds);
        employeesPage.viewEmployeeDetails(driver);
        wait(seconds);
//        assertEquals("iana", getDriver().findElement(By.xpath(".//*[@id='employeeForm']/div[2]/div[1]/div[2]/div[1]/dl/dd[1]")).getText());

        employeesPage.cancel(driver);
    }
}
