package Tests.Project.Projects;

import Methods.Project.ProjectPage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created by yanag on 21.07.2016.
 */
public class CreateCorrectProject extends BaseTest {
    @Test(groups = { "good" })
    public void CreateCorrectProject() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        ProjectPage projectPage = personsPage.switchToProject(driver);
        wait(seconds);
        String projectName= "Qa test";
        projectPage.createProject(projectName, driver);
        wait(seconds);
        projectPage.switchToList(driver);
        wait(seconds);
        assertEquals("Qa test", driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[2]")).getText());

    }
}
