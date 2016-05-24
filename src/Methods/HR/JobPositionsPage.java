package Methods.HR;


import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public WebElement deleteBtn;
    public WebElement createFired;
    public WebElement editJob;
    public WebElement department;
    private WebDriver driver = getDriver();

    public JobPositionsPage()
    {
        super();
    }

    public void Init() {

    }

    public void createJobPosition(String _jobName) throws InterruptedException {
        createBtn  = getDriver().findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(3000);
        jobName = getDriver().findElement(By.id("name"));
        jobName.sendKeys(_jobName);
        wait(2000);
        createAppBtn  = getDriver().findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]"));
        createAppBtn.click();
    }


    public void viewJobDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[67]/td[3]"));
        choose_one.click();

    }
    public void removeJobPosition() throws InterruptedException {
        wait(2000);
        getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[67]/td[3]")).click();
        wait(2000);
        getDriver().findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]")).click();


    }
    public void cancel(){
        getDriver().findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }

    public void editJobPosition() throws InterruptedException {
        driver.findElement(By.xpath("//tbody[@id='listTable']/tr[67]/td[3]")).click();
        wait(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("QA");
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        wait(3000);
        assertEquals("QA", getDriver().findElement(By.xpath("//tbody[@id='listTable']/tr[67]/td[3]")).getText());



    }


}
