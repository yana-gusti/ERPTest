package Methods.HR;


import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class JobPositionsPage extends BaseTest {
    public WebElement userName;
    public WebElement createBtn;
    public WebElement jobName;
    public WebElement createAppBtn;
    public WebElement logOut;
    public WebElement listBtn;
    public WebElement choose_one;



    public void createJobPosition(String _jobName, RemoteWebDriver driver) throws InterruptedException {
        createBtn  = driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(seconds);
        jobName = driver.findElement(By.id("name"));
        jobName.sendKeys(_jobName);
        createAppBtn  = driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]"));
        createAppBtn.click();
    }


    public void viewJobDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]"));
        choose_one.click();

    }
    public void removeJobPosition(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).click();
        wait(seconds);
        driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();



    }
    public void cancel(RemoteWebDriver driver){
        driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }

    public void editJobPosition(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).click();
        wait(seconds);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("QA");
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();

    }


}
