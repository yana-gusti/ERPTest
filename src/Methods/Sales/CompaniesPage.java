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
 * Created by puzzlefacePC on 02.01.14.
 */
public class CompaniesPage extends BaseTest {

    private WebElement userName;
    private WebElement logOut;
    private WebElement createBtn;
    private WebElement companyName;
    private WebElement createCompanyBtn;
    private WebElement filterByCountryBtn;
    private WebElement choosedCountry;
    public WebElement chooseToDelete;
    public WebElement personNameView;
    public WebElement listBtn;
    public WebElement deleteBtn;
    public WebElement cancelBtn;
    public WebElement choose_one;
    public WebElement editCompany;
    public WebElement selectChb;
    public WebElement filterBtn;
    public WebElement filterByNameBtn;
    public WebElement choosedName;
    private WebElement filterByServicesBtn;
    private WebElement choosedService;
    private WebElement searchInput;
    private WebElement filterField;
    private WebElement favoritesTab;
    private WebElement saveButton;
    private WebElement useByDefaultCheckbox;



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

    public void openFilterMenu(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterBtn = driver.findElement(By.xpath(".//*[@id='searchContainer']/div/div[1]/span[2]"));
        filterBtn.click();

    }
    public void filterByName(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterByNameBtn = driver.findElement(By.id("name"));
        filterByNameBtn.click();
        wait(seconds);
        choosedName = driver.findElement(By.xpath(".//*[@id='nameUl']/li[1]"));
        choosedName.click();
        wait(seconds);

    }
    public void filterByCountry(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterByCountryBtn = driver.findElement(By.id("country"));
        filterByCountryBtn.click();
        wait(seconds);
        choosedCountry = driver.findElement(By.xpath(".//*[@id='countryUl']/li[2]"));
        choosedCountry.click();
        wait(seconds);

    }
    public void filterByServices(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        filterByServicesBtn = driver.findElement(By.id("services"));
        filterByServicesBtn.click();
        wait(seconds);
        choosedService = driver.findElement(By.xpath(".//*[@id='servicesUl']/li[1]"));
        choosedService.click();
        wait(seconds);

    }
    public void SwitchOnList(RemoteWebDriver driver) throws InterruptedException {
        listBtn = driver.findElement(By.xpath(".//*[@id='listBtn']"));
        listBtn.click();

    }

    public void viewCompanyDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]"));
        choose_one.click();

    }
    public void editCompany(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//input[@data-id='website']")).clear();
        driver.findElement(By.xpath("//input[@data-id='website']")).sendKeys("www.ua.com");
        wait(seconds);
        driver.findElement(By.id("saveBtn")).click();

    }


    public void removeCompany(RemoteWebDriver driver) throws InterruptedException, IOException {


        driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();
    }
    public void cancel(RemoteWebDriver driver) throws InterruptedException {
        cancelBtn = driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]"));
        cancelBtn.click();
    }
    public void selectCompany(RemoteWebDriver driver) throws InterruptedException {
        selectChb = driver.findElement(By.xpath(".//tr[1]/td[1]/label/input[@class = 'checkbox'][1]"));
        selectChb.click();
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
    public void UseByDefaultFilter(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        useByDefaultCheckbox = driver.findElement(By.id("defaultFilter"));
        useByDefaultCheckbox.click();

    }
}

