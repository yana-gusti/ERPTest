package Tests.HR;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
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
    @Test(groups = { "bad" })
    public void CreateIncorrectEmployee() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.bad");
        String lastName = employeesPage.getProperty("lastName.bad");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
        alertAcept();
        wait(1000);
        employeesPage.cancel();
        wait(1000);
        employeesPage.logOut();
    }

//    @Test(groups = { "good" })
//    public void CreateCorrectEmployee() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(3000);
//
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(3000);
//        EmployeesPage employeesPage = personsPage.switchToEmployee();
//        wait(3000);
//        String firstName = employeesPage.getProperty("firstName.good");
//        String lastName = employeesPage.getProperty("lastName.good");
//        employeesPage.createEmployee(firstName, lastName);
//        wait(3000);
//        employeesPage.logOut();
//
//    }

    @Test(groups = { "bad" })
    public void CreateShortEmployee() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.short");
        String lastName = employeesPage.getProperty("lastName.short");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
        alertAcept();
        wait(1000);
        employeesPage.cancel();
        wait(1000);
        employeesPage.logOut();
    }

    @Test(groups = { "bad" })
    public void CreateEmptyEmployee() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.empty");
        String lastName = employeesPage.getProperty("lastName.empty");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
        alertAcept();
        wait(1000);
        employeesPage.cancel();
        wait(1000);
        employeesPage.logOut();
    }

    @Test(groups = { "good" })
    public void DetailsOfEmployee() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(2000);
        employeesPage.SwitchOnList();
        wait(2000);
        employeesPage.viewEmployeeDetails();
        wait(1000);
        assertEquals("aaaaa", getDriver().findElement(By.cssSelector("dd")).getText());
        wait(1000);
        employeesPage.logOut();
    }


//    @Test(groups = { "good" })
//    public void DoAppFromEmployee() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(3000);
//
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(3000);
//        EmployeesPage employeesPage = personsPage.switchToEmployee();
//        wait(3000);
//        employeesPage.SwitchOnList();
//        wait(3000);
//        employeesPage.viewEmployeeDetails();
//        wait(3000);
//        ApplicationsPage applicationsPage=employeesPage.switchOnFired();
//        wait(3000);
////        assertEquals("Contract End 1", getDriver().findElement(By.xpath("//div[@id='content-holder']/table/tbody/tr/td[7]/div/h2")).getText());
//        wait(3000);
//        applicationsPage.logOut();
//    }

    @Test(groups = { "good" })
    public void RemoveEmployee() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.remove");
        String lastName = employeesPage.getProperty("lastName.remove");
        employeesPage.createEmployee(firstName, lastName);
        wait(3000);
        employeesPage.SwitchOnList();
        wait(3000);
        employeesPage.viewEmployeeDetails();
        wait(3000);
        employeesPage.removeEmployee();
        wait(3000);
        alertAcept();
        employeesPage.logOut();

    }
    @Test(groups = {"good"})
    public void CreateNewFilterEmployees() throws InterruptedException, IOException {
       PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.remove");
        String lastName = employeesPage.getProperty("lastName.remove");
        employeesPage.createEmployee(firstName, lastName);
        wait(1000);
        employeesPage.EmployeesFilter();
        wait(1000);
        employeesPage.CheckAll();
        wait(1000);
        employeesPage.removeEmployee();
        wait(1000);
        alertAcept();
        wait(1000);
        employeesPage.logOut();
    }
}
