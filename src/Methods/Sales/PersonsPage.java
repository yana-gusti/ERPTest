package Methods.Sales;

import Methods.Accounting.CustomerPaymentsPage;
import Methods.Base.PageBase;
import Methods.HR.ApplicationsPage;
import Methods.HR.BirthdaysPage;
import Methods.HR.EmployeesPage;
import Methods.HR.JobPositionsPage;
import Methods.MyProfile.MyProfilePage;
import Methods.Project.ProjectPage;
import Methods.Project.TasksPage;
import Methods.Project.WTrackPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created by ��������� on 03.08.2015.
 */
public class PersonsPage extends PageBase {
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

    @Override
    protected void Init() {

    }
    public PersonsPage()throws IOException
    {
        super();
    }

    public void logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        logOut = getDriver().findElement(By.linkText(getProperty("logout.link")));
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

        createBtn  = getDriver().findElement(By.id(getProperty("createBtn.id")));
        createBtn.click();
        firstName = getDriver().findElement(By.id(getProperty("firstName.id")));
        firstName.sendKeys(_firstName);
        lastName = getDriver().findElement(By.id(getProperty("lastName.id")));
        lastName.sendKeys(_lastName);
        createPersonBtn  = getDriver().findElement(By.id(getProperty("createPersonBtn.id")));
        createPersonBtn.click();

    }


    public void SwitchOnList() throws InterruptedException {
        listBtn = getDriver().findElement(By.id("listBtn"));
        listBtn.click();

    }

    public void viewPersonDetails() throws IOException, InterruptedException {
        choose_one = getDriver().findElement(By.xpath(getProperty("ChooseOne.xpath")));
        choose_one.click();
    }

    public void removePerson() throws InterruptedException {
        listBtn = getDriver().findElement(By.xpath(getProperty("listBtn.xpath")));
        listBtn.click();
        wait(1000);
        chooseToDelete = getDriver().findElement(By.xpath(".//*[@id='check_all']"));
        chooseToDelete.click();
        deleteBtn = getDriver().findElement(By.id(getProperty("deleteBtn.id")));
        deleteBtn.click();

    }

    public void editPerson(){
        editPerson = getDriver().findElement(By.xpath(getProperty("editPerson.xpath")));
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
    public void EditNoteNewPerson() throws InterruptedException {
        CurrentPerson = getDriver().findElement(By.xpath(getProperty("FirstPersoninList.id")));
        CurrentPerson.click();
        wait(1000);
        NoteArea = getDriver().findElement(By.id(getProperty("NoteArea.id")));
        NoteArea.click();
        wait(1000);
        NoteArea = getDriver().findElement(By.id(getProperty("NoteArea.id")));
        NoteArea.sendKeys("NoteText");
        wait(1000);
        AddTittleLink = getDriver().findElement(By.linkText(getProperty("ADDTitle.id")));
        AddTittleLink.click();
        wait(1000);
        NoteTitleArea = getDriver().findElement(By.id(getProperty("NoteTitleField.id")));
        NoteTitleArea.sendKeys("TittleTEXT");
        wait(1000);
        ADDNote = getDriver().findElement(By.id(getProperty("ADDNOTEbtn.id")));
        ADDNote.click();
        wait(1000);
        Attachment = getDriver().findElement(By.id(getProperty("AttachBTN.id")));
        Attachment.sendKeys(getProperty("File.id"));
    }
    public void CreateNewPerson(String _firstName, String _lastName,  String _email, String _phone, String _country ) throws InterruptedException {
        createBtn = getDriver().findElement(By.id(getProperty("CreateBTNUP.id")));
        createBtn.click();
        wait(2000);
        firstName = getDriver().findElement(By.id(getProperty("FirstNameField.id")));
        firstName.sendKeys(_firstName);
        wait(2000);
        lastName = getDriver().findElement(By.id(getProperty("LastNameField.id")));
        lastName.sendKeys(_lastName);
        wait(2000);
        WebElement email = getDriver().findElement(By.id("emailInput"));
        email.sendKeys(_email);
        wait(1000);
        WebElement phone = getDriver().findElement(By.id("phoneInput"));
        phone.sendKeys(_phone);
        wait(1000);
        WebElement country = getDriver().findElement(By.id("countryInput"));
        country.sendKeys(_country);
        wait(2000);
        createPersonBtn = getDriver().findElement(By.id(getProperty("CreateBTN.id")));
        createPersonBtn.click();
        wait(2000);
    }
    public void FirstNameFilterPerson() throws InterruptedException {
        FirstNameFilterPerson = getDriver().findElement(By.xpath(getProperty("FirstNameFilterPerson.xpath")));
        FirstNameFilterPerson.click();
    }
    public void LastNameFilterPerson() throws InterruptedException {
        LastNameFilterPerson = getDriver().findElement(By.xpath(getProperty("LastNameFilterPerson.xpath")));
        LastNameFilterPerson.click();
    }
    public void PhoneFilterPerson() throws InterruptedException {
        PhoneFilterPerson = getDriver().findElement(By.xpath(getProperty("PhoneFilterPerson.xpath")));
        PhoneFilterPerson.click();
    }
    public void EmailFilterPerson() throws InterruptedException {
        EmailFilterPerson = getDriver().findElement(By.xpath(getProperty("EmailFilterPerson.xpath")));
        EmailFilterPerson.click();
    }
    public void CountryFilterPerson() throws InterruptedException {
        CountryFilterPerson = getDriver().findElement(By.xpath(getProperty("CountryFilterPerson.xpath")));
        CountryFilterPerson.click();
    }
    public void CreatedByFilterPerson() throws InterruptedException {
        CountryFilterPerson = getDriver().findElement(By.xpath(getProperty("CreatedByFilterPerson.xpath")));
        CountryFilterPerson.click();
    }
    public void EditedByFilterPerson() throws InterruptedException {
        CountryFilterPerson = getDriver().findElement(By.xpath(getProperty("EditedByFilterPerson.xpath")));
        CountryFilterPerson.click();
    }
    public void  DeleteNoteAttachNewPerson() throws InterruptedException {
        WebElement DelNoteBTN = getDriver().findElement(By.xpath(getProperty("DelNotebtn.xpath")));
        DelNoteBTN.click();
        wait(1000);
        WebElement DelAttachBTN = getDriver().findElement(By.xpath(getProperty("DelAttachBtn.xpath")));
        DelAttachBTN.click();
        wait(1000);
    }
    public void I_hover_over_menu_item() {
        By by = By.id(getProperty("NoteBodyArea.id"));
        Actions action = new Actions(getDriver());
        WebElement elem = getDriver().findElement(by);
        action.moveToElement(elem);
        action.perform();
        this.sleep(1);
    }
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 2000);
        } catch (InterruptedException e) {
        }
    }
    public void  DeleteNoteNewPerson() throws InterruptedException {
        if (getDriver().findElement(By.linkText(getProperty("DelLinkNote.id"))).isDisplayed()==true)
        {
            getDriver().findElement(By.linkText(getProperty("DelLinkNote.id"))).click();
        }
        else if (getDriver().findElement(By.linkText(getProperty("DelLinkNote.id"))).isDisplayed()==false)
        {
            Thread.sleep(500);
            getDriver().findElement(By.linkText(getProperty("DelLinkNote.id"))).click();
        }

    }
    public void  DeleteAttachNewPerson() throws InterruptedException {
        WebElement NavigateAttachDelBTN = getDriver().findElement(By.id(getProperty("AttachBodyArea.id")));
        NavigateAttachDelBTN.click();
        WebElement DelAttachBTN = getDriver().findElement(By.linkText(getProperty("DelLinkAttach.id")));
        DelAttachBTN.click();
        wait(1000);
    }
    public void  EditNotePerson() throws InterruptedException {
        if (getDriver().findElement(By.linkText(getProperty("EditLinkNote.id"))).isDisplayed()==true)
        {
            getDriver().findElement(By.linkText(getProperty("EditLinkNote.id"))).click();
        }
        else if (getDriver().findElement(By.linkText(getProperty("EditLinkNote.id"))).isDisplayed()==false)
        {
            Thread.sleep(500);
            getDriver().findElement(By.linkText(getProperty("EditLinkNote.id"))).click();
        }
        WebElement AreaNote = getDriver().findElement(By.id(getProperty("AreaNote.id")));
        AreaNote.clear();
        AreaNote = getDriver().findElement(By.id(getProperty("AreaNote.id")));
        AreaNote.sendKeys(getProperty("TextNoteAfterEdit.id"));
        wait(1000);
        WebElement NotetitleAtea = getDriver().findElement(By.id(getProperty("NoteTitleArea.id")));
        NotetitleAtea.clear();
        NotetitleAtea = getDriver().findElement(By.id(getProperty("NoteTitleArea.id")));
        NotetitleAtea.sendKeys(getProperty("TextTitleNoteAfterEdit.id"));
        wait(1000);
        WebElement AddNoteBtn = getDriver().findElement(By.id(getProperty("AddNoteBTN.id")));
        AddNoteBtn.click();

    }
    public void  ClickOnAttachNewPerson() throws InterruptedException {
        WebElement AttachedFileLink = getDriver().findElement(By.linkText(getProperty("AttachedFileName.link")));
        AttachedFileLink.click();

    }
}
