package Tests.Project;

import Methods.HR.EmployeesPage;
import Methods.Project.TasksPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class TasksPageTests extends BaseTest {
    Integer seconds = 1000;



    @Test(groups = { "bad" })
    public void CreateIncorrectTask() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask();
        wait(seconds);
        String summary = taskPage.getProperty("summary.bad");
        //steps
        taskPage.createCorrectTask(summary);
        wait(seconds);
        alertAcept();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        taskPage.logOut();
    }
    @Test(groups = { "bad" })
    public void CreateShortTask() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask();
        wait(seconds);
        String summary = taskPage.getProperty("summary.short");
        //steps
        taskPage.createCorrectTask(summary);
        wait(seconds);
        alertAcept();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        taskPage.logOut();
    }

    //
//    @Test(groups = { "good" })
//    public void CreateCorrectTask() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(3000);
//
//        LoginPage loginPage = new LoginPage();
//        wait(seconds);
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(3000);
//        EmployeesPage employeesPage = personsPage.switchToEmployee();
//        wait(3000);
//        String firstName= "aaaaa";
//        String lastName = "bbbbb";
//        employeesPage.createEmployee(firstName, lastName);
//        wait(2000);
//        TasksPage taskPage = personsPage.switchToTask();
//        String summary = taskPage.getProperty("summary.good");
//        wait(seconds);
//        taskPage.createCorrectTask(summary);
//        wait(seconds);
//        taskPage.logOut();
//    }

    @Test(groups = { "bad" })

    public void CreateTaskWithBlankField() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask();
        wait(seconds);
        String summary = taskPage.getProperty("summary.empty");
        //steps
        taskPage.createCorrectTask(summary);
        wait(seconds);
        alertAcept();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        taskPage.logOut();
    }

    @Test(groups = { "good" })

      public void DetailsOfTask() throws InterruptedException, IOException
    {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask();
        wait(seconds);
        taskPage.viewTaskDetails();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        taskPage.logOut();
    }

//    @Test(groups = { "good" })

//    public void Filter() throws InterruptedException, IOException
//    {
//        goHome();
//        wait(2000);
//        LoginPage loginPage = new LoginPage();
//        String username = loginPage.getProperty("username.admin");
//        String password = loginPage.getProperty("password.admin");
//        PersonsPage personsPage = loginPage.successLogin(username, password);
//        wait(1000);
//        TasksPage taskPage = personsPage.switchToTask();
//        wait(1000);
//        taskPage.ChangeStage();
//        wait(1000);
//        String contentHolder = leadsPage.getProperty("content-holder.value");;
//        assertEquals("0 - 0 of 0 items", contentHolder);
//        wait(1000);
//        leadsPage.logOut();
//        wait(1000);
//        String loginForm = loginPage.getProperty("loginForm.id");
//        Assert.assertTrue(loginPage.pageContains(loginForm));
//
////        driverClose();
//
//    }

    @Test(groups = { "good" })

    public void RemoveTask() throws InterruptedException, IOException
    {
       PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask();
        wait(seconds);
        taskPage.removeTask();
        wait(seconds);
        alertAcept();
        wait(seconds);
        taskPage.logOut();

    }
    @Test(groups = { "good" })
    public void DragAndDropTasks() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        TasksPage taskPage = personsPage.switchToTask();
//        String summary = taskPage.getProperty("summary.good");
        wait(seconds);
//        taskPage.createCorrectTask(summary);
        taskPage.SwitchToKarbanView();
        taskPage.DragDropToInProgress();
        taskPage.DragDropToFixed();
        taskPage.DragDropToTesting();
        taskPage.DragDropToDone();
        taskPage.DragDropToCancelled();
        taskPage.DragDropToNew();
        taskPage.SwitchToListView();
//        taskPage.removeTask();
//        wait(1000);
//        alertAcept();
        wait(1000);
        taskPage.logOut();
    }
    @Test(groups = { "good" })
    public void CheckStageTasks() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(2000);
        EmployeesPage employeesPage = personsPage.switchToEmployee();
        wait(3000);
        String firstName= "aaaaa";
        String lastName = "bbbbb";
        employeesPage.createEmployee(firstName, lastName);
        wait(2000);
        TasksPage taskPage = personsPage.switchToTask();
        String summary = taskPage.getProperty("summary.good");
        wait(seconds);
        taskPage.createCorrectTask(summary);
        wait(seconds);
        taskPage.DeselectAllExeptOneInStageFilters();
        taskPage.SelectOneStage();
//        wait(1000);
//        taskPage.removeTask();
//        wait(1000);
//        alertAcept();
        wait(1000);
        taskPage.logOut();

    }
}
