package Tests.Project.Projects;

import Methods.Project.ProjectPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by ��������� on 05.08.2015.
 */
public class ProjectPageTests extends BaseTest {

//    @Test(groups = { "good" })
//    public void CreateCorrectProject() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        ProjectPage projectPage = personsPage.switchToProject(driver);
//        wait(seconds);
//        String projectName= "Qa test";
//        projectPage.createProject(projectName);
//        projectPage.switchToList();
//        assertEquals("Qa test", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).getText());
//        projectPage.removeAllProjects();
//
//    }
//
//    @Test(groups = { "bad" })
//    public void CreateIncorrectProject() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        ProjectPage projectPage = personsPage.switchToProject(driver);
//        wait(seconds);
//        String projectName= "!!!!";
//        projectPage.createProject(projectName);
//        wait(seconds);
//        alertAcept();
//
//    }
//
//    @Test(groups = { "bad" })
//    public void CreateEmptyProject() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        ProjectPage projectPage = personsPage.switchToProject(driver);
//        wait(seconds);
//        String projectName= "";
//        projectPage.createProject(projectName);
//        wait(seconds);
//        alertAcept();
//
//    }
//    @Test(groups = { "good" })
//    public void CreateProjectWithAttachment() throws InterruptedException, IOException
//    {
//        PersonsPage personsPage = GoToPersonsPage();
//        wait(seconds);
//        ProjectPage projectPage = personsPage.switchToProject(driver);
//        wait(seconds);
//        projectPage.createProjectWithAttachment();
//        projectPage.switchToList();
//        projectPage.removeAllProjects();
//    }

}
