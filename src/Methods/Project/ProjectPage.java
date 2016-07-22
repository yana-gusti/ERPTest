package Methods.Project;

import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.testng.Assert.assertEquals;

/**
 * Created by ��������� on 05.08.2015.
 */
public class ProjectPage extends BaseTest {



    public void createProject(String _projectName, RemoteWebDriver driver) throws InterruptedException {
        WebElement createBtn =  driver.findElement(By.id("top-bar-createBtn"));
        createBtn.click();
        WebElement projectName = driver.findElement(By.id("projectName"));
        projectName.clear();
        projectName.sendKeys(_projectName);
        driver.findElement(By.id("projectShortDesc")).clear();
        driver.findElement(By.id("projectShortDesc")).sendKeys("Test");
        WebElement projectType = driver.findElement(By.id("projectTypeDD"));
        projectType.click();
        driver.findElement(By.id("fixed")).click();
        driver.findElement(By.id("customerDd")).click();
        driver.findElement(By.id("570b65d718efef5454b6b58d")).click();

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();


    }

    public void switchToList(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.id("listBtn")).click();
    }
    public void openProject(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).click();
        wait(seconds);
    }

    public void removeAllProjects(RemoteWebDriver driver) throws InterruptedException {

        driver.findElement(By.id("check_all")).click();
        driver.findElement(By.id("top-bar-deleteBtn")).click();
        alertAcept();

    }

    public void createProjectWithAttachment(RemoteWebDriver driver) throws InterruptedException {
        driver.findElement(By.id("top-bar-createBtn")).click();
        driver.findElement(By.id("projectName")).clear();
        driver.findElement(By.id("projectName")).sendKeys("QA");
        driver.findElement(By.id("projectShortDesc")).clear();
        driver.findElement(By.id("projectShortDesc")).sendKeys("qa");
        wait(seconds);
        driver.findElement(By.id("inputAttach")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
        wait(seconds);
        assertEquals("Chrysanthemum.jpg", driver.findElement(By.cssSelector("span.blue")).getText());
        wait(seconds);
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

    }

    public void createTimeCard(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        driver.findElement(By.id("timesheetTab")).click();
        wait(seconds);
        driver.findElement(By.id("createBtn")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("td.editable.errorContent")).click();
        driver.findElement(By.cssSelector("ul > #createJob")).click();
        driver.findElement(By.id("jobName")).clear();
        driver.findElement(By.id("jobName")).sendKeys("Test");
        driver.findElement(By.id("generateBtn")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-content='jobs']")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-content='jobs']/div/div/div/ul/li[1]")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-content='employee']")).click();
        driver.findElement(By.xpath("//*[@data-content='employee']/div/div/div/ul/li[3]")).click();
        wait(seconds);
        driver.findElement(By.id("savewTrack")).click();

    }

    public void createQuotation(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        driver.findElement(By.id("quotationsTab")).click();
        wait(seconds);
        driver.findElement(By.id("createQuotation")).click();
        wait(seconds);
        driver.findElement(By.linkText("Add an item")).click();
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='productItemsHolder']/div/table/tbody/tr[1]/td[3]/a")).click();
        wait(seconds);
        driver.findElement(By.xpath("//*[@data-name='jobs']/ul/li[1]")).click();
        wait(seconds);
        driver.findElement(By.id("editInput")).click();
        driver.findElement(By.id("editInput")).clear();
        driver.findElement(By.id("editInput")).sendKeys("200");
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='create-person-dialog']")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("td.total.dollar")).getText(), "200.00");

    }

    public void createProforma(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        driver.findElement(By.id("quotationsTab")).click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='listTableQuotation']/tr/td[3]")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("button.createProforma")).click();
        wait(seconds);
        driver.findElement(By.id("due_date")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
        driver.findElement(By.linkText("1")).click();
        wait(seconds);
        driver.findElement(By.xpath("(//button[@type='button'])[26]")).click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='listTable']/tr[2]/td[4]")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("button.btn.approve")).getText(), "Approve");



    }

    public void approveProforma(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.id("proformaTab")).click();
        wait(seconds);
        driver.findElement(By.xpath("(//tbody[@id='listTable']/tr/td[3])[2]")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("button.btn.approve")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.xpath("(//tbody[@id='listTable']/tr/td[11])[2]")).getText(), "Unpaid");


    }
    public void payProforma(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.id("proformaTab")).click();
        wait(seconds);
        driver.findElement(By.xpath("(//tbody[@id='listTable']/tr/td[3])[2]")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("button.btn.newPayment")).click();
        wait(seconds);
        driver.findElement(By.id("paymentMethod")).click();
        wait(seconds);
        driver.findElement(By.id("565f2e05ab70d49024242e10")).click();
        wait(seconds);
        driver.findElement(By.id("create-payment-dialog")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("#paymentsTab > span")).getText(), "(1)");
    }
    public void deletePayment(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.id("paymentsTab")).click();
        wait(seconds);
        driver.findElement(By.id("checkAll_payments")).click();

        wait(seconds);
        driver.findElement(By.id("removePayment")).click();
        wait(seconds);
        driver.switchTo().alert().accept();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("#paymentsTab > span")).getText(), "(0)");
    }

    public void deleteProforma(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.id("proformaTab")).click();
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='checkAll_proforma']")).click();
        wait(seconds);
        driver.findElement(By.id("removeProforma")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("#proformaTab > span")).getText(), "(0)");

    }
    public void confirmOrder(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.id("quotationsTab")).click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='listTableQuotation']/tr/td[3]")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("button.confirmOrder")).click();
        wait(seconds);
        driver.findElement(By.xpath("(//button[@type='button'])[26]")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("#ordersTab > span")).getText(), "(1)");
    }
    public void receiveInvoice(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.cssSelector("#ordersTab > span")).click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='orderTable']/tr/td[3]")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("button.btn.receiveInvoice")).click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("button.btn.approve")).getText(), "Approve");
    }
    public void approveInvoice(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        driver.findElement(By.linkText("CRM")).click();
        wait(seconds);
        driver.findElement(By.linkText("Invoices")).click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).click();

        wait(seconds);
        driver.findElement(By.id("due_date")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
        wait(seconds);
        driver.findElement(By.linkText("1")).click();
        wait(seconds);
        driver.findElement(By.cssSelector("button.btn.approve")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("span.unpaid")).getText(), "Unpaid");

    }

    public void payInvoice(RemoteWebDriver driver) throws InterruptedException {
        wait(seconds);
        driver.findElement(By.linkText("CRM")).click();
        wait(seconds);
        driver.findElement(By.linkText("Invoices")).click();
        wait(seconds);
        driver.findElement(By.xpath("//tbody[@id='listTable']/tr/td[3]")).click();

        wait(seconds);
        driver.findElement(By.cssSelector("button.btn.newPayment")).click();
        wait(seconds);
        driver.findElement(By.id("paymentMethod")).click();
        wait(seconds);
        driver.findElement(By.id("565f2e05ab70d49024242e10")).click();
        wait(seconds);
        driver.findElement(By.id("create-payment-dialog")).click();


    }

    public void deleteInvoice(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.id("invoicesTab")).click();
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='checkAll_invoice']")).click();
        wait(seconds);
        driver.findElement(By.id("removeInvoice")).click();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("#invoicesTab > span")).getText(), "(0)");
    }

    public void deleteOrder(RemoteWebDriver driver) throws InterruptedException {
        openProject(driver);
        wait(seconds);
        driver.findElement(By.id("ordersTab")).click();
        wait(seconds);
        driver.findElement(By.xpath(".//*[@id='checkAll_orders']")).click();
        wait(seconds);
        driver.findElement(By.id("removeOrder")).click();
        wait(seconds);
        driver.switchTo().alert().accept();
        wait(seconds);
        assertEquals(driver.findElement(By.cssSelector("#ordersTab > span")).getText(), "(0)");


    }
}
