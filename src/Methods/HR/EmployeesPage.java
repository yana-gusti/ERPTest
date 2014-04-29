package Methods.HR;

import Methods.LoginPage;
import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 12.02.14
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class EmployeesPage extends PageBase {
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

    public void Init() {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
    }

    public void createEmployee(String _firstName, String _lastName) throws InterruptedException {
        wait(1000);
        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        wait(1000);
        firstName = getDriver().findElement(By.id(getProperty("firstName.id")));
        firstName.sendKeys(_firstName);
        wait(1000);
        lastName = getDriver().findElement(By.id(getProperty("lastName.id")));
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
        createAppBtn  = getDriver().findElement(By.id("createBtnDialog"));
        createAppBtn.click();

    }
    public LoginPage logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        getDriver().findElement(By.linkText("Logout")).click();
        return new LoginPage();
    }
    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath(getProperty("listBtn.xpath")));
        listBtn.click();
    }
    public void viewEmployeeDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(getProperty("ChooseOne.xpath")));
        choose_one.click();
    }
    public void removeEmployee() throws InterruptedException {
        deleteBtn = getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();

    }
    public void CheckAll(){
        getDriver().findElement(By.id("check_all")).click();

    }
    public void cancel(){
        getDriver().findElement(By.xpath("(//button[@type='button'])[3]")).click();

    }

    public ApplicationsPage switchOnFired() throws InterruptedException {
        getDriver().findElement(By.cssSelector("span.endContractReasonList")).click();
        wait(2000);
        getDriver().findElement(By.xpath("//form[@id='editEmployeeForm']/fieldset/div/ul/li[4]/ul/li[2]")).click();
        wait(2000);


        return new ApplicationsPage();

    }
    public void EmployeesFilter() throws InterruptedException, IOException {
        getDriver().findElement(By.id("listBtn")).click();
        wait(2000);
        getDriver().findElement(By.linkText("A")).click();
        wait(2000);
        getDriver().findElement(By.linkText("G")).click();

    }


}
