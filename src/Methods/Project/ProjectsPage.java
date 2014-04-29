package Methods.Project;

import Methods.LoginPage;
import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 06.01.14.
 */
public class ProjectsPage extends PageBase {

    public WebElement userName;
    public WebElement logOut;
    public WebElement createBtn;
    public WebElement projectName;
    public WebElement projectShortDesc;
    public WebElement workflow;
    public WebElement createProjectBtn;
    public WebElement chooseToDelete;
    public WebElement listBtn;
    public WebElement filterListBtn;
    public WebElement stageNew;
    public WebElement wrapper;
    public WebElement deleteBtn;
    public WebElement cancelBtn;
    public WebElement choose_one;
    public WebElement chooseStageNew;
    public WebElement kanbanBtn;
    public WebElement Logout;
    public WebElement StageBTN;
    public WebElement unmarkCheckbox;
    public WebElement NewStage;
    public WebElement PandingStage;
    public WebElement ClosedStage;
    public WebElement Cancelled;
    public WebElement AcceptChangesStage;
    public WebElement workflowsDd;
    public WebElement InProgressStage;
    public WebElement StageLink;
    public WebElement SelectingStage;
    public WebElement ArrowButton;
    public WebElement UndefinedCheckBox;
    public WebElement NewCheckBox;
    public WebElement PendingCheckBox;
    public WebElement CancelledCheckBox;
    public WebElement InProgressCheckBox;
    public WebElement ClosedCheckBox;
    public WebElement ClickAnywhere;
    Integer seconds=1000;


    public ProjectsPage()
    {
        super();
    }

    public void Init() {

        userName  = getDriver().findElement(By.id(getProperty("userName.id")));

    }

    public void createCorrectProject(String _projectName, String _projectShortDesc) throws InterruptedException {
        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        projectName = getDriver().findElement(By.id(getProperty("projectName.id")));
        projectName.click();
        projectName.sendKeys(_projectName);
        projectShortDesc = getDriver().findElement(By.id(getProperty("projectShortDesc.id")));
        projectShortDesc.click();
        projectShortDesc.sendKeys(_projectShortDesc);
        wait(1000);
        workflowsDd = getDriver().findElement(By.id("workflowsDd"));
        workflowsDd.click();
        wait(1000);
        InProgressStage = getDriver().findElement(By.id("528ce7f2f3f67bc40b000023"));
        InProgressStage.click();
        wait(1000);
        createProjectBtn  = getDriver().findElement(By.xpath(getProperty("createProjectBtn.xpath")));
        createProjectBtn.click();
        wait(1000);


    }
    public void createCorrectProject2(String _projectName, String _projectShortDesc) throws InterruptedException {
        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        projectName = getDriver().findElement(By.id(getProperty("projectName.id")));
        projectName.click();
        projectName.sendKeys(_projectName);
        projectShortDesc = getDriver().findElement(By.id(getProperty("projectShortDesc.id")));
        projectShortDesc.click();
        projectShortDesc.sendKeys(_projectShortDesc);
        wait(1000);
        createProjectBtn  = getDriver().findElement(By.xpath(getProperty("createProjectBtn.xpath")));
        createProjectBtn.click();
        wait(1000);


    }

    public LoginPage logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        wait(1000);
        logOut = getDriver().findElement(By.linkText(getProperty("logout.link")));
        logOut.click();
        wait(1000);
        return new LoginPage();
    }




    public void viewProjectDetails() throws IOException, InterruptedException {
        listBtn = getDriver().findElement(By.xpath(getProperty("listBtn.xpath")));
        listBtn.click();
        wait(1000);
        choose_one = getDriver().findElement(By.xpath(getProperty("choose_one.xpath")));
        choose_one.click();


    }
    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.id("listBtn"));
        listBtn.click();
        wait(1000);
    }

    public void removeProject() throws InterruptedException, IOException {
        listBtn = getDriver().findElement(By.id("listBtn"));
        chooseToDelete = getDriver().findElement(By.id("check_all"));
        chooseToDelete.click();
        wait(1000);
        deleteBtn = getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();
    }
    public void cancel() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath(getProperty("cancel.xpath")));
        cancelBtn.click();
}
    public void cancelInDetails() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]"));
        cancelBtn.click();
    }
    public void CheckboxUnmark() throws InterruptedException, IOException {
        StageBTN = getDriver().findElement(By.xpath(getProperty("StageBtn.id")));
        StageBTN.click();
        wait(1000);
        unmarkCheckbox = getDriver().findElement(By.cssSelector(getProperty("unmark.id")));
        unmarkCheckbox.click();
        NewStage = getDriver().findElement(By.xpath(getProperty("New.id")));
        NewStage.click();
        PandingStage = getDriver().findElement(By.xpath(getProperty("Panding.id")));
        PandingStage.click();
        ClosedStage = getDriver().findElement(By.xpath(getProperty("Closed.id")));
        ClosedStage.click();
        Cancelled =  getDriver().findElement(By.xpath(getProperty("Cancelled.id")));
        Cancelled.click();
        AcceptChangesStage = getDriver().findElement(By.cssSelector(getProperty("AcceptChangesInStage.id")));
        AcceptChangesStage.click();
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
        PendingCheckBox=getDriver().findElement(By.xpath(getProperty("pendingcheckbox.xpath")));
        PendingCheckBox.click();
        InProgressCheckBox=getDriver().findElement(By.xpath(getProperty("inprogresscheckbox.xpath")));
        InProgressCheckBox.click();
        ClosedCheckBox=getDriver().findElement(By.xpath(getProperty("closedcheckbox.xpath")));
        ClosedCheckBox.click();
        CancelledCheckBox=getDriver().findElement(By.xpath(getProperty("cancelledcheckbox.xpath")));
        CancelledCheckBox.click();
        ClickAnywhere=getDriver().findElement(By.cssSelector(getProperty("someplace.css")));
        ClickAnywhere.click();
        wait(seconds);
    }

    public void SelectOneStage() throws InterruptedException {
        ArrowButton=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowButton.click();
        wait(seconds);
        InProgressCheckBox=getDriver().findElement(By.xpath(getProperty("inprogresscheckbox.xpath")));
        InProgressCheckBox.click();
        wait(seconds);
        ClickAnywhere=getDriver().findElement(By.cssSelector(getProperty("someplace.css")));
        ClickAnywhere.click();
        wait(seconds);
    }

}
