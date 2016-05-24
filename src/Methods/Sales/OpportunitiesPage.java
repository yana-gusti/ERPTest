package Methods.Sales;

import Methods.MyProfile.LoginPage;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 06.01.14.
 */
public class OpportunitiesPage extends Settings {

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



    public void createCorrectOpportunity(String _opportunityName) throws InterruptedException {

        createBtn  = getDriver().findElement(By.xpath(".//*[@id='top-bar-createBtn']"));
        createBtn.click();
        wait(1000);
        opportunityName = getDriver().findElement(By.xpath("Test"));
        opportunityName.click();
        opportunityName.sendKeys(_opportunityName);
        wait(1000);
        createOpportBtn  = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[1]"));
        createOpportBtn.click();
        wait(1000);

    }






    public void viewOpportunityDetails() throws IOException, InterruptedException {
        listBtn = getDriver().findElement(By.xpath(".//*[@id='listBtn']"));
        listBtn.click();
        wait(1000);
        choose_one = getDriver().findElement(By.xpath(".//*[@id='listTable']/tr/td[4]"));
        choose_one.click();


    }

    public void removeOpportunity() throws InterruptedException, IOException {
        chooseToDelete = getDriver().findElement(By.xpath(".//*[@id='check_all']"));
        chooseToDelete.click();
        wait(1000);
        deleteBtn = getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();
    }
    public void cancel() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]"));
        cancelBtn.click();
    }
    public void DragDropToProposition() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(".bold.left"));
        Target=getDriver().findElement(By.xpath(".//*[@id='content-holder']/table/tbody/tr/td[3]"));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }

    public void ChangeStage() throws InterruptedException {
        wait(seconds);
        SelectCurrentStage=getDriver().findElement(By.linkText("New"));
        SelectCurrentStage.click();
        wait(seconds);
        SelectStage=getDriver().findElement(By.id("528cde9ef3f67bc40b000008"));
        SelectStage.click();
        wait(seconds);
    }

    public void SwitchToListView() throws InterruptedException {
        wait(seconds);
        WebElement ListViewButton = getDriver().findElement(By.id("listBtn"));
        ListViewButton.click();
        wait(seconds);
    }
}
