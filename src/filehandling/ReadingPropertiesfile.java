package filehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesfile {
WebDriver driver;
    public static void main(String[] args) throws IOException {
        ReadingPropertiesfile rp = new ReadingPropertiesfile();
        Properties prop1= rp.readPropertiesfile();

        String browser = prop1.getProperty("browser");
         String url =prop1.getProperty("appurl");
         String user= prop1.getProperty("username");
        String pass= prop1.getProperty("password");
        rp.launchBrowsers(browser);
        rp.logintoapp(url, user, pass);

    }

    public  Properties readPropertiesfile() throws IOException {
        File file = new File("./src/filehandling/data.properties");
        FileInputStream fis = new FileInputStream(file);

        //read the properties file
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println( prop.getProperty("appurl"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        System.out.println(prop.getProperty("browser"));

    return prop;
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
        //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void logintoapp(String appurl, String username, String password){
        driver.get(appurl);
        driver.findElement(By.id("input-email")).sendKeys(username);
        driver.findElement(By.id("input-password")).sendKeys(password);
    }
}
