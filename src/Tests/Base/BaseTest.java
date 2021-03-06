package Tests.Base;

import Methods.MyProfile.LoginPage;
import Methods.MyProfile.MoveThroughMenu;
import Methods.Sales.PersonsPage;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 25.12.13
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public class BaseTest {
    public static String baseUrl = "http://testdemo.easyerp.com/";
    public static Integer seconds = 5000;

    //ThreadLocal will keep local copy of driver
    public RemoteWebDriver driver;
    public ArrayList<String> tabMenuItems = new ArrayList<String>();

@BeforeTest
//Parameter will get browser from testng.xml on which browser test to run
@Parameters("myBrowser")
public  void beforeClass(String myBrowser) throws MalformedURLException {
    DesiredCapabilities capability = null;
    switch (myBrowser){
        case "chrome":
            capability = new DesiredCapabilities().chrome();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
            driver.get(baseUrl);
            break;
        case "firefox":
            capability = new DesiredCapabilities().firefox();
            capability.setBrowserName("firefox");
            capability.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
            driver.get(baseUrl);
            break;
        case "internet explorer":
            capability = new DesiredCapabilities().internetExplorer();
            capability.setBrowserName("internet explorer");
            capability.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
            driver.get(baseUrl);
        default:
            break;
    }
//    capability.setPlatform(Platform.WINDOWS);
//    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//    driver.get(baseUrl);
    if(myBrowser.equals("chrome")){
        driver.manage().window().maximize();
    }
    else if(myBrowser.equals("firefox")){
        driver.manage().window().maximize();
    }
    else if(myBrowser.equals("internet explorer")){
       System.out.print("ie");
    }

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


    @AfterTest(groups = { "good", "bad" })
    public void after() throws InterruptedException, IOException {
//        wait(seconds);
//            logOut(driver);
            driver.quit();
    }
    public void logOut(RemoteWebDriver driver) throws InterruptedException, IOException
    {
//        driver.findElement(By.xpath(".//*[@id='submenu-holder']/div[2]")).click();
//        wait(seconds);
        driver.findElement(By.id("userName")).click();
        wait(seconds);
        driver.findElement(By.linkText("Logout")).click();
    }

    public void executeTest() throws InterruptedException, IOException {
        GoToPersonsPage();
        wait(seconds);
        MoveThroughMenu moveThroughMenu = new MoveThroughMenu();
        moveThroughMenu.MoveThroughMenu(driver, tabMenuItems);
        tabMenuItems.clear();
    }

    //    @BeforeMethod(groups = { "good", "bad" })
//    public void openBrowser() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver",  getChromeDriverPath());
//        setDriver(new ChromeDriver());
//        getDriver().manage().window().maximize();
//    }
    public  RemoteWebDriver getDriver() {
        return driver;
    }

    public void setDriver(RemoteWebDriver _driver) {
        driver = _driver;
    }

    public PersonsPage GoToPersonsPage()throws InterruptedException, IOException {

        wait(seconds);
//        personsPage = new PersonsPage();

        LoginPage loginPage = new LoginPage();
        PersonsPage personsPage = loginPage.loginPositive(driver);
//        PersonsPage personsPage = LoginLiveTest();
        return personsPage;
    }

    public PersonsPage LoginLiveTest() throws InterruptedException {
        driver.findElement(By.linkText("LOG IN")).click();
        wait(seconds);
        driver.findElement(By.id("email_i")).clear();
        driver.findElement(By.id("email_i")).sendKeys("yana.gusti@gmail.com");
        wait(seconds);
        driver.findElement(By.id("password_i")).clear();
        driver.findElement(By.id("password_i")).sendKeys("1q2w3e4r");
        wait(seconds);
        driver.findElement(By.id("login")).click();
        wait(seconds);
        driver.findElement(By.linkText("Persons")).click();
        return new PersonsPage();

    }


    public static void wait(int milliSeconds) throws InterruptedException
    {
        Thread.sleep(milliSeconds);
    }
    public void alertAcept(RemoteWebDriver driver){
        driver.switchTo().alert().accept();

    }
    public void alertAccept() throws InterruptedException {
        wait(1000);
        driver.switchTo().alert().accept();

    }

    public void waitForProgressBar(WebDriver driver, String text) throws InterruptedException {
        WebDriverWait webDriverWait = new WebDriverWait(driver, WebDriverWait.DEFAULT_SLEEP_TIMEOUT);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='loading']")));
        wait(seconds);
        try {
            Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='top-bar']/h3")).getText(), text);
        }catch (Exception e){
            System.out.print(e);
        }

//        webDriverWait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='top-bar']/h3"), text));


    }
    public void attachFileToLead(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);

        WebElement El = driver.findElement(By.id("inputAttach"));
        ((RemoteWebElement) El ).setFileDetector(new LocalFileDetector());
        El.sendKeys("/Users/vitaliybizilia/Desktop/test.png");
        wait(seconds);

    }
    public void removeAttachFileToLead(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        ((JavascriptExecutor)driver).executeScript("document.getElementsByClassName('deleteAttach')[0].click();");
        wait(seconds);


    }

    public void changePageShowedOnPagination(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        wait(10000);
        WebElement selectArrow = driver.findElement(By.xpath("//button[@class='currentPageList icon-arrow-up2']"));
        selectArrow.click();
        wait(10000);
        WebElement chooseItem = driver.findElement(By.xpath("//li[text()='3']"));
        chooseItem.click();
    }

    public void changeItemsQuantityShowedOnPage(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        WebElement changeQuantityCounter = driver.findElement(By.xpath("//a[@class='itemsNumber' and text()='200']"));
        changeQuantityCounter.click();
        wait(seconds);
    }

    public void nextPreviousPageTesting(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        WebElement nextPageItem = driver.findElement(By.id("nextPage"));
        nextPageItem.click();
        wait(seconds);
        WebElement previousPageItem = driver.findElement(By.id("previousPage"));
        previousPageItem.click();
        wait(seconds);
        WebElement lastShowedPageItem = driver.findElement(By.id("lastShowPage"));
        lastShowedPageItem.click();
        wait(seconds);
        WebElement firstShowPageItem = driver.findElement(By.id("firstShowPage"));
        firstShowPageItem.click();
        wait(seconds);

    }
}