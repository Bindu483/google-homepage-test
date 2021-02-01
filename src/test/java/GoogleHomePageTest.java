import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
    @Test
    public void GoogleHomePageTitleTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals("Google", actualPageTitle);
        driver.quit();

    }
    @Test
    public void GmailLinkTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        boolean isLinkDisplayed=driver.findElement(By.linkText("Gmail")).isDisplayed();
        Assert.assertEquals(true,isLinkDisplayed);
        driver.quit();

    }
}
