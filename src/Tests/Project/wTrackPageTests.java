package Tests.Project;

import Methods.Accounting.CustomerPaymentsPage;
import Methods.Project.WTrackPage;
import Methods.Sales.InvoicePage;
import Methods.Sales.PersonsPage;
import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Yana on 31.08.2015.
 */
public class wTrackPageTests extends BaseTest {
    Integer seconds=10000;

    @Test(groups = { "good" })

    public void createwTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        WTrackPage wTrackPage = personsPage.switchToWTrack(driver);
        wait(seconds);
        wTrackPage.createwTrackItem();
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void editwTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        WTrackPage wTrackPage = personsPage.switchToWTrack(driver);
        wait(seconds);
        wTrackPage.editwTrackItem();
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void generateInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        WTrackPage wTrackPage = personsPage.switchToWTrack(driver);
        wait(seconds);
        InvoicePage invoicePage = wTrackPage.generateInvoice();
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void kpayInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        InvoicePage invoicePage = personsPage.switchToInvoice(driver);
        wait(seconds);
        invoicePage.payInvoice();
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void lpayInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        CustomerPaymentsPage customerPaymentsPage = personsPage.switchToCustomerPaymentsPage(driver);
        wait(seconds);
        customerPaymentsPage.payInvoice();
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void mckeckInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        wait(seconds);
        InvoicePage invoicePage = personsPage.switchToInvoice(driver);
        wait(seconds);
        invoicePage.checkPaidStatus();
        wait(seconds);
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void removeInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        InvoicePage invoicePage = personsPage.switchToInvoice(driver);
        invoicePage.removeInvoice();
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void removewPayment() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        CustomerPaymentsPage customerPaymentsPage = personsPage.switchToCustomerPaymentsPage(driver);
        customerPaymentsPage.removewPayments();
        personsPage.logOut(driver);
    }

    @Test(groups = { "good" })

    public void removewTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        WTrackPage wTrackPage = personsPage.switchToWTrack(driver);
        wTrackPage.removewTrackItem();
        personsPage.logOut(driver);
    }
}
