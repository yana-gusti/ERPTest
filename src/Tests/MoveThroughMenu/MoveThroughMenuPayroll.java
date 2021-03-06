package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuPayroll extends BaseTest {
    @Test
    public void MoveThroughMenuPayroll() throws InterruptedException, IOException {
        tabMenuItems.add("Payroll");
        tabMenuItems.add("Payout");
        tabMenuItems.add("Salary Report");
        tabMenuItems.add("Holidays");

        tabMenuItems.add("Bonus Type");
        tabMenuItems.add("Payroll Expenses");
        tabMenuItems.add("Payroll Payments");
        tabMenuItems.add("Dividend declaration");
        tabMenuItems.add("Dividend Payments");
        executeTest();
    }
}
