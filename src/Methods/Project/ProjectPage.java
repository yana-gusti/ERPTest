package Methods.Project;

import Methods.Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

/**
 * Created by ��������� on 05.08.2015.
 */
public class ProjectPage extends PageBase {

    WebDriver driver = getDriver();
    @Override
    protected void Init() {

    }

    public ProjectPage(){
        super();
    }

    public void createProject(String _projectName) throws InterruptedException {
        WebElement createBtn =  driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        WebElement projectName = driver.findElement(By.id("projectName"));
        projectName.clear();
        projectName.sendKeys(_projectName);
        driver.findElement(By.id("projectShortDesc")).clear();
        driver.findElement(By.id("projectShortDesc")).sendKeys("Test");

//        WebElement projectManager = driver.findElement(By.id("projectManagerDD"));
//        projectManager.click();
//
//        for (int i=1; i<13; i++){
//            driver.findElement(By.linkText("Next>")).click();
//        }
//
//        WebElement chooseManager = driver.findElement(By.id("55b92ad221e4b7c40f000063"));
//        chooseManager.click();
        WebElement projectType = driver.findElement(By.id("projectTypeDD"));
        projectType.click();
        driver.findElement(By.id("qa")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }

    public void switchToList() throws InterruptedException {
        wait(1000);
        driver.findElement(By.id("listBtn")).click();
        wait(1000);
    }

    public void removeAllProjects() throws InterruptedException {
        wait(1000);
        driver.findElement(By.id("check_all")).click();
        wait(1000);
        driver.findElement(By.id("top-bar-deleteBtn")).click();
        wait(1000);
        alertAcept();

    }

    public void createProjectWithAttachment() throws InterruptedException {
        driver.findElement(By.id("top-bar-createBtn")).click();
        driver.findElement(By.id("projectName")).clear();
        driver.findElement(By.id("projectName")).sendKeys("QA");
        driver.findElement(By.id("projectShortDesc")).clear();
        driver.findElement(By.id("projectShortDesc")).sendKeys("qa");
        wait(1000);
        driver.findElement(By.id("inputAttach")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
        wait(1000);
        assertEquals("Chrysanthemum.jpg", driver.findElement(By.cssSelector("span.blue")).getText());
        wait(1000);
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();



    }
}
