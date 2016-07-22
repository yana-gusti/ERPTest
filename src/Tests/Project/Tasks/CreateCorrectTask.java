package Tests.Project.Tasks;

import Methods.Project.ProjectPage;
import Methods.Project.TasksPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yanag on 22.07.2016.
 */
public class CreateCorrectTask extends BaseTest {
    @Test(groups = { "good" })
    public void CreateCorrectTask() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        String summary = "QA Task";
        wait(seconds);
        taskPage.createCorrectTask(summary, driver);
        wait(seconds);
        personsPage.logOut(driver);
    }
}
