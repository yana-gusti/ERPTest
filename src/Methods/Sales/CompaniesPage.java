package Methods.Sales;

import Methods.MyProfile.LoginPage;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 02.01.14.
 */
public class CompaniesPage extends Settings {

    private WebElement userName;
    private WebElement logOut;
    private WebElement createBtn;
    private WebElement companyName;
    private WebElement createCompanyBtn;
    public WebElement chooseToDelete;
    public WebElement personNameView;
    public WebElement listBtn;
    public WebElement deleteBtn;
    public WebElement cancelBtn;
    public WebElement choose_one;
    public WebElement editCompany;

    public CompaniesPage()
    {
        super();
    }


    public void createCorrectCompany(String _companyName) throws InterruptedException {

        createBtn  = getDriver().findElement(By.xpath(".//*[@id='top-bar-createBtn']"));
        createBtn.click();
        wait(1000);
        companyName = getDriver().findElement(By.xpath("MS"));
        companyName.click();
        companyName.sendKeys(_companyName);
        createCompanyBtn  = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[1]"));
        createCompanyBtn.click();

    }



    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath(".//*[@id='listBtn']"));
        listBtn.click();

    }

    public void viewCompanyDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(".//*[@id='listTable']/tr/td[3]"));
        choose_one.click();

    }
    public void editCompany(){
        editCompany = getDriver().findElement(By.xpath(".//*[@id='top-bar-editBtn']"));
        editCompany.click();
        getDriver().findElement(By.name("website")).clear();
        getDriver().findElement(By.name("website")).sendKeys("www.ua.com");
        getDriver().findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }

    public void removeCompany() throws InterruptedException, IOException {

        deleteBtn = getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();
    }
    public void cancel() throws InterruptedException {
        cancelBtn = getDriver().findElement(By.xpath("html/body/div[3]/div[3]/div/button[2]"));
        cancelBtn.click();
    }
}

