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
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class JobPositionsPage extends PageBase {
    public WebElement userName;
    public WebElement createBtn;
    public WebElement jobName;
    public WebElement createAppBtn;
    public WebElement logOut;
    public WebElement listBtn;
    public WebElement choose_one;
    public WebElement deleteBtn;
    public WebElement createFired;
    public WebElement editJob;
    public WebElement department;

    public JobPositionsPage()
    {
        super();
    }

    public void Init() {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
    }

    public void createJobPosition(String _jobName)
    {
        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        jobName = getDriver().findElement(By.id(getProperty("jobName.id")));
        jobName.sendKeys(_jobName);
        createAppBtn  = getDriver().findElement(By.xpath(getProperty("createJob.xpath")));
        createAppBtn.click();
    }
    public LoginPage logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        getDriver().findElement(By.linkText("Logout")).click();
        wait(1000);
        return new LoginPage();
    }

    public void viewJobDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(getProperty("ChooseOne.xpath")));
        choose_one.click();

    }
    public void removeJobPosition() throws InterruptedException {
        getDriver().findElement(By.id("check_all")).click();
        getDriver().findElement(By.id("top-bar-deleteBtn")).click();


    }
    public void cancel(){
        getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]")).click();

    }

    public void editJobPosition() throws InterruptedException {
        editJob = getDriver().findElement(By.xpath(getProperty("editJob.xpath")));
        editJob.click();
        jobName = getDriver().findElement(By.id(getProperty("jobName.id")));
        jobName.click();
        getDriver().findElement(By.id("departmentDd")).click();
        getDriver().findElement(By.id("52b552de201b2d3813000008")).click();
        getDriver().findElement(By.xpath("(//button[@type='button'])[6]")).click();

    }


}
