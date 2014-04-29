package Methods.Settings;

import Methods.LoginPage;
import Methods.PageBase;
import org.openqa.selenium.By;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 24.03.14
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public class UserPage  extends PageBase {
    Integer  seconds = 1000;

    @Override
    protected void Init() {

    }
    public UserPage() throws IOException
    {
        super();
    }
    public void CreateNewUser(String userName) throws InterruptedException {
        wait(seconds);
        getDriver().findElement(By.id("top-bar-createBtn")).click();
        wait(seconds);
        getDriver().findElement(By.id("login")).sendKeys(userName);
        getDriver().findElement(By.id("password")).sendKeys("123456");
        getDriver().findElement(By.id("confirmpassword")).sendKeys("123456");
        getDriver().findElement(By.xpath("(//button[@type='button'])[6]")).click();


    }
    public void EditUser() throws InterruptedException {
        getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[8]/td[3]")).click();
        wait(seconds);
        getDriver().findElement(By.id("top-bar-editBtn")).click();
        getDriver().findElement(By.xpath(".//*[@id='login']")).sendKeys("qwerty");
        getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[1]")).click();
    }
    public void DeleteUser() throws InterruptedException {

        getDriver().findElement(By.xpath(".//*[@id='listTable']/tr[8]/td[1]/input")).click();
        getDriver().findElement(By.id("top-bar-deleteBtn")).click();


    }
    public LoginPage LogOut() throws InterruptedException, IOException {

        getDriver().findElement(By.id("userName")).click();
        wait(seconds);
        getDriver().findElement(By.linkText("Logout")).click();
        wait(1000);
        return new LoginPage();


    }
    public void Cancel(){
        getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]")).click();
    }
}
