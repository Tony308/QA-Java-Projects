import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSiteTest {

    WebDriver driver;
    String url = "http://automationpractice.com/index.php";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2500);
        driver.quit();
    }

    @Test
    public void shopping() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.name("search_query")).sendKeys("Dress");
        driver.findElement(By.name("submit_search")).submit();
        assertEquals("Printed Summer Dress", driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText());
    }
}
