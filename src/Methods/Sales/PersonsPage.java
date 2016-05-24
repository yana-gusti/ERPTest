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
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created by ��������� on 03.08.2015.
 */
public class PersonsPage extends Settings {
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

    public void logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id("userName"));
        userName.click();
        logOut = getDriver().findElement(By.linkText("Logout"));
        logOut.click();
    }

    public MyProfilePage goToMyProfile(){

        userName= getDriver().findElement(By.id("userName"));
        userName.click();
        myProfile = getDriver().findElement(By.linkText("My profile"));
        myProfile.click();

        return new MyProfilePage();
    }


    public CompaniesPage goToCompanies() throws InterruptedException {
        companyLink = getDriver().findElement(By.linkText("Companies"));
        companyLink.click();
        wait(3000);
        return new CompaniesPage();
    }
    public LeadsPage switchToLeads() throws InterruptedException {
        leadLink = getDriver().findElement(By.linkText("Leads"));
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

    public OpportunitiesPage switchToOpportunities() throws InterruptedException {
        leadLink = getDriver().findElement(By.linkText("Opportunities"));
        leadLink.click();
        wait(3000);
        return new OpportunitiesPage();
    }
    public InvoicePage switchToInvoice() throws InterruptedException {
        leadLink = getDriver().findElement(By.linkText("Invoice"));
        leadLink.click();
        wait(3000);
        return new InvoicePage();
    }
    public CustomerPaymentsPage switchToCustomerPaymentsPage() throws InterruptedException {
        wait(3000);
        leadLink = getDriver().findElement(By.linkText("Accounting"));
        leadLink.click();
        wait(3000);
        return new CustomerPaymentsPage();
    }
    public WTrackPage switchToWTrack() throws InterruptedException {
        getDriver().findElement(By.id("Project")).click();
        wait(3000);
        getDriver().findElement(By.linkText("wTrack")).click();

        wait(3000);
        return new WTrackPage();
    }
    public ProjectPage switchToProject() throws InterruptedException {
        getDriver().findElement(By.id("Project")).click();

        wait(3000);
        return new ProjectPage();
    }
    public TasksPage switchToTask() throws InterruptedException {
        WebElement project = getDriver().findElement(By.id("Project"));
        project.click();
        wait(1000);
        WebElement taskLink = getDriver().findElement(By.linkText("Tasks"));
        taskLink.click();
        wait(2000);
        return new TasksPage();
    }

    public ApplicationsPage switchToApplication() throws InterruptedException {
        HR = getDriver().findElement(By.id("HR"));
        HR.click();
        wait(2000);
        applicationLink = getDriver().findElement(By.xpath(".//*[@id='43']/a"));
        applicationLink.click();
        wait(2000);
        return new ApplicationsPage();
    }

    public EmployeesPage switchToEmployee() throws InterruptedException {
        HR = getDriver().findElement(By.id("HR"));
        HR.click();
        wait(2000);
        return new EmployeesPage();
    }

    public JobPositionsPage switchToJobPosition() throws InterruptedException {
        HR = getDriver().findElement(By.id("HR"));
        HR.click();
        wait(1000);
        jobPositionLink = getDriver().findElement(By.xpath(".//*[@id='14']/a"));
        jobPositionLink.click();
        wait(2000);
        return new JobPositionsPage();
    }
    public BirthdaysPage switchToBirthdays() throws InterruptedException {
        HR = getDriver().findElement(By.id("HR"));
        HR.click();
        wait(1000);
        BirthdayPageOpen=getDriver().findElement(By.xpath(".//*[@id='52']/a"));
        BirthdayPageOpen.click();
        wait(2000);
        return new BirthdaysPage();
    }

    public void createCorrectPerson(String _firstName, String _lastName)
    {

        createBtn  = getDriver().findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        firstName = getDriver().findElement(By.id("firstName"));
        firstName.sendKeys(_firstName);
        lastName = getDriver().findElement(By.id("lastName"));
        lastName.sendKeys(_lastName);
        createPersonBtn  = getDriver().findElement(By.id("create-person-dialog"));
        createPersonBtn.click();

    }


    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.id("listBtn"));
        listBtn.click();

    }

    public void viewPersonDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(".//*[@id='listTable']/tr/td[3]"));
        choose_one.click();
    }

    public void removePerson() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath(".//*[@id='listBtn']"));
        listBtn.click();
        wait(1000);
        chooseToDelete = getDriver().findElement(By.xpath(".//*[@id='check_all']"));
        chooseToDelete.click();
        deleteBtn = getDriver().findElement(By.id("top-bar-deleteBtn"));
        deleteBtn.click();

    }

    public void editPerson(){
        editPerson = getDriver().findElement(By.xpath(".//*[@id='top-bar-editBtn']"));
        editPerson.click();
        getDriver().findElement(By.id("emailInput")).clear();
        getDriver().findElement(By.id("emailInput")).sendKeys("yana@mail.ru");
        getDriver().findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }
    public void cancel(){
        getDriver().findElement(By.xpath("(//button[@type='button'])[3]")).click();

    }
    public void Select5PerPage() throws InterruptedException {
//        PerPageItems=getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[4]/div[1]/div[3]/button"));
//        PerPageItems.click();

        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[4]/div[1]/div[3]/button"))).perform();
        wait(seconds);
        Per5PageItem=getDriver().findElement(By.className("allNumberPerPage")).findElement(By.xpath("./li"));
        Per5PageItem.click();
        wait(seconds);
    }
    public void NextPage() throws InterruptedException {
        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[4]/div[2]/div[2]/div/div[2]/button"))).perform();

        wait(seconds);
        SelectPages=getDriver().findElement(By.xpath(".//*[@id='pageList']/li[2]"));
        SelectPages.click();
        wait(seconds);
    }

    }
