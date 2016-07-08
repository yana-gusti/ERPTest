package Methods.Sales;

import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 02.01.14.
 */
public class CompaniesPage extends BaseTest {

    private WebElement userName;
    private WebElement logOut;
    private WebElement createBtn;
    private WebElement companyName;
    private WebElement createCompanyBtn;
    public WebElement chooseToDelete;
    public WebElement personNameView;
    public WebElement listBtn;
    public WebElement deleteBtn;
    public WebElement cancelBtn;
    public WebElement choose_one;
    public WebElement editCompany;



    public void createCorrectCompany(String _companyName, RemoteWebDriver driver) throws InterruptedException {

        createBtn  = driver.findElement(By.xpath(".//*[@id='top-bar-createBtn']"));
        createBtn.click();
        wait(seconds);
        companyName = driver.findElement(By.xpath(".//*[@id='companyName']"));
        companyName.click();
        companyName.sendKeys(_companyName);
        createCompanyBtn  = driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]"));
        createCompanyBtn.click();

    }



    public void SwitchOnList(RemoteWebDriver driver) throws InterruptedException {
        listBtn = driver.findElement(By.xpath(".//*[@id='listBtn']"));
        listBtn.click();

    }

    public void viewCompanyDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]"));
        choose_one.click();

    }
    public void editCompany(RemoteWebDriver driver){
        editCompany = driver.findElement(By.xpath(".//*[@id='top-bar-editBtn']"));
        editCompany.click();
        driver.findElement(By.name("website")).clear();
        driver.findElement(By.name("website")).sendKeys("www.ua.com");
        driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]")).click();
    }

    public void removeCompany(RemoteWebDriver driver) throws InterruptedException, IOException {

        deleteBtn = driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']"));
        deleteBtn.click();
    }
    public void cancel(RemoteWebDriver driver) throws InterruptedException {
        cancelBtn = driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]"));
        cancelBtn.click();
    }
}

