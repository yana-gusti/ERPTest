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

    public EmployeesPage()
    {
        super();
    }


    public void createEmployee(String _firstName, String _lastName, RemoteWebDriver driver) throws InterruptedException {
        wait(3000);
        createBtn  = driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(3000);
        firstName = driver.findElement(By.id("first"));
        firstName.sendKeys(_firstName);
        wait(1000);
        lastName = driver.findElement(By.id("last"));
        lastName.sendKeys(_lastName);
        wait(5000);
        birthday=driver.findElement(By.id("dateBirth"));
        birthday.click();
        wait(1000);
        driver.findElement(By.linkText("Prev")).click();
        wait(1000);
        choose_birthday=driver.findElement(By.linkText("13"));
        choose_birthday.click();
        wait(1000);
//        driver.findElement(By.xpath(".//*[@id='jobPositionDd']")).click();
//        wait(1000);
//        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li[2]")).click();
//        wait(1000);
        driver.findElement(By.linkText("Job")).click();
        wait(1000);
        driver.findElement(By.id("jobPositionDd")).click();
        wait(1000);
        driver.findElement(By.id("56e6b8b9701f50ac4d0a4974")).click();
        wait(1000);
        driver.findElement(By.id("departmentsDd")).click();
        wait(1000);
        driver.findElement(By.id("55b92ace21e4b7c40f000012")).click();
        wait(1000);
        driver.findElement(By.id("projectManagerDD")).click();
        wait(1000);
        driver.findElement(By.id("55b92ad221e4b7c40f000062")).click();
        wait(1000);
        driver.findElement(By.id("jobTypeDd")).click();
        wait(1000);
        driver.findElement(By.id("fullTime")).click();
        wait(1000);
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
        deleteBtn = driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]"));
        deleteBtn.click();

    }
    public void CheckAll(RemoteWebDriver driver){
        driver.findElement(By.id("check_all")).click();

    }
    public void cancel(RemoteWebDriver driver){
        driver.findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }

    public void switchOnFired(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.cssSelector(".arrow")).click();
        wait(2000);
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li[2]")).click();
        wait(2000);


    }
    public void EmployeesFilter(RemoteWebDriver driver) throws InterruptedException, IOException {
        driver.findElement(By.id("listBtn")).click();
        wait(5000);
        driver.findElement(By.linkText("A")).click();
        wait(5000);
        driver.findElement(By.linkText("G")).click();

    }


}
