package Methods.HR;


import Methods.MyProfile.LoginPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class EmployeesPage extends BaseTest {
    public WebElement userName;
    public WebElement createBtn;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement department;
    public WebElement createAppBtn;
    public WebElement logOut;
    public WebElement listBtn;
    public WebElement choose_one;
    public WebElement deleteBtn;
    public WebElement createFired;
    public WebElement birthday;
    public WebElement choose_birthday;




    public void createEmployee(String _firstName, String _lastName, RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.id("top-bar-createBtn")).click();

        wait(seconds);
        driver.findElement(By.id("first")).clear();
        driver.findElement(By.id("first")).sendKeys(_firstName);

        driver.findElement(By.id("last")).clear();
        driver.findElement(By.id("last")).sendKeys(_lastName);
        wait(seconds);
        birthday=driver.findElement(By.id("dateBirth"));
        birthday.click();
        wait(seconds);
        driver.findElement(By.linkText("Prev")).click();
        wait(seconds);
        choose_birthday=driver.findElement(By.linkText("13"));
        choose_birthday.click();
        wait(seconds);
//        driver.findElement(By.xpath(".//*[@id='jobPositionDd']")).click();
//        wait(1000);
//        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li[2]")).click();
//        wait(1000);
        driver.findElement(By.linkText("Job")).click();
        driver.findElement(By.id("jobPositionDd")).click();
        driver.findElement(By.xpath(".//*[@id='content']/ul/li")).click();
        driver.findElement(By.id("projectManagerDD")).click();
        driver.findElement(By.xpath(".//*[@id='content']/ul/li")).click();
        driver.findElement(By.id("jobTypeDd")).click();
        driver.findElement(By.id("fullTime")).click();
        wait(seconds);
        driver.findElement(By.xpath("//table[@id='hireFireTable']/tbody/tr/td[11]")).click();
        driver.findElement(By.cssSelector("input.editing.statusInfo")).click();
        driver.findElement(By.cssSelector("input.editing.statusInfo")).clear();
        driver.findElement(By.cssSelector("input.editing.statusInfo")).sendKeys("200");

        wait(seconds);
        createAppBtn  = driver.findElement(By.id("createBtnDialog"));
        createAppBtn.click();

    }

    public void SwitchOnList(RemoteWebDriver driver) throws InterruptedException {
        listBtn = driver.findElement(By.id("listBtn"));
        listBtn.click();
    }
    public void viewEmployeeDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).click();

    }
    public void removeEmployee(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[1]/input")).click();
        driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();

    }
    public void CheckAll(RemoteWebDriver driver){
        driver.findElement(By.id("check_all")).click();

    }
    public void cancel(RemoteWebDriver driver){
        driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }

    public void switchOnFired(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.cssSelector(".arrow")).click();

        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li[2]")).click();



    }
    public void EmployeesFilter(RemoteWebDriver driver) throws InterruptedException, IOException {
        driver.findElement(By.id("listBtn")).click();
        wait(seconds);
        driver.findElement(By.linkText("I")).click();
        wait(seconds);
        driver.findElement(By.linkText("G")).click();

    }


}
