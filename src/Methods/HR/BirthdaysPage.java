package Methods.HR;


import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Дом on 27.03.14.
 */
public class BirthdaysPage extends Settings {
    public WebElement CreatedPerson;
    public WebElement GetPersonalInfo;

    public BirthdaysPage(){
        super();
    }

    public void CheckBirthdays() throws InterruptedException {
        CreatedPerson=getDriver().findElement(By.cssSelector(".top>a"));
        CreatedPerson.click();
        wait(2000);
        GetPersonalInfo=getDriver().findElement(By.linkText("Personal Information"));
        GetPersonalInfo.click();
        wait(2000);
    }
}
