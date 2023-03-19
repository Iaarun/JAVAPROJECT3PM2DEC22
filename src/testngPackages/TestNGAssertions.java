package testngPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestNGAssertions {
    WebDriver driver;

    @BeforeMethod
    public void launchBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        System.out.println(driver.manage().window().getSize());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void assertaddToCartScenario(){
        driver.get("http://live.techpanda.org/");

        String expectedtitle = "Home page1";
        String actualtile = driver.getTitle();

        Assert.assertEquals(actualtile, expectedtitle);
        WebElement mobilelink= driver.findElement(By.xpath("//a[normalize-space()='Mobile']"));
        mobilelink.click();
        String listpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
        WebElement mobilelink1= driver.findElement(By.xpath("//a[@title='Sony Xperia']"));
        mobilelink1.click();
        String detailpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();

        Assert.assertEquals(detailpageprice, 150);

//        if(detailpageprice.equals(listpageprice)){
//            System.out.println("FAIL");
//        }else{
//            System.out.println("FAIL");
//        }

    }


    @Test
    public void softassertaddToCartScenario(){
        SoftAssert softassert = new SoftAssert();
        driver.get("http://live.techpanda.org/");

        String expectedtitle = "Home page1";
        String actualtile = driver.getTitle();

        softassert.assertEquals(actualtile, expectedtitle);
        WebElement mobilelink= driver.findElement(By.xpath("//a[normalize-space()='Mobile']"));
        mobilelink.click();
        String listpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
        WebElement mobilelink1= driver.findElement(By.xpath("//a[@title='Sony Xperia']"));
        mobilelink1.click();
        String detailpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();

        softassert.assertEquals(detailpageprice, 150);

        softassert.assertAll();

    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
