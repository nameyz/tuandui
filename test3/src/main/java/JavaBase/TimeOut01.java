package JavaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class TimeOut01 {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","D:\\class\\software testing\\driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com");

        //显式等待， 针对某个元素等待
        WebDriverWait wait = new WebDriverWait(driver,10,1);

        wait.until(new ExpectedCondition<WebElement>(){
            @Override
            public WebElement apply(WebDriver text) {
                return text.findElement(By.id("kw"));
            }
        }).sendKeys("gsreegbhnghbntrh");

        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);

//        driver.quit();
    }
}