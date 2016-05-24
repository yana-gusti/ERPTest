package Tests.HR;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
public class EmployeesPageTest extends BaseTest {

    PersonsPage personsPage;
    @Test(groups = { "bad" })
    public void CreateIncorrectEmployee() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.bad");
        String lastName = employeesPage.getProperty("lastName.bad");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
//        alertAcept();
//        wait(1000);
        employeesPage.cancel();
        wait(3000);
        employeesPage.logOut();
    }

    @Test(groups = { "good" })
    public void CreateCorrectEmployee() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
//        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
//        wait(1000);
//        String jobName = jobPositionsPage.getProperty("jobName.good");
//        jobPositionsPage.createJobPosition(jobName);
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.good");
        String lastName = employeesPage.getProperty("lastName.good");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
        employeesPage.logOut();

    }

    @Test(groups = { "bad" })
    public void CreateShortEmployee() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.short");
        String lastName = employeesPage.getProperty("lastName.short");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
//        alertAcept();
//        wait(1000);
        employeesPage.cancel();
        wait(3000);
        employeesPage.logOut();
    }

    @Test(groups = { "bad" })
    public void CreateEmptyEmployee() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.empty");
        String lastName = employeesPage.getProperty("lastName.empty");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
//        alertAcept();
//        wait(1000);
        employeesPage.cancel();
        wait(3000);
        employeesPage.logOut();
    }

    @Test(groups = { "good" })
    public void DetailsOfEmployee() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
//        String firstName = employeesPage.getProperty("firstName.good");
//        String lastName = employeesPage.getProperty("lastName.good");
//        employeesPage.createEmployee(firstName, lastName);
//        wait(3000);
        employeesPage.SwitchOnList();
        wait(5000);
        employeesPage.viewEmployeeDetails();
        wait(1000);
//        assertEquals("iana", getDriver().findElement(By.xpath(".//*[@id='employeeForm']/div[2]/div[1]/div[2]/div[1]/dl/dd[1]")).getText());
        wait(1000);
        employeesPage.cancel();
        wait(2000);
        employeesPage.logOut();
    }


//    @Test(groups = { "good" })
//    public void DoAppFromEmployee() throws InterruptedException, IOException
//    {
//        personsPage = GoToPersonsPage();
//        wait(3000);
//        EmployeesPage employeesPage = personsPage.switchToEmployee();
//        wait(3000);
//        employeesPage.SwitchOnList();
//        wait(3000);
//        employeesPage.viewEmployeeDetails();
//        wait(3000);
//       employeesPage.switchOnFired();
//        wait(10000);
//        employeesPage.logOut();
//    }

    @Test(groups = { "good" })
    public void RemoveEmployee() throws InterruptedException, IOException
    {
        personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
//        wait(3000);
//        String firstName = employeesPage.getProperty("firstName.remove");
//        String lastName = employeesPage.getProperty("lastName.remove");
//        employeesPage.createEmployee(firstName, lastName);
        wait(5000);
        employeesPage.SwitchOnList();
        wait(5000);
        employeesPage.viewEmployeeDetails();
        wait(3000);
        employeesPage.removeEmployee();
        wait(3000);
        alertAcept();
//        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
//        wait(1000);
//        jobPositionsPage.removeJobPosition();
//        wait(1000);
//        alertAcept();
        wait(5000);
        employeesPage.logOut();
    }
    @Test(groups = {"good"})
    public void CreateNewFilterEmployees() throws InterruptedException, IOException {
        personsPage = GoToPersonsPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
//        wait(3000);
//        String firstName = employeesPage.getProperty("firstName.remove");
//        String lastName = employeesPage.getProperty("lastName.remove");
//        employeesPage.createEmployee(firstName, lastName);
        wait(5000);
        employeesPage.EmployeesFilter();
        wait(5000);
        employeesPage.logOut();
    }
}
