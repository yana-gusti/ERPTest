package Methods.Settings;

import Methods.LoginPage;
import Methods.PageBase;
import Methods.Sales.LeadsPage;
import Methods.Sales.OpportunitiesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 24.03.14
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public class WorkflowPage extends PageBase {

    private WebElement ApplicationsLink;
    private WebElement addNewStatusButton;
    private WebElement saveStatusButton;
    private WebElement workflowTextArea;
    Integer seconds =1000;
    public WorkflowPage()
    {
        super();
    }
    @Override
    protected void Init() {

    }

    public void switchToApplications() throws InterruptedException {
        ApplicationsLink=  getDriver().findElement(By.linkText("Applications"));
        ApplicationsLink.click();
    }
    public void switchToJobpositions() throws InterruptedException {
        getDriver().findElement(By.xpath(".//*[@id='content-holder']/div[1]/div[1]/ul/li[2]/a")).click();
    }
    public void switchToLeads() throws InterruptedException {
        getDriver().findElement(By.linkText("Leads")).click();
    }
    public void switchToOpportunities() throws InterruptedException {
        getDriver().findElement(By.linkText("Opportunities")).click();
    }
    public void switchToProjects() throws InterruptedException {
        getDriver().findElement(By.linkText("Projects")).click();
    }
    public void switchToTasks() throws InterruptedException {
        getDriver().findElement(By.linkText("Tasks")).click();
    }
    public LeadsPage switchToLead() throws InterruptedException {
        WebElement sales = getDriver().findElement(By.id("Sales"))  ;
        sales.click();
        wait(1000);
        WebElement leadLink = getDriver().findElement(By.linkText("Leads"));
        leadLink.click();
        return new LeadsPage();
    }
    public OpportunitiesPage switchToOpportunity() throws InterruptedException {
        WebElement sales = getDriver().findElement(By.id("Sales"))  ;
        sales.click();
        wait(1000);
        WebElement leadLink = getDriver().findElement(By.linkText("Opportunities"));
        leadLink.click();
        return new OpportunitiesPage();
    }



    public void createWorkflow(String name, String xpath) throws InterruptedException {
        addNewStatusButton=getDriver().findElement(By.id(getProperty("addNewStatus.id")));
        addNewStatusButton.click();
        workflowTextArea=getDriver().findElement(By.xpath(xpath));
        workflowTextArea.sendKeys(name);
        wait(1000);
        saveStatusButton=  getDriver().findElement(By.id(getProperty("saveStatusButton.id")));
        saveStatusButton.click();
        wait(1000);


    }

    public LoginPage Logout() throws InterruptedException, IOException {

        getDriver().findElement(By.id("userName")).click();
        wait(seconds);
        getDriver().findElement(By.linkText("Logout")).click();
        wait(1000);
        return new LoginPage();

    }
}
