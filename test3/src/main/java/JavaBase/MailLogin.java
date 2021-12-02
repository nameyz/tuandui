package JavaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MailLogin {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","D:\\class\\software testing\\driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.126.com");

        WebElement xf = driver.findElement(By.xpath("//*[@id='loginDiv']/iframe"));
        driver.switchTo().frame(xf);
        driver.findElement(By.name("email")).clear();
        Thread.sleep(10000);
        driver.findElement(By.name("email")).sendKeys("username");
        driver.findElement(By.name("password")).clear();
        Thread.sleep(10000);
        driver.findElement(By.name("password")).sendKeys("password");
        Thread.sleep(10000);
        driver.findElement(By.id("dologin")).click();
        driver.switchTo().defaultContent();
        //……
    }
}
