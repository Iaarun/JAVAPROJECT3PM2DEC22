package selScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelScripts {
    WebDriver driver;

 //   ChromeDriver driver;
    public static void main(String[] args) throws InterruptedException {
        SelScripts  ss = new SelScripts();
        ss.launchBrowsers("chrome");
        ss.sendDatatoinputbox();
        ss.closeBrowser();
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
     //   driver.manage().window().minimize();
    }

    public void closeBrowser(){
     //   driver.close();
        driver.quit();
    }

    public void basicFunctions() {

        driver.get("https://live.guru99.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandles());
        driver.switchTo().newWindow(WindowType.TAB);
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
    }

    public void navigationcommands() throws InterruptedException {
           driver.navigate().to("https://www.selenium.dev/");
        System.out.println(driver.getCurrentUrl());
        driver.get("https://www.selenium.dev/downloads/");
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(500);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(500);
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();

    }

    public void sendDatatoinputbox(){
        driver.get("http://live.techpanda.org/index.php/customer/account/login/");
        WebElement emailfield= driver.findElement(By.id("email"));
        emailfield.sendKeys("abc@test.com");
        WebElement password= driver.findElement(By.name("login[password]"));
        password.sendKeys("test");
        WebElement lgnBtn= driver.findElement(By.id("send2"));
        lgnBtn.click();

       WebElement errormsg= driver.findElement(By.id("advice-validate-password-pass"));
       //fetch the text from webelement
        System.out.println(errormsg.getText());
    }
}
