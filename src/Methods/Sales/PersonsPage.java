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
    private WebElement myProfile;
    private WebElement companyLink;
    private WebElement leadLink;
    private WebElement HR;
    private WebElement applicationLink;
    private WebElement jobPositionLink;
    private WebElement BirthdayPageOpen;
    private WebElement createBtn;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement createPersonBtn;
    public WebElement listBtn;
    public WebElement choose_one;
    public WebElement editPerson;
    public WebElement Per5PageItem;
    public WebElement SelectPages;
//    public  String arrowXpath = "sidebar_toggler" ;



    public MyProfilePage goToMyProfile(RemoteWebDriver driver){

        userName= driver.findElement(By.id("userName"));
        userName.click();
        myProfile = driver.findElement(By.linkText("My profile"));
        myProfile.click();
//        driver.findElement(By.className(arrowXpath)).click();


        return new MyProfilePage();
    }


    public CompaniesPage goToCompanies(RemoteWebDriver driver) throws InterruptedException {

        companyLink = driver.findElement(By.linkText("Companies"));
        companyLink.click();
//        driver.findElement(By.className(arrowXpath)).click();

        return new CompaniesPage();
    }
    public LeadsPage switchToLeads(RemoteWebDriver driver) throws InterruptedException {
        leadLink = driver.findElement(By.linkText("Leads"));
        leadLink.click();
//        driver.findElement(By.className(arrowXpath)).click();


        return new LeadsPage();
    }


    public OpportunitiesPage switchToOpportunities(RemoteWebDriver driver) throws InterruptedException {
        leadLink = driver.findElement(By.linkText("Opportunities"));
        leadLink.click();
//        driver.findElement(By.className(arrowXpath)).click();


        return new OpportunitiesPage();
    }

    public CustomerPaymentsPage switchToCustomerPaymentsPage(RemoteWebDriver driver) throws InterruptedException {

        leadLink = driver.findElement(By.linkText("Accounting"));
        leadLink.click();
//        driver.findElement(By.className(arrowXpath)).click();


        return new CustomerPaymentsPage();
    }
    public WTrackPage switchToWTrack(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Project")).click();
        wait(seconds);
        driver.findElement(By.linkText("wTrack")).click();

//        driver.findElement(By.className(arrowXpath)).click();


        return new WTrackPage();
    }
    public ProjectPage switchToProject(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Project")).click();
        wait(seconds);
        driver.findElement(By.linkText("Projects")).click();

//        driver.findElement(By.className(arrowXpath)).click();


        return new ProjectPage();
    }
    public TasksPage switchToTask(RemoteWebDriver driver) throws InterruptedException {
        WebElement project = driver.findElement(By.linkText("Project"));
        project.click();
        wait(seconds);
        WebElement taskLink = driver.findElement(By.linkText("Tasks"));
        taskLink.click();
//        driver.findElement(By.className(arrowXpath)).click();


        return new TasksPage();
    }

    public ApplicationsPage switchToApplication(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.linkText("HR"));
        HR.click();
        wait(seconds);
        applicationLink = driver.findElement(By.linkText("Applications"));
        applicationLink.click();
        wait(seconds);
//        driver.findElement(By.className(arrowXpath)).click();


        return new ApplicationsPage();
    }

    public EmployeesPage switchToEmployee(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.linkText("HR"));
        HR.click();
        wait(seconds);
        driver.findElement(By.linkText("Employees")).click();

//        driver.findElement(By.className(arrowXpath)).click();


        return new EmployeesPage();
    }

    public JobPositionsPage switchToJobPosition(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.linkText("HR"));
        HR.click();
        wait(seconds);
        jobPositionLink = driver.findElement(By.linkText("Job Positions"));
        jobPositionLink.click();
//        driver.findElement(By.className(arrowXpath)).click();


        return new JobPositionsPage();
    }
    public BirthdaysPage switchToBirthdays(RemoteWebDriver driver) throws InterruptedException {
        HR = driver.findElement(By.linkText("HR"));
        HR.click();
        wait(seconds);
        BirthdayPageOpen=driver.findElement(By.xpath("Birthdays"));
        BirthdayPageOpen.click();
//        driver.findElement(By.className(arrowXpath)).click();


        return new BirthdaysPage();
    }

    public void createCorrectPerson(String _firstName, String _lastName, RemoteWebDriver driver) throws InterruptedException {

        createBtn  = driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        wait(seconds);
        firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys(_firstName);
        lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys(_lastName);
        createPersonBtn  = driver.findElement(By.id("create-person-dialog"));
        createPersonBtn.click();

    }


    public void SwitchOnList(RemoteWebDriver driver) throws InterruptedException {

        listBtn = driver.findElement(By.id("listBtn"));
        listBtn.click();

    }

    public void viewPersonDetails(RemoteWebDriver driver) throws IOException, InterruptedException {
        choose_one = driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[3]"));
        choose_one.click();
    }

    public void removePerson(RemoteWebDriver driver) throws InterruptedException {

        listBtn = driver.findElement(By.xpath(".//*[@id='listBtn']"));
        listBtn.click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[5]")).click();
        wait(seconds);
        driver.findElement(By.id("top-bar-deleteBtn")).click();


    }

    public void editPerson(RemoteWebDriver driver) throws InterruptedException {
        editPerson =driver.findElement(By.xpath(".//*[@id='top-bar-editBtn']"));
        editPerson.click();
        wait(seconds);
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
