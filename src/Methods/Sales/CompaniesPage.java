package Methods.Sales;

import Methods.LoginPage;
import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created by puzzlefacePC on 02.01.14.
 */
public class CompaniesPage extends PageBase {

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

    public void Init() {

        userName  = getDriver().findElement(By.id(getProperty("userName.id")));

    }

    public void createCorrectCompany(String _companyName) throws InterruptedException {

        createBtn  = getDriver().findElement(By.xpath(getProperty("createBtn.xpath")));
        createBtn.click();
        wait(1000);
        companyName = getDriver().findElement(By.xpath(getProperty("companyName.xpath")));
        companyName.click();
        companyName.sendKeys(_companyName);
        createCompanyBtn  = getDriver().findElement(By.xpath(getProperty("createCompanyBtn.xpath")));
        createCompanyBtn.click();

    }

    public LoginPage logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        logOut = getDriver().findElement(By.linkText(getProperty("logout.link")));
        logOut.click();
        wait(1000);
        return new LoginPage();
    }

    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath(getProperty("listBtn.xpath")));
        listBtn.click();

    }

    public void viewCompanyDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(getProperty("choose_one.xpath")));
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
        cancelBtn = getDriver().findElement(By.xpath(getProperty("cancelBtn.xpath")));
        cancelBtn.click();
    }
}

