package selScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class  AddToCart {
    WebDriver driver;
    public static void main(String[] args) {
        AddToCart  addcart = new AddToCart();
        addcart.launchBrowsers("firefox");
        addcart.addToCartScenario();
        addcart.closeBrowser();
    }

    public void launchBrowsers(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            System.out.println(driver.manage().window().getSize());
        }
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //   driver.manage().window().minimize();
    }

    public void closeBrowser(){
        //   driver.close();
        driver.quit();
    }

    public void addToCartScenario(){
        driver.get("http://live.techpanda.org/");
     WebElement mobilelink= driver.findElement(By.xpath("//a[normalize-space()='Mobile']"));
     mobilelink.click();
    String listpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
     WebElement mobilelink1= driver.findElement(By.xpath("//a[@title='Sony Xperia']"));
     mobilelink1.click();
        String detailpageprice= driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();

        if(detailpageprice.equals(listpageprice)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
