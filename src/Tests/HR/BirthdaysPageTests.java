package Tests.HR;

import Methods.HR.BirthdaysPage;
import Methods.HR.EmployeesPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Дом on 27.03.14.
 */
public class BirthdaysPageTests extends BaseTest {
    @Test(groups = {"good"})
    public void CheckBirthdaysTest() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(3000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName = employeesPage.getProperty("firstName.good");
        String lastName = employeesPage.getProperty("lastName.good");
        employeesPage.createEmployee(firstName, lastName);
        wait(2000);
        BirthdaysPage birthdaysPage = personsPage.switchToBirthdays();
        wait(2000);
        birthdaysPage.CheckBirthdays();
        wait(1000);
        employeesPage.removeEmployee();
        wait(1000);
        alertAcept();
        wait(1000);
        employeesPage.logOut();



    }
}
