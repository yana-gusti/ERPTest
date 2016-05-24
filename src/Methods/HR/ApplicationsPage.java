package Methods.HR;


import Methods.MyProfile.LoginPage;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationsPage extends Settings {
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



    public void createApplication( String _firstName, String _lastName) throws InterruptedException {
        createBtn  = getDriver().findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        firstName = getDriver().findElement(By.id("first"));
        firstName.sendKeys(_firstName);
        lastName = getDriver().findElement(By.id("last"));
        lastName.sendKeys(_lastName);
        WebElement birthday=getDriver().findElement(By.id("dateBirth"));
        birthday.click();
        wait(1000);
        getDriver().findElement(By.linkText("Prev")).click();
        wait(1000);
        WebElement choose_birthday=getDriver().findElement(By.linkText("13"));
        choose_birthday.click();
        wait(1000);

        createAppBtn  = getDriver().findElement(By.xpath("(//button[@type='button'])[2]"));
        createAppBtn.click();
    }

    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath("listBtn"));
        listBtn.click();
    }
    public void viewAppDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(".//*[@id='listTable']/tr/td[3]"));
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


    public void cancelInDetails(){
        getDriver().findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }


}
