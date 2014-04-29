package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by Дом on 27.03.14.
 */
public class MyProfilePage extends PageBase{
    public WebElement Username;
    public WebElement LogOut;
    public WebElement ChangePasswordButton;
    public WebElement OldPasswordField;
    public WebElement NewPasswordField;
    public WebElement ConfirmNewPassword;
    public WebElement SaveButton;
    public WebElement LoginField;
    public WebElement PasswordField;
    public WebElement LogInButton;
    public WebElement MyProfile;
    public WebElement UserNameField;
    public WebElement EmailField;
    Integer seconds = 1000;
    @Override
    protected void Init() {

    }
    public MyProfilePage(){
        super();
    }
    public void SetNewPassword() throws InterruptedException {
        wait(seconds);
        ChangePasswordButton=getDriver().findElement(By.cssSelector(getProperty("changepassbtn.css")));
        ChangePasswordButton.click();
        wait(seconds);
        OldPasswordField=getDriver().findElement(By.id(getProperty("oldpassfield.id")));
        OldPasswordField.clear();
        wait(seconds);
        OldPasswordField.sendKeys(getProperty("oldpassword.name"));
        wait(seconds);
        NewPasswordField=getDriver().findElement(By.id(getProperty("newpassfield.id")));
        NewPasswordField.clear();
        wait(seconds);
        NewPasswordField.sendKeys(getProperty("newPassword.name"));
        ConfirmNewPassword=getDriver().findElement(By.id(getProperty("confirmpassfield.id")));
        ConfirmNewPassword.clear();
        wait(seconds);
        ConfirmNewPassword.sendKeys(getProperty("newPassword.name"));
        wait(seconds);
        SaveButton=getDriver().findElement(By.xpath(getProperty("savebtn.xpath")));
        SaveButton.click();
        wait(seconds);
    }
    public void SetOldPassword() throws InterruptedException {
        wait(seconds);
        ChangePasswordButton=getDriver().findElement(By.cssSelector(getProperty("changepassbtn.css")));
        ChangePasswordButton.click();
        wait(seconds);
        OldPasswordField=getDriver().findElement(By.id(getProperty("oldpassfield.id")));
        OldPasswordField.clear();
        wait(seconds);
        OldPasswordField.sendKeys(getProperty("newPassword.name"));
        wait(seconds);
        NewPasswordField=getDriver().findElement(By.id(getProperty("newpassfield.id")));
        NewPasswordField.clear();
        wait(seconds);
        NewPasswordField.sendKeys(getProperty("oldpassword.name"));
        wait(seconds);
        ConfirmNewPassword=getDriver().findElement(By.id(getProperty("confirmpassfield.id")));
        ConfirmNewPassword.clear();
        wait(seconds);
        ConfirmNewPassword.sendKeys(getProperty("oldpassword.name"));
        wait(seconds);
        SaveButton=getDriver().findElement(By.xpath(getProperty("savebtn.xpath")));
        SaveButton.click();
        wait(seconds);
    }
    public LoginPage LogOut() throws InterruptedException, IOException {
        wait(seconds);
        Username=getDriver().findElement(By.id(getProperty("username.id")));
        Username.click();
        wait(seconds);
        LogOut=getDriver().findElement(By.linkText(getProperty("logout.linkText")));
        LogOut.click();
        wait(seconds);
        return new LoginPage();
    }
    public void LoginWithNewPassword() throws InterruptedException {
        LoginField=getDriver().findElement(By.id(getProperty("loginfield.id")));
        LoginField.clear();
        wait(seconds);
        LoginField.sendKeys(getProperty("userlogin.name"));
        wait(seconds);
        PasswordField=getDriver().findElement(By.id(getProperty("passwordfield.id")));
        PasswordField.clear();
        wait(seconds);
        PasswordField.sendKeys(getProperty("newPassword.name"));
        wait(seconds);
        LogInButton=getDriver().findElement(By.cssSelector(getProperty("loginbtn.css")));
        LogInButton.click();
        wait(seconds);
    }
    public void LoginWithOldPassword() throws InterruptedException {
        wait(seconds);
        LoginField=getDriver().findElement(By.id(getProperty("loginfield.id")));
        LoginField.clear();
        wait(seconds);
        LoginField.sendKeys(getProperty("userlogin.name"));
        wait(seconds);
        PasswordField=getDriver().findElement(By.id(getProperty("passwordfield.id")));
        PasswordField.clear();
        wait(seconds);
        PasswordField.sendKeys(getProperty("oldpassword.name"));
        wait(seconds);
        LogInButton=getDriver().findElement(By.cssSelector(getProperty("loginbtn.css")));
        LogInButton.click();
        wait(seconds);
    }
    public void SwitchToProfile() throws InterruptedException {
        Username=getDriver().findElement(By.id(getProperty("username.id")));
        Username.click();
        wait(seconds);
        MyProfile=getDriver().findElement(By.linkText(getProperty("myprofile.link")));
        MyProfile.click();
        wait(seconds);
    }

    public void SetNewUserName() throws InterruptedException {
        UserNameField=getDriver().findElement(By.id(getProperty("usernamefield.id")));
        UserNameField.click();
        UserNameField.clear();

        wait(seconds);
        UserNameField.sendKeys(getProperty("newuser.name"));
        wait(seconds);
        getDriver().findElement(By.xpath(" .//*[@id='top-bar']")).click();
        wait(seconds);
        SaveButton=getDriver().findElement(By.id(getProperty("savebtn.id")));
        SaveButton.click();
        wait(seconds);
    }
    public void SetOldUserName() throws InterruptedException {
        UserNameField=getDriver().findElement(By.id(getProperty("usernamefield.id")));
        UserNameField.click();
        UserNameField.clear();
        wait(seconds);
        UserNameField.sendKeys(getProperty("olduser.name"));
        wait(seconds);
        SaveButton=getDriver().findElement(By.id(getProperty("savebtn.id")));
        SaveButton.click();
        wait(seconds);
    }
    public void SetNewEmail() throws InterruptedException {
        EmailField=getDriver().findElement(By.id(getProperty("emailfield.id")));
        EmailField.click();
        EmailField.clear();
        wait(seconds);
        EmailField.sendKeys(getProperty("newemail.name"));
        wait(seconds);
        SaveButton=getDriver().findElement(By.id(getProperty("savebtn.id")));
        SaveButton.click();
        wait(seconds);

    }
    public void SetOldEmail() throws InterruptedException {
        EmailField=getDriver().findElement(By.id(getProperty("emailfield.id")));
        EmailField.click();
        EmailField.clear();
        wait(seconds);
        EmailField.sendKeys(getProperty("oldemail.name"));
        wait(seconds);
        SaveButton=getDriver().findElement(By.id(getProperty("savebtn.id")));
        SaveButton.click();
        wait(seconds);

    }
}
