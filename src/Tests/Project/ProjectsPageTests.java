package Tests.Project;

import Methods.Project.ProjectsPage;
import Methods.Sales.PersonsPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by puzzlefacePC on 02.01.14.
 */
public class ProjectsPageTests extends BaseTest {
    Integer seconds = 3000;



    @Test(groups = { "bad" })
    public void CreateIncorrectProject() throws InterruptedException, IOException
    {
       PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        String projectName = projectPage.getProperty("projectName.bad");
        String projectShortDescription = projectPage.getProperty("projectShortDescription.bad");
        //steps
        projectPage.createCorrectProject(projectName, projectShortDescription);
        wait(1000);
        alertAcept();
        wait(1000);
        projectPage.cancel();
        wait(1000);
        projectPage.logOut();
    }
    @Test(groups = { "bad" })
    public void CreateShortProject() throws InterruptedException, IOException
    {
      PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        String projectName = projectPage.getProperty("projectName.short");
        String projectShortDescription = projectPage.getProperty("projectShortDescription.short");
        //steps
        projectPage.createCorrectProject(projectName, projectShortDescription);
        wait(1000);
        alertAcept();
        wait(1000);
        projectPage.cancel();
        wait(1000);
        projectPage.logOut();

    }

    @Test(groups = { "good" })
    public void CreateCorrectProject() throws InterruptedException, IOException
    {
       PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        String projectName = projectPage.getProperty("projectName.good");
        String projectShortDescription = projectPage.getProperty("projectShortDescription.good");
        //steps
        projectPage.createCorrectProject(projectName, projectShortDescription);
        wait(1000);
        assertEquals("strader", getDriver().findElement(By.cssSelector("div.project-text.left")).getText());
        wait(1000);
        projectPage.logOut();
    }

    @Test(groups = { "bad" })

    public void CreateProjectWithBlankField() throws InterruptedException, IOException
    {
      PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        String projectName = projectPage.getProperty("projectName.empty");
        String projectShortDescription = projectPage.getProperty("projectShortDescription.empty");
        //steps
        projectPage.createCorrectProject(projectName, projectShortDescription);
        wait(1000);
        alertAcept();
        projectPage.cancel();
        wait(1000);
        projectPage.logOut();
    }

    @Test(groups = { "good" })

    public void DetailsOfProject() throws InterruptedException, IOException
    {
       PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        projectPage.viewProjectDetails();
        wait(seconds);
        assertEquals("strader", getDriver().findElement(By.id("projectName")).getAttribute("value"));
        assertEquals("first", getDriver().findElement(By.id("projectShortDesc")).getAttribute("value"));
        wait(1000);
        projectPage.cancelInDetails();
        wait(1000);
        projectPage.logOut();
    }

    @Test(groups = { "good" })

    public void RemoveProject() throws InterruptedException, IOException
    {
       PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        projectPage.SwitchOnList();
        wait(1000);
        projectPage.removeProject();
        wait(1000);
        alertAcept();
        projectPage.logOut();
    }

    @Test(groups = { "good" })
    public void TaskProject() throws InterruptedException, IOException
    {
       PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        String projectName = projectPage.getProperty("projectName.good");
        String projectShortDescription = projectPage.getProperty("projectShortDescription.good");
        //steps
        projectPage.createCorrectProject(projectName, projectShortDescription);
        wait(1000);
        assertEquals("strader", getDriver().findElement(By.cssSelector("div.project-text.left")).getText());
        wait(1000);
        projectPage.logOut();
    }
    @Test(groups = { "good" })
    public void CheckStage() throws InterruptedException, IOException {
      PersonsPage personsPage = GoToPersonPage();
        wait(seconds);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(seconds);
        String projectName = projectPage.getProperty("projectName.good");
        String projectShortDescription = projectPage.getProperty("projectShortDescription.good");
        //steps
        projectPage.createCorrectProject(projectName, projectShortDescription);
        wait(1000);
        projectPage.SwitchOnList();
        projectPage.CheckboxUnmark();
        wait(1000);
        projectPage.removeProject();
        wait(1000);
        alertAcept();
        wait(1000);
        projectPage.logOut();

    }
    @Test(groups = { "good" })
    public void CheckStageProjects() throws InterruptedException, IOException {
       PersonsPage personsPage = GoToPersonPage();
        wait(2000);
        ProjectsPage projectPage = personsPage.switchToProjects();
        wait(2000);
        String projectName = projectPage.getProperty("projectName.good");
        String projectShortDescription = projectPage.getProperty("projectShortDescription.good");
        //steps
        projectPage.createCorrectProject(projectName, projectShortDescription);
        wait(1000);
        projectPage.SwitchOnList();
        wait(2000);
        projectPage.DeselectAllExeptOneInStageFilters();
        projectPage.SelectOneStage();
        wait(1000);
        projectPage.removeProject();
        wait(1000);
        alertAcept();
        wait(1000);
        projectPage.logOut();
    }
}
