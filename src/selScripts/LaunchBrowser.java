package selScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        LaunchBrowser lb = new LaunchBrowser();
        lb.launchBrowserandBasicFunctions();
    }

    public void launchBrowserandBasicFunctions() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
      //  driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());

      //  driver.close();

    }



    public void launchBrowserusingbrowserdriver(){
        System.setProperty("webdriver.chrome.driver","D:\\Automationtools\\seljars\\cd110\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
