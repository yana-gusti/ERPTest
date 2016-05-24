package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuExpenses extends BaseTest {
    @Test
    public void MoveThroughMenuExpenses() throws InterruptedException, IOException {
        tabMenuItems.add("Expenses");
        tabMenuItems.add("Invoice");
        tabMenuItems.add("Expenses Payments");
        executeTest();
    }
}
