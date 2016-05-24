package Methods.Project;


import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    public WebElement ArrowButton;
    public WebElement UndefinedCheckBox;
    public WebElement NewCheckBox;
    public WebElement InProgressCheckBox;
    public WebElement FixedCheckBox;
    public WebElement TestingCheckBox;
    public WebElement DoneCheckBox;
    public WebElement CancelledCheckBox;
    public WebElement ClickAnywhere;
    Integer seconds = 1000;

    public TasksPage()
    {
        super();
    }



    public void createCorrectTask(String _Summary) throws InterruptedException {

        createBtn  = getDriver().findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(1000);
        Summary = getDriver().findElement(By.id("summaryTask"));
        Summary.click();
        Summary.sendKeys(_Summary);
        wait(1000);
        WebElement StageSelector = getDriver().findElement(By.id("workflowsDd"));
        StageSelector.click();
        wait(seconds);
        WebElement SelectingStage = getDriver().findElement(By.id("528ce35af3f67bc40b000010"));
        SelectingStage.click();
        wait(seconds);
        getDriver().findElement(By.xpath("(//button[@type='button'])[6]")).click();

    }







    public void viewTaskDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]"));
        choose_one.click();
    }

    public void removeTask() throws InterruptedException, IOException {
        getDriver().findElement(By.id("check_all")).click();
        wait(1000);
        getDriver().findElement(By.id("top-bar-deleteBtn")).click();

    }
    public void cancel() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath("(//button[@type='button'])[7]"));

        cancelBtn.click();
    }
    public void SwitchToKarbanView() throws InterruptedException {
        KarbanViewButton=getDriver().findElement(By.id("kanbanBtn"));
        KarbanViewButton.click();
        wait(seconds);
    }
    public void DragDropToInProgress() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(".task-header"));
        Target=getDriver().findElement(By.xpath(".//*[@id='528ce131f3f67bc40b00000d']"));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }

}
