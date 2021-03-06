package Methods.HR;


import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Дом on 27.03.14.
 */
public class BirthdaysPage extends BaseTest {
    public WebElement CreatedPerson;
    public WebElement GetPersonalInfo;


    public void CheckBirthdays() throws InterruptedException {
        CreatedPerson=getDriver().findElement(By.cssSelector(".top>a"));
        CreatedPerson.click();
        wait(seconds);
        GetPersonalInfo=getDriver().findElement(By.linkText("Personal Information"));
        GetPersonalInfo.click();
        wait(seconds);
    }
}
