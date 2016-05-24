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

    @Test(groups = { "good" })

    public void createwTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        WTrackPage wTrackPage = personsPage.switchToWTrack();
        wTrackPage.createwTrackItem();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void editwTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        WTrackPage wTrackPage = personsPage.switchToWTrack();
        wTrackPage.editwTrackItem();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void generateInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        WTrackPage wTrackPage = personsPage.switchToWTrack();
        InvoicePage invoicePage = wTrackPage.generateInvoice();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void kpayInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        InvoicePage invoicePage = personsPage.switchToInvoice();
        invoicePage.payInvoice();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void lpayInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        CustomerPaymentsPage customerPaymentsPage = personsPage.switchToCustomerPaymentsPage();
        customerPaymentsPage.payInvoice();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void mckeckInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        InvoicePage invoicePage = personsPage.switchToInvoice();
        invoicePage.checkPaidStatus();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void removeInvoice() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        InvoicePage invoicePage = personsPage.switchToInvoice();
        invoicePage.removeInvoice();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void removewPayment() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        CustomerPaymentsPage customerPaymentsPage = personsPage.switchToCustomerPaymentsPage();
        customerPaymentsPage.removewPayments();
        personsPage.logOut();
    }

    @Test(groups = { "good" })

    public void removewTrackItem() throws InterruptedException, IOException
    {
        PersonsPage personsPage = GoToPersonsPage();
        WTrackPage wTrackPage = personsPage.switchToWTrack();
        wTrackPage.removewTrackItem();
        personsPage.logOut();
    }
}
