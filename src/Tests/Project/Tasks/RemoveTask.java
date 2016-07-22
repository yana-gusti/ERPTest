package Tests.Project.Tasks;

import Methods.Project.TasksPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yanag on 22.07.2016.
 */
public class RemoveTask extends BaseTest {
    @Test(groups = { "good" })

    public void RemoveTask() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        taskPage.removeTask(driver);
        wait(seconds);
        alertAcept();
        wait(seconds);
        personsPage.logOut(driver);

    }
}
