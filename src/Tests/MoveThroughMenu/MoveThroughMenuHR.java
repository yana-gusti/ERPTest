package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuHR extends BaseTest {
    @Test
    public void MoveThroughMenuHR() throws InterruptedException, IOException {
        tabMenuItems.add("HR");
        tabMenuItems.add("Employees");
        tabMenuItems.add("Applications");
        tabMenuItems.add("Job Positions");
        tabMenuItems.add("Birthdays");
        tabMenuItems.add("Vacation");
        tabMenuItems.add("Attendance");
        tabMenuItems.add("HrDashboard");
        executeTest();
    }
}
