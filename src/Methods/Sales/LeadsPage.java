package Methods.Sales;

import Methods.Base.PageBase;
import Methods.MyProfile.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class LeadsPage extends PageBase {

    private WebElement userName;
    private WebElement logOut;
    private WebElement createBtn;
    private WebElement leadName;
    private WebElement workflow;
    private WebElement createLeadBtn;
    public WebElement chooseToDelete;
    public WebElement personNameView;
    public WebElement filterListBtn;
    public WebElement stage;
    public WebElement wrapper;
    public WebElement deleteBtn;
    public WebElement cancelBtn;
    public WebElement choose_one;
    public WebElement ArrowButton;
    public WebElement UndefinedCheckBox;
    public WebElement DraftCheckBox;
    public WebElement CancelledCheckBox;
    public WebElement OpenCheckBox;
    public WebElement InProgressCheckBox;
    public WebElement ClosedCheckBox;
    public WebElement ClickAnywhere;
    Integer seconds=1000;

    public LeadsPage()
    {
        super();
    }

    public void Init() {

        userName  = getDriver().findElement(By.id(getProperty("userName.id")));

    }

    public void createCorrectLead(String _leadName) throws InterruptedException {

        createBtn  = getDriver().findElement(By.xpath(getProperty("createBtn.xpath")));
        createBtn.click();
        wait(1000);
        leadName = getDriver().findElement(By.xpath(getProperty("leadName.xpath")));
        leadName.click();
        leadName.sendKeys(_leadName);
        wait(1000);
        WebElement StageLink = getDriver().findElement(By.id(getProperty("stageselector.id")));
        StageLink.click();
        WebElement SelectingStage = getDriver().findElement(By.id(getProperty("stage.id")));
        SelectingStage.click();
        createLeadBtn  = getDriver().findElement(By.xpath(getProperty("createLeadBtn.xpath")));
        createLeadBtn.click();
    }
    public void createCorrectLead2(String _leadName) throws InterruptedException {

        createBtn  = getDriver().findElement(By.xpath(getProperty("createBtn.xpath")));
        createBtn.click();
        wait(1000);
        leadName = getDriver().findElement(By.xpath(getProperty("leadName.xpath")));
        leadName.click();
        leadName.sendKeys(_leadName);
        wait(1000);
        createLeadBtn  = getDriver().findElement(By.xpath(getProperty("createLeadBtn.xpath")));
        createLeadBtn.click();
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

    public void ChangeStage() throws InterruptedException {
        getDriver().findElement(By.linkText("Open")).click();
        getDriver().findElement(By.id("52b4265cc033b7e25ac4f91c")).click();


    }

    public void viewLeadDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(getProperty("choose_one.xpath")));
        choose_one.click();
    }

    public void removeLead() throws InterruptedException, IOException {
        deleteBtn = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[3]"));
        deleteBtn.click();
    }
    public void cancel() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath(getProperty("cancelBtn.xpath")));
        cancelBtn.click();
    }

    public void convertToOpportunity(){
        getDriver().findElement(By.id("convertToOpportunity")).click();
        getDriver().findElement(By.xpath("(//button[@type='button'])[10]")).click();


    }
    public void DeselectAllExeptOneInStageFilters()throws InterruptedException {
        ArrowButton=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowButton.click();
        UndefinedCheckBox=getDriver().findElement(By.xpath(getProperty("undefinedcheckbox.xpath")));
        UndefinedCheckBox.click();
        DraftCheckBox=getDriver().findElement(By.xpath(getProperty("draftcheckbox.xpath")));
        DraftCheckBox.click();
        CancelledCheckBox=getDriver().findElement(By.xpath(getProperty("cancelledcheckbox.xpath")));
        CancelledCheckBox.click();
        OpenCheckBox=getDriver().findElement(By.xpath(getProperty("opencheckbox.xpath")));
        OpenCheckBox.click();
        InProgressCheckBox=getDriver().findElement(By.xpath(getProperty("inprogresscheckbox.xpath")));
        InProgressCheckBox.click();
        ClosedCheckBox=getDriver().findElement(By.xpath(getProperty("closedcheckbox.xpath")));
        ClosedCheckBox.click();
        ClickAnywhere=getDriver().findElement(By.cssSelector("html.no-js"));
        ClickAnywhere.click();
        wait(seconds);
    }
    public void SelectOneStage() throws InterruptedException {
        ArrowButton=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowButton.click();
        wait(seconds);
        OpenCheckBox=getDriver().findElement(By.xpath(getProperty("opencheckbox.xpath")));
        OpenCheckBox.click();
        wait(seconds);
        ClickAnywhere=getDriver().findElement(By.cssSelector("html.no-js"));
        ClickAnywhere.click();
        wait(seconds);
    }
}
