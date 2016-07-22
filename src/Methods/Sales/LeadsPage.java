package Methods.Sales;

import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class LeadsPage extends BaseTest {

    private WebElement createBtn;
    private WebElement leadName;
    private WebElement createLeadBtn;
    public WebElement choose_one;

    public LeadsPage()
    {
        super();
    }



    public void createCorrectLead(String _leadName, RemoteWebDriver driver) throws InterruptedException {

        createBtn  = driver.findElement(By.xpath(".//*[@id='top-bar-createBtn']"));
        createBtn.click();
        wait(seconds);
        leadName = driver.findElement(By.xpath(".//*[@id='name']"));
        leadName.click();
        leadName.sendKeys(_leadName);
        createLeadBtn  = driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]"));
        createLeadBtn.click();
    }




    public void ChangeStage(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Draft")).click();
        WebElement dbItem = driver.findElement(By.xpath("//*[@data-status='inprogress']"));
        dbItem.click();



    }

    public void viewLeadDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[3]"));
        choose_one.click();
    }

    public void removeLead(RemoteWebDriver driver) throws InterruptedException, IOException {
        driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();

    }
    public void cancel(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();

    }

    public void convertToOpportunity(RemoteWebDriver driver){
        driver.findElement(By.id("convertToOpportunity")).click();
       driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();


    }

}
