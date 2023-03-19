package testngPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(MyListeners.class)
public class TestNGParameterizationDemo {

    WebDriver driver;
    @Parameters("browser")
    @BeforeMethod
    public void launchBrowsers(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--headless");
            driver = new ChromeDriver(options);

        }else if(browser.equalsIgnoreCase("firefox")){
            FirefoxOptions foptions= new FirefoxOptions();
            foptions.addArguments("--headless");
            driver = new FirefoxDriver(foptions);
            System.out.println(driver.manage().window().getSize());
        }
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //   driver.manage().window().minimize();
    }

    @AfterMethod
    public void closeBrowser(){
        //   driver.close();
        driver.quit();
    }

    @Test
    public void addToCartScenario(){
        System.out.println(Thread.currentThread().getId());
        driver.get("http://live.techpanda.org/");
        WebElement mobilelink= driver.findElement(By.xpath("//a[normalize-space()='Mobile']"));
        mobilelink.click();
        String listpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
        WebElement mobilelink1= driver.findElement(By.xpath("//a[@title='Sony Xperia']"));
        mobilelink1.click();
        String detailpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();

        Assert.assertEquals(detailpageprice, 150);

    }

    @Test(dataProvider = "loginData" , dataProviderClass = TestData.class)
    public void login(String username, String password){
        System.out.println(Thread.currentThread().getId());
        driver.get("http://live.techpanda.org/index.php/customer/account/login/");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }


}
