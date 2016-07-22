package Tests.Project.Projects;

import Methods.Project.ProjectPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yanag on 21.07.2016.
 */
public class CreateTimeCard extends BaseTest {

    @Test(groups = { "good" })
    public void CreateProjectWithAttachment() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ProjectPage projectPage = personsPage.switchToProject(driver);
        wait(seconds);
        projectPage.switchToList(driver);
        wait(seconds);
        projectPage.createTimeCard(driver);
    }
}
