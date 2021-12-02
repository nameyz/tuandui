package JavaBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Itest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","D:\\class\\software testing\\driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();   //浏览器
        driver.get("http://www.itest.info");

        String title = driver.getTitle();
        System.out.printf(title);

//        driver.close();
    }
}

