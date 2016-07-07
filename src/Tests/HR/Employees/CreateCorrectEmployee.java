package Tests.HR.Employees;

import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 25.05.2016.
 */
public class CreateCorrectEmployee extends BaseTest {
    Integer seconds=4000;
    @Test(groups = { "good" })
    public void CreateCorrectEmployee() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
//        JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition();
//        wait(1000);
//        String jobName = jobPositionsPage.getProperty("jobName.good");
//        jobPositionsPage.createJobPosition(jobName);

        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(seconds);
        String firstName ="iana";
        String lastName = "gusti";
        employeesPage.createEmployee(firstName, lastName, driver);
        wait(seconds);
        personsPage.logOut(driver);

    }
}
