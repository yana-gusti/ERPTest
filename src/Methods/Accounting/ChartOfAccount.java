package Methods.Accounting;

import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by yanag on 10.08.2016.
 */
public class ChartOfAccount extends BaseTest {

    public void createChartOfAccount(RemoteWebDriver driver){
        driver.findElement(By.id("top-bar-createBtn")).click();
        driver.findElement(By.id(".//*[@id='false']/td[2]")).click();
        driver.findElement(By.id(".//*[@id='false']/td[2]/input")).click();
        driver.findElement(By.id(".//*[@id='false']/td[2]/input")).sendKeys("1234");
        driver.findElement(By.id(".//*[@id='false']/td[3]")).click();
        driver.findElement(By.id(".//*[@id='false']/td[3]/input")).click();
        driver.findElement(By.id(".//*[@id='false']/td[3]/input")).sendKeys("1234");
        driver.findElement(By.id(".//*[@id='false']/td[4]")).click();
        driver.findElement(By.id(".//*[@id='false']/td[4]/input")).click();
        driver.findElement(By.id(".//*[@id='false']/td[4]/input")).sendKeys("1234");
        driver.findElement(By.id("top-bar-saveBtn")).click();



    }
}
