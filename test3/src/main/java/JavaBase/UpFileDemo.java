package JavaBase;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class UpFileDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","D:\\class\\software testing\\driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        File file = new File("./HTMLFile/upfile.html");
        String filePath = file.getAbsolutePath();
        driver.get(filePath);

        //定位上传按钮， 添加本地文件
        driver.findElement(By.name("file")).sendKeys("D:\\upload_file.txt");
        Thread.sleep(10000);

        driver.quit();
    }
}
