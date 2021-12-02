package JavaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","D:\\class\\software testing\\driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com/");

        WebElement search_setting = driver.findElement(By.linkText("更多"));
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        Thread.sleep(5000);
        action.clickAndHold(search_setting).perform();
        Thread.sleep(5000);

        driver.quit();
    }
}
