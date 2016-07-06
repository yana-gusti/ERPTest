package Tests.Project;

import Methods.Project.ProjectPage;
import Methods.Project.TasksPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class TasksPageTests extends BaseTest {
    Integer seconds = 10000;




    @Test(groups = { "bad" })
    public void CreateIncorrectTask() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        String summary = "!@#$";
        //steps
        taskPage.createCorrectTask(summary);
        wait(seconds);
        alertAcept();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        personsPage.logOut(driver);
    }
    @Test(groups = { "bad" })
    public void CreateShortTask() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        String summary = "a";
        //steps
        taskPage.createCorrectTask(summary);
        wait(seconds);
        alertAcept();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        personsPage.logOut(driver);
    }


    @Test(groups = { "good" })
    public void CreateCorrectTask() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ProjectPage projectPage = personsPage.switchToProject(driver);
        wait(seconds);
        projectPage.createProject("AS");
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        String summary = "QA Task";
        wait(seconds);
        taskPage.createCorrectTask(summary);
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "bad" })

    public void CreateTaskWithBlankField() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        String summary = "";
        //steps
        taskPage.createCorrectTask(summary);
        wait(seconds);
        alertAcept();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

      public void DetailsOfTask() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        taskPage.viewTaskDetails();
        wait(seconds);
        taskPage.cancel();
        wait(seconds);
        personsPage.logOut(driver);
    }



    @Test(groups = { "good" })

    public void RemoveTask() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        wait(seconds);
        taskPage.removeTask();
        wait(seconds);
        alertAcept();
        wait(seconds);
        personsPage.logOut(driver);

    }
    @Test(groups = { "good" })
    public void DragAndDropTasks() throws InterruptedException, IOException {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
//        String summary = taskPage.getProperty("summary.good");
        wait(seconds);
//        taskPage.createCorrectTask(summary);
        taskPage.SwitchToKarbanView();
        taskPage.DragDropToInProgress();

//        taskPage.removeTask();
//        wait(1000);
//        alertAcept();
        wait(seconds);
        personsPage.logOut(driver);
    }

}
