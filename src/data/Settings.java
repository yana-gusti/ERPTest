package data;

import Methods.MyProfile.LoginPage;
import Methods.Sales.PersonsPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 25.12.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class Settings {

    private static RemoteWebDriver driver = getDriver();
    private DataStorage dataStorage;
    private static final String RESOURCES_PATH = "src/properties/${NAME}.properties";
    private boolean acceptNextAlert = true;


    public Settings() {
        this.setDataStorage(DataStorage.getInstance());
        try {
            initProperties("Settings");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static RemoteWebDriver getDriver() {
        return driver;
    }

    public static void setDriver(RemoteWebDriver driver) {
        Settings.driver = driver;
    }

    public String getBaseUrl() {
        return DataStorage.getProperty("Settings").getProperty("url.base");
    }

    public String getChromeDriverPath() {
        return DataStorage.getProperty("Settings").getProperty("path.chromedriver");
    }

    public String getIEDriverPath() {
        return DataStorage.getProperty("Settings").getProperty("path.iedriver");
    }

    /*public static void setBaseUrl(String baseUrl) {
        Settings.baseUrl = baseUrl;
    } */


    public void initProperties() throws FileNotFoundException, IOException
    {
        initProperties(getClass().getSimpleName());
    }

    public void initProperties(String propertiesFileName) {
        String workingDir = System.getProperty("user.dir");
        if (!DataStorage.exists(propertiesFileName))  {
            Properties properties = new Properties();
            File propertiesFile = new File(workingDir+"\\properties\\"+propertiesFileName+".properties");

            try {
                properties.load(new FileReader(propertiesFile));
                DataStorage.setProperty(propertiesFileName, properties);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public final String getProperty(String key) {
        return DataStorage.getProperty(getClass().getSimpleName()).getProperty(key);
    }

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public DataStorage getDataStorage() {
        return dataStorage;
    }

    public String getResourcesPath(String name) {
        return RESOURCES_PATH.replaceAll("\\$\\{NAME\\}",name);
    }


    public PersonsPage GoToPersonsPage()throws InterruptedException, IOException {

        wait(3000);
        LoginPage loginPage = new LoginPage();
        PersonsPage personsPage = loginPage.loginPositive();
        return personsPage;
    }
    public void driverClose()
    {
        driver.close();
    }

    public static void wait(int milliSeconds) throws InterruptedException
    {
        Thread.sleep(milliSeconds);
    }
    public void alertAcept(){
    driver.switchTo().alert().accept();

}
    public boolean isElementPresent(By by) {
        try {
            getDriver().findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {

            Alert alert = getDriver().switchTo().alert();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alert.getText();

        }
    public void waitForProgressBar(WebDriver driver, String text) throws InterruptedException {
        WebDriverWait webDriverWait = new WebDriverWait(driver, WebDriverWait.DEFAULT_SLEEP_TIMEOUT);
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='loading']")));
        wait(5000);
        try {
            Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='top-bar']/h3")).getText(), text);
        }catch (Exception e){
            System.out.print(e);
        }

//        webDriverWait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='top-bar']/h3"), text));


    }
    }


