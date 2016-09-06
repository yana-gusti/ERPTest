package Methods.HR;


import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationsPage extends BaseTest {
    public WebElement createBtn;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement createAppBtn;
    public WebElement logOut;
    public WebElement listBtn;
    public WebElement choose_one;




    public void createApplication( String _firstName, String _lastName, RemoteWebDriver driver) throws InterruptedException {
        createBtn  = driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        firstName = driver.findElement(By.id("first"));
        firstName.sendKeys(_firstName);
        lastName = driver.findElement(By.id("last"));
        lastName.sendKeys(_lastName);
        wait(seconds);
        driver.findElement(By.id("dateBirth")).click();
        wait(seconds);
        driver.findElement(By.linkText("Prev")).click();
        wait(seconds);
        WebElement choose_birthday=driver.findElement(By.linkText("13"));
        choose_birthday.click();
        wait(seconds);
        driver.findElement(By.linkText("Personal Information")).click();
        wait(seconds);
        driver.findElement(By.id("genderDd")).click();
        wait(seconds);
        driver.findElement(By.id("female")).click();
        wait(seconds);
        driver.findElement(By.id("maritalDd")).click();
        wait(seconds);
        driver.findElement(By.id("married")).click();
        wait(seconds);
        createAppBtn  = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        createAppBtn.click();
    }

    public void SwitchOnList(RemoteWebDriver driver) throws InterruptedException {
        listBtn = driver.findElement(By.id("listBtn"));
        listBtn.click();
    }
    public void viewAppDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[6]"));
        choose_one.click();
    }
    public void removeApp(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[1]/input")).click();
        driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();

    }
    public void cancel(RemoteWebDriver driver){
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

    }


    public void cancelInDetails(RemoteWebDriver driver){
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

    }


}
