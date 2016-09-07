package Methods.Project;


import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class TasksPage extends BaseTest {

    public WebElement userName;
    public WebElement createBtn;
    public WebElement Summary;
    public WebElement chooseToDelete;
    public WebElement personNameView;
    public WebElement filterListBtn;
    public WebElement stageNew;
    public WebElement wrapper;
    public WebElement deleteBtn;
    public WebElement cancelBtn;
    public WebElement choose_one;
    public WebElement Target;
    public WebElement Source;
    public WebElement KarbanViewButton;


    public void createCorrectTask(String _Summary, RemoteWebDriver driver) throws InterruptedException {

        createBtn  = driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(seconds);
        Summary = driver.findElement(By.id("summaryTask"));
        Summary.click();
        Summary.sendKeys(_Summary);
        WebElement StageSelector = driver.findElement(By.id("workflowsDd"));
        StageSelector.click();
        WebElement SelectingStage = driver.findElement(By.id("528ce35af3f67bc40b000010"));
        SelectingStage.click();
       driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();

    }

    public void viewTaskDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]"));
        choose_one.click();
    }

    public void removeTask(RemoteWebDriver driver) throws InterruptedException, IOException {
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[1]/input")).click();
        wait(seconds);
        driver.findElement(By.id("top-bar-deleteBtn")).click();

    }
    public void cancel(RemoteWebDriver driver) throws InterruptedException {
        cancelBtn = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
        cancelBtn.click();
    }
    public void SwitchToKarbanView(RemoteWebDriver driver) throws InterruptedException {
        KarbanViewButton=driver.findElement(By.id("kanbanBtn"));
        KarbanViewButton.click();
    }
    public void DragDropToInProgress(RemoteWebDriver driver) throws InterruptedException {

        Source=driver.findElement(By.cssSelector(".task-header"));
        Target=driver.findElement(By.xpath(".//*[@id='528ce131f3f67bc40b00000d']"));
        new Actions(driver).dragAndDrop(Source, Target).perform();
    }

}
