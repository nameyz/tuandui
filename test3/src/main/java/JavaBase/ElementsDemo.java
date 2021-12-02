package JavaBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class ElementsDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","D:\\class\\software testing\\driver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com/");

        WebElement search_text = driver.findElement(By.id("kw"));
        search_text.sendKeys("test");
        search_text.submit();
        Thread.sleep(2000);

        //匹配第一页搜索结果的标题， 循环打印
        List<WebElement> search_result = driver.findElements(By.xpath("//div/div/h3"));

        //打印元素的个数
        System.out.println(search_result.size());

        // 循环打印搜索结果的标题
        for(WebElement result : search_result){
            System.out.println(result.getText());
        }

        System.out.println("-------我是分割线---------");

        //打印第n结果的标题
        WebElement text = search_result.get(search_result.size() - 10);
        System.out.println(text.getText());

        driver.quit();
    }
}
