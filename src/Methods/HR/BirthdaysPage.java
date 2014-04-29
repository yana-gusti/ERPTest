package Methods.HR;

import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Дом on 27.03.14.
 */
public class BirthdaysPage extends PageBase{
    public WebElement CreatedPerson;
    public WebElement GetPersonalInfo;
    @Override
    protected void Init() {

    }
    public BirthdaysPage(){
        super();
    }

    public void CheckBirthdays() throws InterruptedException {
        CreatedPerson=getDriver().findElement(By.cssSelector(getProperty("readmorelink.css")));
        CreatedPerson.click();
        wait(2000);
        GetPersonalInfo=getDriver().findElement(By.linkText(getProperty("personalinfo.linkText")));
        GetPersonalInfo.click();
        wait(2000);
    }
}
