package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuAccounting extends BaseTest {
    @Test
    public void MoveThroughMenuAccounting() throws InterruptedException, IOException {
        tabMenuItems.add("Accounting");
        tabMenuItems.add("Sales Payments");
        tabMenuItems.add("Chart Of Account");
        tabMenuItems.add("Inventory report");
        tabMenuItems.add("Journal");
        tabMenuItems.add("Journal Entry");
        tabMenuItems.add("Trial Balance");
        tabMenuItems.add("Profit And Loss");
        tabMenuItems.add("Balance Sheet");
        tabMenuItems.add("Cash Flow");
        tabMenuItems.add("Close Month");
        executeTest();
    }
}
