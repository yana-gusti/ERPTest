package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuProject extends BaseTest {
    @Test
    public void MoveThroughMenuProject() throws InterruptedException, IOException {
        tabMenuItems.add("Project");
        tabMenuItems.add("Projects");
        tabMenuItems.add("Dashboard Vacation");
        tabMenuItems.add("Tasks");
        tabMenuItems.add("Dashboard");
        tabMenuItems.add("Jobs Dashboard");
        tabMenuItems.add("tCard");
        executeTest();
    }
}
