package Tests.MoveThroughMenu;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by yana on 13.05.2016.
 */
public class MoveThroughMenuSettings extends BaseTest {
    @Test
    public void MoveThroughMenuSettings() throws InterruptedException, IOException {
        tabMenuItems.add("Settings");
        tabMenuItems.add("Departments");
        tabMenuItems.add("Users");
        tabMenuItems.add("Workflows");
        tabMenuItems.add("Profiles");
        tabMenuItems.add("settingsEmployee");
        tabMenuItems.add("Accounting");
        tabMenuItems.add("Product Categories");
        executeTest();
    }
}
