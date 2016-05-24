package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuSales extends BaseTest {
    @Test
    public void MoveThroughMenuSales() throws InterruptedException, IOException {

        tabMenuItems.add("Sales");
        tabMenuItems.add("Leads");
        tabMenuItems.add("Opportunities");
        tabMenuItems.add("Persons");
        tabMenuItems.add("Companies");
        tabMenuItems.add("Dashboard");
        tabMenuItems.add("Quotation");
        tabMenuItems.add("Order");
        tabMenuItems.add("Invoice");
        tabMenuItems.add("Proforma");
        tabMenuItems.add("Profit");
        tabMenuItems.add("Invoice Aging");
        tabMenuItems.add("Invoice Charts");
        executeTest();
    }
}
