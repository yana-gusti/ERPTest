package Methods.HR;


import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
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
public class ApplicationsPage extends BaseTest {
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



    public void createApplication( String _firstName, String _lastName, RemoteWebDriver driver) throws InterruptedException {
        createBtn  = driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        firstName = driver.findElement(By.id("first"));
        firstName.sendKeys(_firstName);
        lastName = driver.findElement(By.id("last"));
        lastName.sendKeys(_lastName);
        WebElement birthday=driver.findElement(By.id("dateBirth"));
        birthday.click();
        wait(3000);
        driver.findElement(By.linkText("Prev")).click();
        wait(1000);
        WebElement choose_birthday=driver.findElement(By.linkText("13"));
        choose_birthday.click();
        wait(1000);

        createAppBtn  = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        createAppBtn.click();
    }

    public void SwitchOnList(RemoteWebDriver driver) throws InterruptedException {
        listBtn = driver.findElement(By.id("listBtn"));
        listBtn.click();
    }
    public void viewAppDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]"));
        choose_one.click();
    }
    public void removeApp(RemoteWebDriver driver) throws InterruptedException {

        wait(1000);
        deleteBtn = driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]"));
        deleteBtn.click();


    }
    public void cancel(RemoteWebDriver driver){
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

    }


    public void cancelInDetails(RemoteWebDriver driver){
        driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }


}
