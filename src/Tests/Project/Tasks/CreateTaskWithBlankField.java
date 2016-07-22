package Tests.Project.Tasks;

import Methods.Project.TasksPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yanag on 22.07.2016.
 */
public class CreateTaskWithBlankField extends BaseTest {
    @Test(groups = { "bad" })

    public void CreateTaskWithBlankField() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        String summary = "";
        //steps
        taskPage.createCorrectTask(summary, driver);
        wait(seconds);
        taskPage.cancel(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }
}
