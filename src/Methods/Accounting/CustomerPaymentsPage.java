package Methods.Accounting;

import data.Settings;
import org.openqa.selenium.By;

/**
 * Created by Yana on 31.08.2015.
 */
public class CustomerPaymentsPage extends Settings {


    public CustomerPaymentsPage(){
        super();
    }

    public void payInvoice(){
        getDriver().findElement(By.xpath(".//*[@id='listTable']/tr/td[10]/a")).click();
        getDriver().findElement(By.className("newSelectList")).findElement(By.xpath("./li")).click();
    }

    public void removewPayments(){
        getDriver().findElement(By.xpath(".//*[@id='check_all']")).click();
        getDriver().findElement(By.xpath(".//*[@id='top-bar-deleteBtn']")).click();
        alertAcept();
    }
}
