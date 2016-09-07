package Tests.HR;

import Methods.HR.BirthdaysPage;
import Methods.HR.EmployeesPage;
import Methods.HR.JobPositionsPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Дом on 27.03.14.
 */
public class BirthdaysPageTests extends BaseTest {
    @Test(groups = {"good"})
    public void CheckBirthdaysTest() throws InterruptedException, IOException {
      PersonsPage personsPage = GoToPersonsPage();
        wait(3000);
      JobPositionsPage jobPositionsPage = personsPage.switchToJobPosition(driver);
      wait(1000);
      String jobName = "QA";
      jobPositionsPage.createJobPosition(jobName, driver);
      wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee(driver);
        wait(3000);
        String firstName = "iana";
        String lastName = "gusti";
        employeesPage.createEmployee(firstName, lastName, driver);
        wait(2000);
        BirthdaysPage birthdaysPage = personsPage.switchToBirthdays(driver);
        wait(2000);
        birthdaysPage.CheckBirthdays();
        wait(1000);
        employeesPage.removeEmployee(driver);
        wait(1000);
        alertAcept(driver);
        wait(1000);
      jobPositionsPage = personsPage.switchToJobPosition(driver);
      wait(1000);
      jobPositionsPage.removeJobPosition(driver);
      wait(1000);
      alertAcept(driver);
      wait(1000);
      personsPage.logOut(driver);



    }
}
