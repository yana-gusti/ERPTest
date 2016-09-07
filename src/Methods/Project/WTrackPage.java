package Methods.Project;

import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by ��������� on 05.08.2015.
 */
public class WTrackPage extends BaseTest {


    public void createwTrackItem(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.id("top-bar-createBtn")).click();
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[4]")).click();
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li")).click();
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[7]")).click();
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li")).click();
        driver.findElement(By.id("top-bar-saveBtn")).click();

    }

    public void editwTrackItem(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[7]")).click();
        wait(seconds);
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li[2]")).click();
        WebElement hour = driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[14]"));
        hour.sendKeys("5");
        driver.findElement(By.id("top-bar-saveBtn")).click();


    }



    public void removewTrackItem(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='check_all']")).click();

        driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();

        alertAcept(driver);
    }
}
