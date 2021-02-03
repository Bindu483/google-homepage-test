import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
    WebDriver driver;

    @BeforeMethod
    public void TestSetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void TestTearDown() {
        driver.quit();
    }

    @Test
    public void GoogleHomePageTitleTest() {

        String actualPageTitle = driver.getTitle();
        Assert.assertEquals("Google", actualPageTitle);

    }

    @Test
    public void GmailLinkTest() {
        WebElement gmailLinkTextElement = driver.findElement(By.linkText("Images"));
        Assert.assertTrue(gmailLinkTextElement.isDisplayed());
        Assert.assertTrue(gmailLinkTextElement.isEnabled());

    }

    @Test
    public void ImageLinkTest() {
        WebElement imagesLinkTextElement = driver.findElement(By.linkText("Images"));
        Assert.assertTrue(imagesLinkTextElement.isDisplayed());
        Assert.assertTrue(imagesLinkTextElement.isEnabled());

    }

    @Test
    public void KannadaLinkTest() {
        WebElement kannadaLinkTextElement = driver.findElement(By.linkText("ಕನ್ನಡ"));
        Assert.assertTrue(kannadaLinkTextElement.isDisplayed());
        Assert.assertTrue(kannadaLinkTextElement.isEnabled());
    }
}
