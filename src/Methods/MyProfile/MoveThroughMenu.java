package Methods.MyProfile;

import Tests.Base.BaseTest;
import data.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

/**
 * Created by yana on 05.05.2016.
 */
public class MoveThroughMenu extends BaseTest {


    public void MoveThroughMenu(WebDriver driver, ArrayList<String> tabMenuItems) throws InterruptedException {

        WebElement element;
        element = driver.findElement(By.id(tabMenuItems.get(0)));
        element.click();
        wait(5000);

        for (int a=1; a<tabMenuItems.size(); a++) {
            try {
                element = driver.findElement(By.linkText(tabMenuItems.get(a)));
                element.click();
                waitForProgressBar(driver, tabMenuItems.get(a));
            }catch (Exception e){
                System.out.print(e);
            }

        }


    }

}
