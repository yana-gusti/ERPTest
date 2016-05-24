package Methods.Sales;

import Methods.Base.PageBase;
import Methods.MyProfile.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

/**
 * Created by Александр on 04.08.2015.
 */
public class DashBoardVocPage extends PageBase {
    private WebElement userName;
    private WebElement logOut;
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
    private WebElement CountryFilterPerson;
    Integer seconds=1000;

    @Override
    protected void Init() {

    }

    public DashBoardVocPage(){
        super();
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

    public LoginPage logOut() throws InterruptedException, IOException
    {
        userName  = getDriver().findElement(By.id(getProperty("userName.id")));
        userName.click();
        logOut = getDriver().findElement(By.linkText(getProperty("logout.link")));
        logOut.click();
        wait(2000);
        return new LoginPage();
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
        PerPageItems=getDriver().findElement(By.id("itemsButton"));
        PerPageItems.click();
        wait(seconds);
        Per5PageItem=getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[4]/div/div[1]/div[2]/ul/li[1]/a"));
        Per5PageItem.click();
        wait(seconds);
    }
    public void NextPage() throws InterruptedException {
        PagesListButton=getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[4]/div/div[2]/div[2]/div/div[2]/button"));
        PagesListButton.click();
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
