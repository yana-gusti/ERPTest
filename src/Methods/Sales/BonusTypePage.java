package Methods.Sales;

import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by ��������� on 21.08.2015.
 */
public class BonusTypePage extends BaseTest {


    public void createBonusType(RemoteWebDriver driver){
        driver.findElement(By.id("top-bar-createBtn")).click();
        driver.findElement(By.cssSelector("td.editable")).click();
        driver.findElement(By.cssSelector("input.editing")).click();
        driver.findElement(By.xpath("//tr[@id='false']/td[4]")).click();
        driver.findElement(By.xpath("//tr[@id='false']/td[4]/ul/li[2]")).click();
        driver.findElement(By.xpath("//tr[@id='false']/td[5]")).click();
        driver.findElement(By.cssSelector("input.editing")).click();
        driver.findElement(By.xpath("//tr[@id='false']/td[6]")).click();
        driver.findElement(By.cssSelector("input.editing")).click();
        driver.findElement(By.id("top-bar-saveBtn")).click();

    }
}
