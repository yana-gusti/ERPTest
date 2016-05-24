package Methods.Project;

import Methods.Sales.InvoicePage;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by ��������� on 05.08.2015.
 */
public class WTrackPage extends Settings {
    Integer sec = 2000;

    WebDriver driver = getDriver();


    public WTrackPage(){
        super();
    }

    public void createwTrackItem() throws InterruptedException {
        wait(sec);
        driver.findElement(By.id("top-bar-createBtn")).click();
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[4]")).click();
        wait(sec);
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li")).click();
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[7]")).click();
        wait(sec);
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li")).click();
        wait(sec);
        driver.findElement(By.id("top-bar-saveBtn")).click();
        wait(sec);

    }

    public void editwTrackItem() throws InterruptedException {
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[7]")).click();
        wait(sec);
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li[2]")).click();
        wait(sec);
        WebElement hour = driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[14]"));
        wait(sec);
        hour.sendKeys("5");
        wait(sec);
        driver.findElement(By.id("top-bar-saveBtn")).click();
        wait(sec);


    }

    public InvoicePage generateInvoice() throws InterruptedException {
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[1]/input")).click();
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='top-bar-generateBtn']")).click();
        wait(sec);
        WebElement invoiceNum = driver.findElement(By.xpath(".//*[@id='invoiceName']"));
        wait(sec);
        invoiceNum.clear();
        invoiceNum.sendKeys("1234");
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='create-invoice-dialog']")).click();
        wait(sec);
        return new InvoicePage();
    }

    public void removewTrackItem() throws InterruptedException {
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='check_all']")).click();
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();
        wait(sec);
        alertAcept();
    }
}
