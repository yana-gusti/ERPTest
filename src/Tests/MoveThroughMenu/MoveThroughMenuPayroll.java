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
        tabMenuItems.add("Supplier Payments");
        tabMenuItems.add("Holidays");
        tabMenuItems.add("Salary Report");
        tabMenuItems.add("Efficiency");
        tabMenuItems.add("Bonus Type");
        tabMenuItems.add("Payroll Expenses");
        tabMenuItems.add("Payroll Payments");
        tabMenuItems.add("Dividend declaration");
        tabMenuItems.add("Dividend Payments");
        executeTest();
    }
}
