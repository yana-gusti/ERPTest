package Tests.Settings;

import Methods.HR.ApplicationsPage;
import Methods.HR.JobPositionsPage;
import Methods.Project.ProjectsPage;
import Methods.Project.TasksPage;
import Methods.Sales.LeadsPage;
import Methods.Sales.OpportunitiesPage;
import Methods.Sales.PersonsPage;
import Methods.Settings.WorkflowPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 24.03.14
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
public class WorkflowPageTests extends BaseTest {
    Integer seconds=3000;
    @Test(groups = "good")
    public void CreateApplicationWorkflow() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        WorkflowPage workflowPage=personsPage.switchToWorkflow();
        wait(seconds);
        workflowPage.switchToApplications();
        wait(1000);
        String name = workflowPage.getProperty("application.name");
        String xpath = workflowPage.getProperty("application.workflow.xpath");
        workflowPage.createWorkflow(name, xpath);
        wait(1000);
        ApplicationsPage applicationsPage = personsPage.switchToApplication();
        wait(1000);
        assertEquals("application", getDriver().findElement(By.cssSelector("span.text")).getText());
        wait(1000);
        applicationsPage.logOut();

    }
    @Test(groups = "good")
    public void CreateJobPositionWorkflow() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        WorkflowPage workflowPage=personsPage.switchToWorkflow();
        wait(seconds);
        workflowPage.switchToJobpositions();
        wait(1000);
        String name = workflowPage.getProperty("jobPosition.name");
        String xpath = workflowPage.getProperty("jobPosition.workflow.xpath");
        workflowPage.createWorkflow(name, xpath);
        wait(2000);
        JobPositionsPage jobPositionsPage =personsPage.switchToJobPosition();
        wait(2000);
        String jobName = jobPositionsPage.getProperty("jobName.good");
        jobPositionsPage.createJobPosition(jobName);
        wait(2000);
        assertEquals("jobposition", getDriver().findElement(By.linkText("jobposition")).getText());
        workflowPage.Logout();

    }
    @Test(groups = "good")
    public void CreateLeadWorkflow() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        WorkflowPage workflowPage=personsPage.switchToWorkflow();
        wait(seconds);
        workflowPage.switchToLeads();
        wait(1000);
        String name = workflowPage.getProperty("lead.name");
        String xpath = workflowPage.getProperty("lead.workflow.xpath");
        workflowPage.createWorkflow(name, xpath);
        wait(2000);
        LeadsPage leadsPage =workflowPage.switchToLead();
        wait(2000);
        String leadsName = leadsPage.getProperty("leadsName.good");
        leadsPage.createCorrectLead2(leadsName);
        wait(2000);
        assertEquals("lead", getDriver().findElement(By.linkText("lead")).getText());
        workflowPage.Logout();

    }
    @Test(groups = "good")
    public void CreateOpportunityWorkflow() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        WorkflowPage workflowPage=personsPage.switchToWorkflow();
        wait(seconds);
        workflowPage.switchToOpportunities();
        wait(1000);
        String name = workflowPage.getProperty("opportunity.name");
        String xpath = workflowPage.getProperty("opportunity.workflow.xpath");
        workflowPage.createWorkflow(name, xpath);
        wait(2000);
        OpportunitiesPage opportunitiesPage = workflowPage.switchToOpportunity();
        wait(2000);
        assertEquals("opportunity", getDriver().findElement(By.cssSelector("span.text")).getText());
        wait(1000);
        workflowPage.Logout();

    }
    @Test(groups = "good")
    public void CreateProjectWorkflow() throws InterruptedException, IOException {
      PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        WorkflowPage workflowPage=personsPage.switchToWorkflow();
        wait(seconds);
        workflowPage.switchToProjects();
        wait(1000);
        String name = workflowPage.getProperty("project.name");
        String xpath = workflowPage.getProperty("project.workflow.xpath");
        workflowPage.createWorkflow(name, xpath);
        wait(1000);
        ProjectsPage projectsPage=personsPage.switchToProjects();
        wait(1000);
        String projectName = projectsPage.getProperty("project1Name.good");
        String projectShortDescription = projectsPage.getProperty("project1ShortDescription.good");
        //steps
        projectsPage.createCorrectProject2(projectName, projectShortDescription);
        wait(1000);
        projectsPage.SwitchOnList();
        wait(1000);
        assertEquals("project", getDriver().findElement(By.linkText("project")).getText());
        wait(1000);
        workflowPage.Logout();

    }
    @Test(groups = "good")
    public void CreateTaskWorkflow() throws InterruptedException, IOException {
        PersonsPage  personsPage = GoToPersonPage();
        wait(seconds);
        WorkflowPage workflowPage=personsPage.switchToWorkflow();
        wait(seconds);
        workflowPage.switchToTasks();
        wait(1000);
        String name = workflowPage.getProperty("task.name");
        String xpath = workflowPage.getProperty("task.workflow.xpath");
        workflowPage.createWorkflow(name, xpath);
        wait(1000);
        TasksPage taskPage = personsPage.switchToTask();
        String summary = taskPage.getProperty("summary.good");
        wait(1000);
        taskPage.createCorrectTask2(summary);
        wait(1000);
        assertEquals("task", getDriver().findElement(By.linkText("task")).getText());
        wait(1000);
        workflowPage.Logout();

    }

}
