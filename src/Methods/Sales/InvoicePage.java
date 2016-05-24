package Methods.Sales;

import Methods.Accounting.CustomerPaymentsPage;
import Methods.Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Александр on 05.08.2015.
 */
public class InvoicePage extends PageBase {
    WebDriver driver = getDriver();
    Integer sec = 2000;
    @Override
    protected void Init() {

    }

    public  InvoicePage(){
        super();
    }

    public void removeInvoice() throws InterruptedException {
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='check_all']")).click();
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();
        wait(sec);
        alertAcept();
        wait(sec);
    }

    public CustomerPaymentsPage payInvoice() throws InterruptedException {
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='listTable']/tr/td[5]")).click();
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='invoiceForm']/fieldset/div/ul/li[3]/button[1]")).click();
        wait(sec);
        driver.findElement(By.xpath(".//*[@id='create-payment-dialog']")).click();
        wait(sec);
        return new CustomerPaymentsPage();
    }

    public String checkPaidStatus() throws InterruptedException {
        wait(sec);
        String result = driver.findElement(By.className("done")).getText();
        wait(sec);
        return result;
    }
}
