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

    public static RemoteWebDriver driver = getDriver();

    public static RemoteWebDriver getDriver() {
        return driver;
    }

    public void setDriver(RemoteWebDriver _driver) {
        driver = _driver;
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
    getDriver().switchTo().alert().accept();

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


