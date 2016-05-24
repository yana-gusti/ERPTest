package Methods.Sales;

import Methods.Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Александр on 21.08.2015.
 */
public class BonusTypePage extends PageBase {
    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public BonusTypePage(){
        super();
    }

    public void createBonusType(){
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
