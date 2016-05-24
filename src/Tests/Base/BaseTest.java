package Tests.Base;

import Methods.MyProfile.MoveThroughMenu;
import data.Settings;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 25.12.13
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public class BaseTest extends Settings {
    public  String baseUrl = "http://testdemo.easyerp.com";

    //ThreadLocal will keep local copy of driver
    public  RemoteWebDriver driver = getDriver();
    public ArrayList<String> tabMenuItems = new ArrayList<String>();

@BeforeTest
//Parameter will get browser from testng.xml on which browser test to run
@Parameters("myBrowser")
public void beforeClass(String myBrowser) throws MalformedURLException {

    if(myBrowser.equals("chrome")){
        DesiredCapabilities capability = new DesiredCapabilities().chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
    }
    else if(myBrowser.equals("firefox")){
        DesiredCapabilities capability = new DesiredCapabilities().firefox();
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
    }
        else if(myBrowser.equals("internet explorer")){
            DesiredCapabilities capability = new DesiredCapabilities().internetExplorer();
            capability.setBrowserName("internet explorer");
            capability.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        }

    //setting webdriver
        setDriver(driver);
    driver.get(baseUrl);
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
    public void after() {
        driver.close();
    }

    public void executeTest() throws InterruptedException, IOException {

        wait(3000);
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

}