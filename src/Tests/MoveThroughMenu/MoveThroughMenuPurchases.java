package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuPurchases extends BaseTest {
    @Test
    public void MoveThroughMenuPurchases() throws InterruptedException, IOException {
        tabMenuItems.add("Purchases");
        tabMenuItems.add("Quotation");
        tabMenuItems.add("Order");
        tabMenuItems.add("Invoice");
        tabMenuItems.add("Product");
        executeTest();
    }
}
