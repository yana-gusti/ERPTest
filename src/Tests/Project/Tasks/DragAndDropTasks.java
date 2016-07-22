package Tests.Project.Tasks;

import Methods.Project.TasksPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yanag on 22.07.2016.
 */
public class DragAndDropTasks extends BaseTest {
    @Test(groups = { "good" })
    public void DragAndDropTasks() throws InterruptedException, IOException {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        TasksPage taskPage = personsPage.switchToTask(driver);
        wait(seconds);
        taskPage.SwitchToKarbanView(driver);
        taskPage.DragDropToInProgress(driver);
        wait(seconds);
        personsPage.logOut(driver);
    }
}
