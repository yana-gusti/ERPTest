package Methods.Project;

import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.testng.Assert.assertEquals;

/**
 * Created by ��������� on 05.08.2015.
 */
public class ProjectPage extends BaseTest {



    public void createProject(String _projectName, RemoteWebDriver driver) throws InterruptedException {
        WebElement createBtn =  driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        WebElement projectName = driver.findElement(By.id("projectName"));
        projectName.clear();
        projectName.sendKeys(_projectName);
        driver.findElement(By.id("projectShortDesc")).clear();
        driver.findElement(By.id("projectShortDesc")).sendKeys("Test");
        WebElement projectType = driver.findElement(By.id("projectTypeDD"));
        projectType.click();
        driver.findElement(By.id("fixed")).click();
        driver.findElement(By.id("customerDd")).click();
        driver.findElement(By.id("570b65d718efef5454b6b58d")).click();

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();


    }

    public void switchToList(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.id("listBtn")).click();
    }
    public void openProject(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).click();
        wait(seconds);
    }

    public void removeAllProjects(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.id("check_all")).click();
        driver.findElement(By.id("top-bar-deleteBtn")).click();
        alertAcept();

    }

    public void createProjectWithAttachment(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.id("top-bar-createBtn")).click();
        driver.findElement(By.id("projectName")).clear();
        driver.findElement(By.id("projectName")).sendKeys("QA");
        driver.findElement(By.id("projectShortDesc")).clear();
        driver.findElement(By.id("projectShortDesc")).sendKeys("qa");
        wait(seconds);
        driver.findElement(By.id("inputAttach")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
        wait(seconds);
        assertEquals("Chrysanthemum.jpg", driver.findElement(By.cssSelector("span.blue")).getText());
        wait(seconds);
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

    }

    public void createTimeCard(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        driver.findElement(By.id("timesheetTab")).click();
        wait(seconds);
        driver.findElement(By.id("createBtn")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("td.editable.errorContent")).click();
        driver.findElement(By.cssSelector("ul > #createJob")).click();
        driver.findElement(By.id("jobName")).clear();
        driver.findElement(By.id("jobName")).sendKeys("Test");
        driver.findElement(By.id("generateBtn")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-content='jobs']")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-content='jobs']/div/div/div/ul/li[1]")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-content='employee']")).click();
        driver.findElement(By.xpath("//*[@data-content='employee']/div/div/div/ul/li[3]")).click();
        wait(seconds);
        driver.findElement(By.id("savewTrack")).click();

    }

    public void createQuotation(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        driver.findElement(By.id("quotationsTab")).click();
        wait(seconds);
        driver.findElement(By.id("createQuotation")).click();
        wait(seconds);
        driver.findElement(By.linkText("Add an item")).click();
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='productItemsHolder']/div/table/tbody/tr[1]/td[3]/a")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-name='jobs']/ul/li[1]")).click();
        wait(seconds);
        driver.findElement(By.id("editInput")).click();
        driver.findElement(By.id("editInput")).clear();
        driver.findElement(By.id("editInput")).sendKeys("200");
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='create-person-dialog']")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("td.total.dollar")).getText(), "200.00");

    }
}
