package Methods.Sales;

import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.util.List;

/**
 * Created by puzzlefacePC on 03.01.14.
 */
public class LeadsPage extends BaseTest {

    private WebElement createBtn;
    private WebElement leadName;
    private WebElement createLeadBtn;
    public WebElement choose_one;
    private WebElement selectChb;
    private WebElement deleteBtn;
    private WebElement filterByContactNameBtn;
    private WebElement choosedContactName;
    private WebElement filterBySourceBtn;
    private WebElement choosedSource;
    private WebElement filterByStageBtn;
    private WebElement choosedStage;
    private WebElement filterBySalesBtn;
    private WebElement choosedSales;
    private WebElement filterByCreatedByBtn;
    private WebElement choosedCreatedBy;
    private WebElement filterBtn;
    private WebElement searchInput;
    private WebElement favoritesTab;
    private WebElement saveButton;
    private WebElement filterField;
    private WebElement useByDefaultCheckbox;


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
        deleteBtn = driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']"));
        deleteBtn.click();
    }
    public void cancel(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();

    }

    public void convertToOpportunity(RemoteWebDriver driver){
        driver.findElement(By.id("convertToOpportunity")).click();

      // driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();


    }
    public void selectWithoutCustomer(RemoteWebDriver driver){

        driver.findElement(By.id("createCustomerOrNot")).click();

    }
    public void selectWithoutCustomerFromMenu(RemoteWebDriver driver){

        driver.findElement(By.xpath("//option[text() = 'Do not create a new customer']")).click();

    }
    public void createOpportunity(RemoteWebDriver driver){

        driver.findElement(By.xpath("//span [ text() = 'Create opportunity']")).click();
        // driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();


    }
    public void selectLead(RemoteWebDriver driver) throws InterruptedException {
        selectChb = driver.findElement(By.xpath(".//tr[1]/td[1]/label/input[@class = 'checkbox'][1]"));
        selectChb.click();
    }

    public void openFilterMenu(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterBtn = driver.findElement(By.xpath(".//*[@id='searchContainer']/div/div[1]/span[2]"));
        filterBtn.click();

    }
    public void filterByContactName(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterByContactNameBtn = driver.findElement(By.id("contactName"));
        filterByContactNameBtn.click();
        wait(seconds);
        choosedContactName = driver.findElement(By.xpath(".//*[@id='contactNameUl']/li[2]"));
        choosedContactName.click();
        wait(seconds);

    }
    public void filterBySource(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterBySourceBtn = driver.findElement(By.id("source"));
        filterBySourceBtn.click();
        wait(seconds);
        choosedSource = driver.findElement(By.xpath(".//*[@id='sourceUl']/li[1]"));
        choosedSource.click();
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
    public void filterByCreatedBy(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterByCreatedByBtn = driver.findElement(By.id("createdBy"));
        filterByCreatedByBtn.click();
        wait(seconds);
        choosedCreatedBy = driver.findElement(By.xpath(".//*[@id='createdByUl']/li[1]"));
        choosedCreatedBy.click();
        wait(seconds);

    }
    public void search(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Web");
        wait(seconds);
        searchInput.sendKeys(Keys.RETURN);
        wait(seconds);

    }
    public void removeFromFavoritesFilter(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        favoritesTab = driver.findElement(By.xpath("//li[@data-value='#favoritesContent']"));
        favoritesTab.click();
        wait(seconds);
        List<WebElement> removeFromFavoritesBtn =driver.findElements(By.xpath("//button[@class='removeSavedFilter icon-close']"));
        removeFromFavoritesBtn.get(0).click();
        wait(seconds);


    }

    public void addToFavoritesFilter(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        favoritesTab = driver.findElement(By.xpath("//li[@data-value='#favoritesContent']"));
        favoritesTab.click();
        wait(seconds);
        filterField = driver.findElement(By.id("forFilterName"));
        filterField.sendKeys("test2");
        wait(seconds);
        useByDefaultCheckbox = driver.findElement(By.xpath("//div[@class='useByDefault']/input[@id='defaultFilter']"));
        useByDefaultCheckbox.click();
        wait(seconds);
        saveButton = driver.findElement(By.id("saveFilterButton"));
        saveButton.click();
        wait(seconds);



    }
    public void removeFilterValueFilter(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        List<WebElement> removeFilterValuesBtn = driver.findElements(By.xpath("//span[@class='removeValues']"));
        removeFilterValuesBtn.get(0).click();
        wait(seconds);


    }
}
