package JavaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","D:\\class\\software testing\\driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com");

        driver.findElement(By.linkText("更多")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("百科")).click();
        Thread.sleep(5000);

        //<select>标签的下拉框选择
//        WebElement el = driver.findElement(By.xpath("//select"));
//        Select sel = new Select(el);
//        sel.selectByValue("20");
//        Thread.sleep(10000);

        driver.quit();
    }
}
