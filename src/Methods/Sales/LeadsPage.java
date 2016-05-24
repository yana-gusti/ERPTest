package Methods.Sales;

import Methods.MyProfile.LoginPage;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class LeadsPage extends Settings {

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



    public void createCorrectLead(String _leadName) throws InterruptedException {

        createBtn  = getDriver().findElement(By.xpath(".//*[@id='top-bar-createBtn']"));
        createBtn.click();
        wait(1000);
        leadName = getDriver().findElement(By.xpath("Test"));
        leadName.click();
        leadName.sendKeys(_leadName);
        wait(1000);
        WebElement StageLink = getDriver().findElement(By.id("workflowsDd"));
        StageLink.click();
        WebElement SelectingStage = getDriver().findElement(By.id("52b4265cc033b7e25ac4f91c"));
        SelectingStage.click();
        createLeadBtn  = getDriver().findElement(By.xpath("(//button[@type='button'])[6]"));
        createLeadBtn.click();
    }




    public void ChangeStage() throws InterruptedException {
        getDriver().findElement(By.linkText("Open")).click();
        getDriver().findElement(By.id("52b4265cc033b7e25ac4f91c")).click();


    }

    public void viewLeadDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(".//*[@id='listTable']/tr/td[3]"));
        choose_one.click();
    }

    public void removeLead() throws InterruptedException, IOException {
        deleteBtn = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[3]"));
        deleteBtn.click();
    }
    public void cancel() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]"));
        cancelBtn.click();
    }

    public void convertToOpportunity(){
        getDriver().findElement(By.id("convertToOpportunity")).click();
        getDriver().findElement(By.xpath("(//button[@type='button'])[10]")).click();


    }

}
