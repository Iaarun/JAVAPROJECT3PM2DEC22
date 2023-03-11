package selScripts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SelScripts {
    WebDriver driver;

 //   ChromeDriver driver;
    public static void main(String[] args) throws InterruptedException, IOException {
        SelScripts  ss = new SelScripts();
        ss.launchBrowsers("firefox");
        ss.multipleWindows();
      //  ss.closeBrowser();
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

    public void selFunctions(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
       WebElement disabledInput=  driver.findElement(By.name("my-disabled"));
        System.out.println(disabledInput.isEnabled());


      WebElement checkbox=  driver.findElement(By.id("my-check-1"));
        System.out.println(checkbox.isSelected());

      WebElement colors=  driver.findElement(By.name("my-colors"));
        System.out.println(colors.isDisplayed());
    }
    public void handlemultipleCheckbox(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

     List<WebElement> checkboxes= driver.findElements(By.name("my-check"));

     checkboxes.forEach(x->{
         if(!x.isSelected()){
             x.click();
         }
     });
    }

    public void handleAlerts(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
     WebElement prompt=   driver.findElement(By.id("my-prompt"));
     prompt.click();
    Alert alert= driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Java Test");
        alert.accept();

     String text=   driver.findElement(By.id("prompt-text")).getText();
        System.out.println(text);
    }

    public void handleModalWindow() throws IOException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
      WebElement modalwindow=  driver.findElement(By.id("my-modal"));

      modalwindow.click();
      WebElement save= driver.findElement(By.cssSelector(".btn.btn-primary.model-button"));
       save.click();
      // capture screenshot
      File file=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("D:\\screenshot\\save.png"));

        file= save.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("D:\\screenshot\\savebtn.png"));
    }

    public void handleDropdowns() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
      WebElement dd=  driver.findElement(By.name("my-select"));

        Select select =  new Select(dd);

        //default selected value in the dropdown
        System.out.println(select.getFirstSelectedOption().getText()+"\n======");
         // to check is dropdown supporting multiple selection
        System.out.println(select.isMultiple());
        //to check available option in drop down
        List<WebElement> alloption= select.getOptions();
        System.out.println("Number of elements "+alloption.size());

        alloption.forEach(x->{
            System.out.println(x.getText());
        });

        select.selectByValue("1");
        Thread.sleep(1000);
        select.selectByVisibleText("Three");
        Thread.sleep(1000);
        select.selectByIndex(0);


        //formultiple selection dropdown

    }

    public void handleFrame(){
        driver.get("https://jqueryui.com/droppable/");
        //switch to frame
        driver.switchTo().frame(0);
        WebElement drag=  driver.findElement(By.id("draggable"));
        System.out.println(drag.isDisplayed());

        driver.switchTo().defaultContent();
      WebElement img=  driver.findElement(By.xpath("//a[@href='/']"));
        System.out.println(img.isDisplayed());

    }

    public void draganddrop(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
       WebElement drag= driver.findElement(By.id("draggable"));
       WebElement drop= driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        //action.clickAndHold(drag).moveToElement(drop).release().build().perform();
        action.dragAndDrop(drag, drop).perform();

        //mousehover  movetoelement()
    }

    public void slider(){
        driver.get("https://jqueryui.com/slider/");
        driver.switchTo().frame(0);
     WebElement slider=   driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

     Actions action = new Actions(driver);
     action.clickAndHold(slider).moveByOffset(500,0).release().build().perform();
        action.clickAndHold(slider).moveByOffset(-500,0).release().build().perform();
    }

    public void contextclickanddoubleclick(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
     WebElement dd2=   driver.findElement(By.xpath("//button[@id='my-dropdown-2']"));

     Actions action =  new Actions(driver);
     action.contextClick(dd2).perform();

    WebElement menu2= driver.findElement(By.xpath("//ul[@id='context-menu-2']//a[@class='dropdown-item'][normalize-space()='Something else here']"));
      action.moveToElement(menu2).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).click().build().perform();
    }

    public void autosuggestion() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("test");
        List<WebElement> option = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));

        option.forEach(x -> {
            if (x.getText().equals("testbook")) {
                x.click();
            }
        });
    }

    public void opennewTab(){
        driver.get("https://www.google.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
    }

    public void multipleWindows(){
        driver.get("https://www.naukri.com/");
       String tab1= driver.getWindowHandle();
        System.out.println(driver.getCurrentUrl());

       driver.findElement(By.xpath("//div[normalize-space()='Services']")).click();

      Set<String> alltabs= driver.getWindowHandles();

      alltabs.forEach(x->{
          if(!x.equals(tab1)){
              driver.switchTo().window(x);
              System.out.println(driver.getCurrentUrl());
              driver.close();
          }
      });

      driver.switchTo().window(tab1);
        System.out.println(driver.getCurrentUrl());
    }
}
