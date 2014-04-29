package Methods.Settings;

import Methods.LoginPage;
import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 24.03.14
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public class GroupPage extends PageBase {
    public WebElement plusbutton;
    public WebElement departname;
    public WebElement savebtn;
    public WebElement cancel;
    public WebElement OpenGroup;
    Integer seconds =1000;
    @Override
    protected void Init() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
    public GroupPage(){
        super();
    }
    public void CreateGroup(String name) throws InterruptedException {
    plusbutton = getDriver().findElement(By.id(getProperty("plusbutton.id")));
    plusbutton.click();
    departname = getDriver().findElement(By.id(getProperty("departmentname.id")));
    departname.clear();
    departname.sendKeys(name);
    savebtn = getDriver().findElement(By.xpath(getProperty("save.xpath")));
    savebtn.click();
}
    public void CancelButton(){
        cancel = getDriver().findElement(By.xpath(getProperty("cancel.xpath")));
        cancel.click();
    }

    public void OpenCreatedGroup() throws InterruptedException {
        OpenGroup=getDriver().findElement(By.cssSelector(getProperty("group.css")));
        OpenGroup.click();
        wait(seconds);
        savebtn = getDriver().findElement(By.xpath(getProperty("save.xpath")));
        savebtn.click();
    }
    public void DeleteGroup() throws InterruptedException {
    getDriver().findElement(By.xpath(".//*[@id='groupList']/li[1]/span")).click();
        wait(seconds);
    getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[3]")).click();
    }
    public void EditGroup() throws InterruptedException {
        WebElement group=getDriver().findElement(By.xpath(".//*[@id='groupList']/li[1]/span"));
        group.click();
        wait(1000);
        WebElement department=getDriver().findElement(By.xpath(".//*[@id='departmentName']"));
        department.clear();
        department.sendKeys("qwerty");
        wait(1000);
        getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[1]")).click();

    }
    public LoginPage LogOut() throws InterruptedException, IOException {
        getDriver().findElement(By.id(getProperty("username.id"))).click();
        wait(seconds);
        getDriver().findElement(By.linkText(getProperty("logout.linkText"))).click();
        wait(1000);
        return new LoginPage();
    }
}
