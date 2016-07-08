package Methods.MyProfile;

import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by ��������� on 03.08.2015.
 */
public class MyProfilePage extends BaseTest {
    RemoteWebDriver driver = getDriver();
    WebElement changePassBtn;
    WebElement oldPass;
    WebElement newPass;
    WebElement confPass;
    WebElement saveBtn;


    public MyProfilePage(){
        super();
    }
    public void changePass (String pass, String passNew) throws InterruptedException {

        changePassBtn = driver.findElement(By.cssSelector("input.changePassword"));
        changePassBtn.click();
        oldPass=driver.findElement(By.id("old_password"));
        oldPass.clear();
        oldPass.sendKeys(pass);
        newPass=driver.findElement(By.id("new_password"));
        newPass.clear();
        newPass.sendKeys(passNew);
        confPass = driver.findElement(By.id("confirm_new_password"));
        confPass.clear();
        confPass.sendKeys(passNew);
        saveBtn = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        saveBtn.click();
    }

}
