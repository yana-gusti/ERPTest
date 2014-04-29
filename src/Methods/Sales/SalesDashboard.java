package Methods.Sales;

/**
 * Created by Дом on 27.03.14.
 */
import Methods.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesDashboard extends PageBase{

    public WebElement GoToSales;
    public WebElement GoToDashboard;
    public WebElement Button7D;
    public WebElement ButtonWeek;
    public WebElement ButtonMonth;
    public WebElement ButtonDayOfWeek;
    public WebElement ButtonDayOfMonth;
    public WebElement Button30D;
    public WebElement Button90D;
    public WebElement Button12M;
    public WebElement SwitchToLeadsBySoursView;
    public WebElement Source7DButton;
    public WebElement Source30DButton;
    public WebElement Source90DButton;
    public WebElement Source12MButton;
    public WebElement ButtonDay;

    @Override
    protected void Init(){}
    public SalesDashboard(){super();}
    public void LeadsByDate() throws InterruptedException {
        ButtonDay=getDriver().findElement(By.xpath(getProperty("daybtn.xpath")));
        ButtonDay.click();
        wait(1000);
        ButtonWeek=getDriver().findElement(By.xpath(getProperty("weekbtn.xpath")));
        ButtonWeek.click();
        wait(1000);
        ButtonMonth=getDriver().findElement(By.xpath(getProperty("monthbth.xpath")));
        ButtonMonth.click();
        wait(1000);
        ButtonDayOfWeek=getDriver().findElement(By.xpath(getProperty("dayofweekbtn.xpath")));
        ButtonDayOfWeek.click();
        wait(1000);
        ButtonDayOfMonth=getDriver().findElement(By.xpath(getProperty("dayofmonth.xpath")));
        ButtonDayOfMonth.click();

    }
    public void LeadsByDate7D() throws InterruptedException {
        wait(1000);
        Button7D=getDriver().findElement(By.xpath(getProperty("7Dbtn.xpath")));
        Button7D.click();
        wait(1000);
        LeadsByDate();
        wait(1000);
    }
    public void LeadsByDate30D() throws InterruptedException {
        wait(1000);
        Button30D=getDriver().findElement(By.xpath(getProperty("30Dbtn.xpath")));
        Button30D.click();
        wait(1000);
        LeadsByDate();
        wait(1000);
    }
    public void LeadsByDate90D() throws InterruptedException {
        wait(1000);
        Button90D=getDriver().findElement(By.xpath(getProperty("90Dbtn.xpath")));
        Button90D.click();
        wait(1000);
        LeadsByDate();
        wait(1000);
    }
    public void LeadsByDate12M() throws InterruptedException {
        wait(1000);
        Button12M=getDriver().findElement(By.xpath(getProperty("12Mbtn.xpath")));
        Button12M.click();
        wait(1000);
        LeadsByDate();
        wait(1000);
    }
    public void SwitchToLeadsBySourse()throws InterruptedException {
        wait(1000);
        SwitchToLeadsBySoursView=getDriver().findElement(By.linkText(getProperty("leadbysourse.linkText")));
        SwitchToLeadsBySoursView.click();
        wait(1000);
    }
    public void LeadsBySourceAll() throws InterruptedException{
        wait(1000);
        Source7DButton=getDriver().findElement(By.xpath(getProperty("sourse7dbtn.xpath")));
        Source7DButton.click();
        wait(1000);
        Source30DButton=getDriver().findElement(By.xpath(getProperty("sourse30dbtn.xpath")));
        Source30DButton.click();
        wait(1000);
        Source90DButton=getDriver().findElement(By.xpath(getProperty("sourse90dbtn.xpath")));
        Source90DButton.click();
        wait(1000);
        Source12MButton=getDriver().findElement(By.xpath(getProperty("sourse12mbtn.xpath")));
        Source12MButton.click();
        wait(1000);
    }
    public void LogOut() throws InterruptedException {
        wait(2000);
        getDriver().findElement(By.id(getProperty("username.id"))).click();
        wait(2000);
        getDriver().findElement(By.linkText(getProperty("logout.linkText"))).click();
        wait(2000);
    }
}

