package Methods.Sales;

import Methods.Base.PageBase;
import Methods.MyProfile.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 06.01.14.
 */
public class OpportunitiesPage extends PageBase {

    public WebElement userName;
    public WebElement logOut;
    public WebElement createBtn;
    public WebElement opportunityName;
    public WebElement stage;
    public WebElement createOpportBtn;
    public WebElement chooseToDelete;
    public WebElement personNameView;
    public WebElement listBtn;
    public WebElement filterListBtn;
    public WebElement wrapper;
    public WebElement deleteBtn;
    public WebElement cancelBtn;
    public WebElement choose_one;
    public WebElement chooseStage;
    public WebElement chooseStageNew;
    public WebElement kanbanBtn;
    public WebElement Target;
    public WebElement Source;
    public WebElement SelectCurrentStage;
    public WebElement SelectStage;
    public WebElement ArrowDownButtn;
    public WebElement UndefinedCheckBox;
    public WebElement NewCheckBox;
    public WebElement QualificationCheckBox;
    public WebElement PropositionCheckBox;
    public WebElement WonCheckBox;
    public WebElement LostBox;
    public WebElement ClickAnywhere;
    Integer seconds = 1000;


    public OpportunitiesPage()
    {
        super();
    }

    public void Init() {

        userName  = getDriver().findElement(By.id(getProperty("userName.id")));

    }

    public void createCorrectOpportunity(String _opportunityName) throws InterruptedException {

        createBtn  = getDriver().findElement(By.xpath(getProperty("createBtn.xpath")));
        createBtn.click();
        wait(1000);
        opportunityName = getDriver().findElement(By.xpath(getProperty("opportunityName.xpath")));
        opportunityName.click();
        opportunityName.sendKeys(_opportunityName);
        wait(1000);
        createOpportBtn  = getDriver().findElement(By.xpath(getProperty("createOpportBtn.xpath")));
        createOpportBtn.click();
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




    public void viewOpportunityDetails() throws IOException, InterruptedException {
        listBtn = getDriver().findElement(By.xpath(getProperty("listBtn.xpath")));
        listBtn.click();
        wait(1000);
        choose_one = getDriver().findElement(By.xpath(getProperty("choose_one.xpath")));
        choose_one.click();


    }

    public void removeOpportunity() throws InterruptedException, IOException {
        chooseToDelete = getDriver().findElement(By.xpath(getProperty("chooseToDelete.xpath")));
        chooseToDelete.click();
        wait(1000);
        deleteBtn = getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();
    }
    public void cancel() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath(getProperty("cancelBtn.xpath")));
        cancelBtn.click();
    }
    public void DragDropToProposition() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("propositionfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToWon() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("wonfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToLost() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("lostfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToQualification() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("qualificationfield.xpath")));
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
    public void ChangeStage() throws InterruptedException {
        wait(seconds);
        SelectCurrentStage=getDriver().findElement(By.linkText("New"));
        SelectCurrentStage.click();
        wait(seconds);
        SelectStage=getDriver().findElement(By.id(getProperty("stage.id")));
        SelectStage.click();
        wait(seconds);
    }
    public void DeselectAllExeptOneInStageFilters()throws InterruptedException {
        ArrowDownButtn=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowDownButtn.click();
        wait(seconds);
        UndefinedCheckBox=getDriver().findElement(By.xpath(getProperty("undefbox.xpath")));
        UndefinedCheckBox.click();
        NewCheckBox=getDriver().findElement(By.xpath(getProperty("newbox.xpath")));
        NewCheckBox.click();
        QualificationCheckBox=getDriver().findElement(By.xpath(getProperty("qualificationbox.xpath")));
        QualificationCheckBox.click();
        PropositionCheckBox=getDriver().findElement(By.xpath(getProperty("propositionbox.xpath")));
        PropositionCheckBox.click();
        WonCheckBox=getDriver().findElement(By.xpath(getProperty("wonbox.xpath")));
        WonCheckBox.click();
        LostBox=getDriver().findElement(By.xpath(getProperty("lostbox.xpath")));
        LostBox.click();
        ClickAnywhere=getDriver().findElement(By.cssSelector("html.no-js"));
        ClickAnywhere.click();
        wait(seconds);
    }
    public void SelectOneStage() throws InterruptedException {
        ArrowDownButtn=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowDownButtn.click();
        wait(seconds);
        PropositionCheckBox=getDriver().findElement(By.xpath(getProperty("propositionbox.xpath")));
        PropositionCheckBox.click();
        wait(seconds);
        ClickAnywhere=getDriver().findElement(By.cssSelector("html.no-js"));
        ClickAnywhere.click();
        wait(seconds);
    }
    public void SwitchToListView() throws InterruptedException {
        wait(seconds);
        WebElement ListViewButton = getDriver().findElement(By.id(getProperty("listbtn.id")));
        ListViewButton.click();
        wait(seconds);
    }
}
