package Methods.HR;

import Methods.LoginPage;
import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationsPage extends PageBase {
    public WebElement userName;
    public WebElement createBtn;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement createAppBtn;
    public WebElement logOut;
    public WebElement listBtn;
    public WebElement choose_one;
    public WebElement deleteBtn;
    public WebElement createEmployee;
    public WebElement Target;
    public WebElement Source;
    public WebElement ListViewButton;
    public WebElement SelectCurrentStage;
    public WebElement SelectStage;
    public WebElement ArrowDownButtn;
    public WebElement UndefinedCheckBox;
    public WebElement InitialCheckBox;
    public WebElement readyToTeachBox;
    public WebElement FirstInterviewBox;
    public WebElement SecondInterviewBox;
    public WebElement IntershipBox;
    public WebElement ContractSingnetBox;
    public WebElement ContractEndBox;
    public WebElement Refused;
    Integer seconds = 1000;

    public ApplicationsPage()
    {
        super();
    }

    public void Init() {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
    }

    public void createApplication(String _firstName, String _lastName) throws InterruptedException {
        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        firstName = getDriver().findElement(By.id(getProperty("firstName.id")));
        firstName.sendKeys(_firstName);
        lastName = getDriver().findElement(By.id(getProperty("lastName.id")));
        lastName.sendKeys(_lastName);
        getDriver().findElement(By.id("dateBirth")).click();
        wait(1000);
//        getDriver().findElement(By.linkText("Prev")).click();
//        wait(1000);
        getDriver().findElement(By.xpath("(//a[contains(text(),'4')])[3]")).click();

        createAppBtn  = getDriver().findElement(By.xpath(getProperty("createAppBtn.xpath")));
        createAppBtn.click();
    }
    public LoginPage logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        getDriver().findElement(By.linkText("Logout")).click();
        return new LoginPage();
    }
    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath(getProperty("listBtn.xpath")));
        listBtn.click();
    }
    public void viewAppDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(getProperty("ChooseOne.xpath")));
        choose_one.click();
    }
    public void removeApp() throws InterruptedException {
        getDriver().findElement(By.xpath(".//*[@id='check_all']")).click();
        wait(1000);
        deleteBtn = getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();


    }
    public void cancel(){
        getDriver().findElement(By.xpath("(//button[@type='button'])[3]")).click();

    }

    public void createEmployee()  {
        createEmployee =  getDriver().findElement(By.xpath(getProperty("createEmployee.xpath")));
        createEmployee.click();
    }
    public void cancelInDetails(){
        getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]")).click();

    }
    public void DragDropToInitialQualification() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("initialfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToReadyToTeach() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("readyfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToReadyFirstInterview() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("firstintfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToSecondInterview() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("secondintfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToIntership() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("intershipfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToContractSigned() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("contractsignedfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToContaractEnd() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("contractend.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void DragDropToRefused() throws InterruptedException {
        wait(seconds);
        Source=getDriver().findElement(By.cssSelector(getProperty("createditem.css")));
        Target=getDriver().findElement(By.xpath(getProperty("refusedfield.xpath")));
        new Actions(getDriver()).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }
    public void SwitchToListView() throws InterruptedException {
        ListViewButton=getDriver().findElement(By.id(getProperty("listbtn.id")));
        ListViewButton.click();
        wait(seconds);
    }
    public void ChangeStage() throws InterruptedException {
        SelectCurrentStage=getDriver().findElement(By.linkText(getProperty("currentstage.linkText")));
        SelectCurrentStage.click();
        wait(seconds);
        SelectStage=getDriver().findElement(By.id(getProperty("stage.id")));
        SelectStage.click();
        wait(seconds);
    }
    public void DeselectAllExeptOneInStageFilters()throws InterruptedException {
        ArrowDownButtn=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowDownButtn.click();
        UndefinedCheckBox=getDriver().findElement(By.xpath(getProperty("undefbox.xpath")));
        UndefinedCheckBox.click();
        InitialCheckBox=getDriver().findElement(By.xpath(getProperty("initbox.xpath")));
        InitialCheckBox.click();
        readyToTeachBox=getDriver().findElement(By.xpath(getProperty("readytoteachbox.xpath")));
        readyToTeachBox.click();
        FirstInterviewBox=getDriver().findElement(By.xpath(getProperty("firstinterviewbox.xpath")));
        FirstInterviewBox.click();
        SecondInterviewBox=getDriver().findElement(By.xpath(getProperty("secondinterviewbox.xpath")));
        SecondInterviewBox.click();
        IntershipBox=getDriver().findElement(By.xpath(getProperty("intershipbox.xpath")));
        IntershipBox.click();
        ContractSingnetBox=getDriver().findElement(By.xpath(getProperty("contractsignetbox.xpath")));
        ContractSingnetBox.click();
        ContractEndBox=getDriver().findElement(By.xpath(getProperty("contractendbox.xpath")));
        ContractEndBox.click();
        Refused=getDriver().findElement(By.xpath(getProperty("refusebox.xpath")));
        Refused.click();
        getDriver().findElement(By.cssSelector("#submenu-holder > nav > ul")).click();
        wait(seconds);
    }
    public void SelectFromStageFilter() throws InterruptedException {
        ArrowDownButtn=getDriver().findElement(By.xpath(getProperty("arrowbtn.xpath")));
        ArrowDownButtn.click();
        wait(seconds);
        FirstInterviewBox=getDriver().findElement(By.xpath(getProperty("applicationStage.xpath")));
        FirstInterviewBox.click();
        getDriver().findElement(By.cssSelector("#submenu-holder > nav > ul")).click();
        wait(seconds);
    }


}
