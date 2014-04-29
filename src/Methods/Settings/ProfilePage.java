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
public class ProfilePage extends PageBase {
    public WebElement createBtn;
    public WebElement profileName;
    public WebElement saveBtn;
    public WebElement profileLink;
    public WebElement userName;
    public WebElement Logout;
    public WebElement deleteBtn;
    public WebElement editBtn;
    Integer seconds =1000;

    @Override
    protected void Init() {}
    public ProfilePage() {
        super();
    }

    public void CreateNewProfile(String _profileName) throws InterruptedException {
        createBtn = getDriver().findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        profileName=getDriver().findElement(By.xpath(".//*[@id='profileName']"));
        profileName.sendKeys(_profileName);
        saveBtn=getDriver().findElement(By.id("saveBtn"));
        saveBtn.click();
    }
    public void EditProfile() throws InterruptedException {
        profileLink=getDriver().findElement(By.linkText("TestUser1 Profile"));
        profileLink.click();
        editBtn=getDriver().findElement(By.id("top-bar-editBtn"));
        editBtn.click();
        profileName=getDriver().findElement(By.cssSelector("input.editProfileName"));
        profileName.sendKeys("TestUser2");
        saveBtn=getDriver().findElement(By.id("top-bar-saveBtn"));
        saveBtn.click();
    }
    public void DeleteProfile() throws InterruptedException {
        profileLink= getDriver().findElement(By.linkText("TestUser1 Profile"));
        profileLink.click();
        wait(seconds);
        deleteBtn=getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();
    }

    public LoginPage Logout() throws InterruptedException, IOException {
        userName=getDriver().findElement(By.id("userName"));
        userName.click();
        wait(seconds);
        Logout=getDriver().findElement(By.linkText("Logout"));
        Logout.click();
        wait(1000);
        return new LoginPage();
    }
    public void Cancel(){
        getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]")).click();
    }


}
