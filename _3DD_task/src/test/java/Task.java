import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {
    WebDriver driver;
    @BeforeTest
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\20110\\IdeaProjects\\facebook\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.eg/?&tag=egtxabkgode-21&ref=pd_sl_7p2aq4fe2v_e&adgrpid=123528178741&hvpone=&hvptwo=&hvadid=542971874049&hvpos=&hvnetw=g&hvrand=10160517165747003748&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9112512&hvtargid=kwd-10573980&hydadcr=334_2546792&gclid=CjwKCAiAioifBhAXEiwApzCztgYPAqU6yLE5Q6sDOfmDg3XyrHgONPFlwV8Id2l1aftf18kAmOJJixoClwEQAvD_BwE&language=en_AE");
    }
    @Test
    public void Login(){
     driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
     driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("01024075385");
     driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
     driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("omarhamdy11");
     driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        String actual=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
     String ex="Hello, omarhamdy";
     System.out.println(actual);
        Assert.assertTrue(ex.contains(actual));
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
