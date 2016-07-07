package Methods.Sales;

import Methods.Accounting.CustomerPaymentsPage;
import Methods.HR.ApplicationsPage;
import Methods.HR.BirthdaysPage;
import Methods.HR.EmployeesPage;
import Methods.HR.JobPositionsPage;
import Methods.MyProfile.MyProfilePage;
import Methods.Project.ProjectPage;
import Methods.Project.TasksPage;
import Methods.Project.WTrackPage;
import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created by ��������� on 03.08.2015.
 */
public class PersonsPage extends BaseTest {
    private WebElement userName;
    private WebElement logOut;
    private WebElement myProfile;
    private WebElement companyLink;
    private WebElement leadLink;
    private WebElement HR;
    private WebElement applicationLink;
    private WebElement jobPositionLink;
    private WebElement BirthdayPageOpen;
    private WebElement CurrentPerson;
    private WebElement NoteArea;
    private WebElement AddTittleLink;
    private WebElement NoteTitleArea;
    private WebElement ADDNote;
    private WebElement Attachment;
    private WebElement FirstNameFilterPerson;
    private WebElement LastNameFilterPerson;
    private WebElement PhoneFilterPerson;
    private WebElement EmailFilterPerson;
    private WebElement createBtn;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement createPersonBtn;
    public WebElement chooseToDelete;
    public WebElement listBtn;
    public WebElement deleteBtn;
    public WebElement choose_one;
    public WebElement editPerson;
    public WebElement PerPageItems;
    public WebElement Per5PageItem;
    public WebElement PagesListButton;
    public WebElement SelectPages;
    private WebElement CountryFilterPerson;
    int seconds=2000;


    public PersonsPage()throws IOException
    {
        super();
    }

    public void logOut(RemoteWebDriver driver) throws InterruptedException, IOException
    {
        userName  = driver.findElement(By.id("userName"));
        userName.click();
        logOut = driver.findElement(By.linkText("Logout"));
        logOut.click();
    }

    public MyProfilePage goToMyProfile(RemoteWebDriver driver){

        userName= driver.findElement(By.id("userName"));
        userName.click();
        myProfile = driver.findElement(By.linkText("My profile"));
        myProfile.click();

        return new MyProfilePage();
    }


    public CompaniesPage goToCompanies(RemoteWebDriver driver) throws InterruptedException {
        companyLink = driver.findElement(By.linkText("Companies"));
        companyLink.click();
        wait(3000);
        return new CompaniesPage();
    }
    public LeadsPage switchToLeads(RemoteWebDriver driver) throws InterruptedException {
        leadLink = driver.findElement(By.linkText("Leads"));
        leadLink.click();
        wait(3000);
        return new LeadsPage();
    }

//    public BonusTypePage switchToBonusType() throws InterruptedException {
//        leadLink = getDriver().findElement(By.linkText("BonusType"));
//        leadLink.click();
//        wait(3000);
//        return new BonusTypePage();
//    }

    public OpportunitiesPage switchToOpportunities(RemoteWebDriver driver) throws InterruptedException {
        leadLink = driver.findElement(By.linkText("Opportunities"));
        leadLink.click();
        wait(3000);
        return new OpportunitiesPage();
    }
    public InvoicePage switchToInvoice(RemoteWebDriver driver) throws InterruptedException {
        leadLink = driver.findElement(By.linkText("Invoice"));
        leadLink.click();
        wait(3000);
        return new InvoicePage();
    }
    public CustomerPaymentsPage switchToCustomerPaymentsPage(RemoteWebDriver driver) throws InterruptedException {
        wait(3000);
        leadLink = driver.findElement(By.linkText("Accounting"));
        leadLink.click();
        wait(3000);
        return new CustomerPaymentsPage();
    }
    public WTrackPage switchToWTrack(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.id("Project")).click();
        wait(3000);
        driver.findElement(By.linkText("wTrack")).click();

        wait(3000);
        return new WTrackPage();
    }
    public ProjectPage switchToProject(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.id("Project")).click();

        wait(3000);
        return new ProjectPage();
    }
    public TasksPage switchToTask(RemoteWebDriver driver) throws InterruptedException {
        WebElement project = driver.findElement(By.id("Project"));
        project.click();
        wait(1000);
        WebElement taskLink = driver.findElement(By.linkText("Tasks"));
        taskLink.click();
        wait(2000);
        return new TasksPage();
    }

    public ApplicationsPage switchToApplication(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.id("HR"));
        HR.click();
        wait(2000);
        applicationLink = driver.findElement(By.xpath(".//*[@id='43']/a"));
        applicationLink.click();
        wait(2000);
        return new ApplicationsPage();
    }

    public EmployeesPage switchToEmployee(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.id("HR"));
        HR.click();
        wait(2000);
        return new EmployeesPage();
    }

    public JobPositionsPage switchToJobPosition(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.id("HR"));
        HR.click();
        wait(3000);
        jobPositionLink = driver.findElement(By.xpath(".//*[@id='14']/a"));
        jobPositionLink.click();
        wait(5000);
        return new JobPositionsPage();
    }
    public BirthdaysPage switchToBirthdays(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.id("HR"));
        HR.click();
        wait(1000);
        BirthdayPageOpen=driver.findElement(By.xpath(".//*[@id='52']/a"));
        BirthdayPageOpen.click();
        wait(2000);
        return new BirthdaysPage();
    }

    public void createCorrectPerson(String _firstName, String _lastName, RemoteWebDriver driver) throws InterruptedException {

        wait(3000);
        createBtn  = driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(3000);
        firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys(_firstName);
        wait(3000);
        lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys(_lastName);
        wait(3000);
        createPersonBtn  = driver.findElement(By.id("create-person-dialog"));
        createPersonBtn.click();

    }


    public void SwitchOnList(RemoteWebDriver driver) throws InterruptedException {
        wait(3000);
        listBtn = driver.findElement(By.id("listBtn"));
        listBtn.click();
        wait(3000);

    }

    public void viewPersonDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[3]"));
        choose_one.click();
    }

    public void removePerson(RemoteWebDriver driver) throws InterruptedException {
        wait(3000);
        listBtn = driver.findElement(By.xpath(".//*[@id='listBtn']"));
        listBtn.click();
        wait(3000);
        driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[5]")).click();
        wait(3000);
        driver.findElement(By.id("top-bar-deleteBtn")).click();


    }

    public void editPerson(RemoteWebDriver driver) throws InterruptedException {
        editPerson =driver.findElement(By.xpath(".//*[@id='top-bar-editBtn']"));
        editPerson.click();
        wait(3000);
       driver.findElement(By.id("emailInput")).clear();
        driver.findElement(By.id("emailInput")).sendKeys("yana@mail.ru");
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }
    public void cancel(RemoteWebDriver driver){
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

    }
    public void Select5PerPage(RemoteWebDriver driver) throws InterruptedException {
//        PerPageItems=getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[4]/div[1]/div[3]/button"));
//        PerPageItems.click();

        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//*[@id='content-holder']/div[4]/div[1]/div[3]/button"))).perform();
        wait(seconds);
        Per5PageItem=driver.findElement(By.className("allNumberPerPage")).findElement(By.xpath("./li"));
        Per5PageItem.click();
        wait(seconds);
    }
    public void NextPage(RemoteWebDriver driver) throws InterruptedException {
        new Actions(driver).moveToElement(getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[4]/div[2]/div[2]/div/div[2]/button"))).perform();

        wait(seconds);
        SelectPages=driver.findElement(By.xpath(".//*[@id='pageList']/li[2]"));
        SelectPages.click();
        wait(seconds);
    }

    }
