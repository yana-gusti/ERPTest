package Methods.Project;

import Methods.LoginPage;
import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class TasksPage extends PageBase {

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

    public void Init() {

        userName  = getDriver().findElement(By.id(getProperty("userName.id")));

    }

    public void createCorrectTask(String _Summary) throws InterruptedException {

        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        wait(1000);
        Summary = getDriver().findElement(By.id(getProperty("summary.id")));
        Summary.click();
        Summary.sendKeys(_Summary);
        wait(1000);
        WebElement StageSelector = getDriver().findElement(By.id(getProperty("stageselector.id")));
        StageSelector.click();
        wait(seconds);
        WebElement SelectingStage = getDriver().findElement(By.id(getProperty("stage.id")));
        SelectingStage.click();
        wait(seconds);
        getDriver().findElement(By.xpath("(//button[@type='button'])[6]")).click();

    }
    public void createCorrectTask2(String _Summary) throws InterruptedException {

        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        wait(1000);
        Summary = getDriver().findElement(By.id(getProperty("summary.id")));
        Summary.click();
        Summary.sendKeys(_Summary);
        wait(1000);
        getDriver().findElement(By.xpath("(//button[@type='button'])[6]")).click();

    }



    public LoginPage logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        wait(1000);
        WebElement logOut = getDriver().findElement(By.linkText(getProperty("logout.link")));
        logOut.click();
        wait(1000);
        return new LoginPage();
    }



    public void viewTaskDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(getProperty("choose_one.xpath")));
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
        KarbanViewButton=getDriver().findElement(By.id(getProperty("kanbanbtn.id")));
        KarbanViewButton.click();
        wait(seconds);
    }
    public void DragDropToInProgress() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("inprogressfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToFixed() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("fixedfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToTesting() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("testingfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToDone() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("donefield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToCancelled() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("cancelledfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToNew() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("newfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void SwitchToListView() throws InterruptedException {
        WebElement ListViewButton = getDriver().findElement(By.id(getProperty("listbtn.id")));
        ListViewButton.click();
        wait(seconds);
    }
    public void DeselectAllExeptOneInStageFilters()throws InterruptedException {
        ArrowButton=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowButton.click();
        wait(seconds);
        UndefinedCheckBox=getDriver().findElement(By.xpath(getProperty("undefinedcheckbox.xpath")));
        UndefinedCheckBox.click();
        wait(seconds);
        NewCheckBox=getDriver().findElement(By.xpath(getProperty("newcheckbox.xpath")));
        NewCheckBox.click();
        wait(seconds);
        InProgressCheckBox=getDriver().findElement(By.xpath(getProperty("inprogresscheckbox.xpath")));
        InProgressCheckBox.click();
        wait(seconds);
        FixedCheckBox=getDriver().findElement(By.xpath(getProperty("fixedcheckbox.xpath")));
        FixedCheckBox.click();
        wait(seconds);
        TestingCheckBox=getDriver().findElement(By.xpath(getProperty("testingcheckbox.xpath")));
        TestingCheckBox.click();
        wait(seconds);
        DoneCheckBox=getDriver().findElement(By.xpath(getProperty("donecheckbox.xpath")));
        DoneCheckBox.click();
        wait(seconds);
        CancelledCheckBox=getDriver().findElement(By.xpath(getProperty("cancelledcheckbox.xpath")));
        CancelledCheckBox.click();
        wait(seconds);
        ClickAnywhere=getDriver().findElement(By.cssSelector(getProperty("someplace.css")));
        ClickAnywhere.click();
        wait(seconds);
    }
    public void SelectOneStage() throws InterruptedException {
        ArrowButton=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowButton.click();
        wait(seconds);
        TestingCheckBox=getDriver().findElement(By.xpath(getProperty("testingcheckbox.xpath")));
        TestingCheckBox.click();
        wait(seconds);
        ClickAnywhere=getDriver().findElement(By.cssSelector(getProperty("someplace.css")));
        ClickAnywhere.click();
        wait(seconds);
    }
}
