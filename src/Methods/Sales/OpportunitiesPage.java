package Methods.Sales;

import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 06.01.14.
 */
public class OpportunitiesPage extends BaseTest {

    public WebElement logOut;
    public WebElement createBtn;
    public WebElement listBtn;
    public WebElement choose_one;
    public WebElement Target;
    public WebElement Source;
    public WebElement SelectCurrentStage;
    public WebElement SelectStage;
    public WebElement openOpportunitie;
    private WebElement filterByCustomerBtn;
    private WebElement choosedCustomer;
    private WebElement filterByStageBtn;
    private WebElement choosedStage;
    private WebElement filterBySalesBtn;
    private WebElement choosedSales;
    private WebElement filterBtn;


    public OpportunitiesPage()
    {
        super();
    }



    public void createCorrectOpportunity(String _opportunityName, RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='top-bar-createBtn']")).click();
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='name']")).clear();
        driver.findElement(By.xpath(".//*[@id='name']")).sendKeys(_opportunityName);
        driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[1]")).click();

    }

    public void viewOpportunityDetails( RemoteWebDriver driver) throws IOException, InterruptedException {
        driver.findElement(By.id("listBtn")).click();

        wait(seconds);
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[4]"));
        choose_one.click();


    }

    public void removeOpportunity( RemoteWebDriver driver) throws InterruptedException, IOException {
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[1]/input")).click();
        driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();

    }
    public void cancel( RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }
    public void DragDropToProposition( RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        Source=driver.findElement(By.cssSelector(".bold.left"));
        Target=driver.findElement(By.xpath(".//*[@id='content-holder']/table/tbody/tr/td[3]"));
        new Actions(driver).dragAndDrop(Source, Target).perform();
        wait(seconds);
    }

    public void ChangeStage( RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        openOpportunitie = driver.findElement(By.xpath(".//tr[1]/td[2]/span[text() = 'Test']"));
        openOpportunitie.click();
        wait(seconds);
        SelectCurrentStage=driver.findElement(By.xpath("//div[text()= 'To estimate']"));
        SelectCurrentStage.click();
        wait(seconds);

    }

    public void SwitchToListView( RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        WebElement ListViewButton = driver.findElement(By.id("listBtn"));
        ListViewButton.click();
        wait(seconds);
    }
    public void openFilterMenu(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterBtn = driver.findElement(By.xpath(".//*[@id='searchContainer']/div/div[1]/span[2]"));
        filterBtn.click();

    }
    public void filterByCustomer(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterByCustomerBtn = driver.findElement(By.id("customer"));
        filterByCustomerBtn.click();
        wait(seconds);
        choosedCustomer = driver.findElement(By.xpath(".//*[@id='customerUl']/li[1]"));
        choosedCustomer.click();
        wait(seconds);

    }
    public void filterByStage(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterByStageBtn = driver.findElement(By.id("workflow"));
        filterByStageBtn.click();
        wait(seconds);
        choosedStage = driver.findElement(By.xpath(".//*[@id='workflowUl']/li[1]"));
        choosedStage.click();
        wait(seconds);

    }
    public void filterBySales(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterBySalesBtn = driver.findElement(By.id("salesPerson"));
        filterBySalesBtn.click();
        wait(seconds);
        choosedSales = driver.findElement(By.xpath(".//*[@id='salesPersonUl']/li[1]"));
        choosedSales.click();
        wait(seconds);

    }

}
