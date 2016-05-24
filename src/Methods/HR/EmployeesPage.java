package Methods.HR;


import Methods.MyProfile.LoginPage;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class EmployeesPage extends Settings {
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
    private WebDriver driver = getDriver();

    public EmployeesPage()
    {
        super();
    }


    public void createEmployee(String _firstName, String _lastName) throws InterruptedException {
        wait(1000);
        createBtn  = getDriver().findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(2000);
        firstName = getDriver().findElement(By.id("first"));
        firstName.sendKeys(_firstName);
        wait(1000);
        lastName = getDriver().findElement(By.id("last"));
        lastName.sendKeys(_lastName);
        wait(1000);
        birthday=getDriver().findElement(By.id("dateBirth"));
        birthday.click();
        wait(1000);
        getDriver().findElement(By.linkText("Prev")).click();
        wait(1000);
        choose_birthday=getDriver().findElement(By.linkText("13"));
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
        driver.findElement(By.id("564dac3e9b85f8b16b574fea")).click();
        wait(1000);
        driver.findElement(By.id("jobTypeDd")).click();
        wait(1000);
        driver.findElement(By.id("fullTime")).click();
        wait(1000);
        createAppBtn  = getDriver().findElement(By.id("createBtnDialog"));
        createAppBtn.click();

    }

    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath("listBtn"));
        listBtn.click();
    }
    public void viewEmployeeDetails() throws IOException, InterruptedException {
        driver.findElement(By.xpath(".//*[@id='listTable']/tr[1]/td[3]")).click();

    }
    public void removeEmployee() throws InterruptedException {
        deleteBtn = getDriver().findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[3]"));
        deleteBtn.click();

    }
    public void CheckAll(){
        getDriver().findElement(By.id("check_all")).click();

    }
    public void cancel(){
        getDriver().findElement(By.xpath(".//*[@id='dialogContainer']/div[2]/div[3]/div/button[2]")).click();

    }

    public void switchOnFired() throws InterruptedException {
        driver.findElement(By.cssSelector(".arrow")).click();
        wait(2000);
        driver.findElement(By.className("newSelectList")).findElement(By.xpath("./li[2]")).click();
        wait(2000);


    }
    public void EmployeesFilter() throws InterruptedException, IOException {
        getDriver().findElement(By.id("listBtn")).click();
        wait(5000);
        getDriver().findElement(By.linkText("A")).click();
        wait(5000);
        getDriver().findElement(By.linkText("G")).click();

    }


}
