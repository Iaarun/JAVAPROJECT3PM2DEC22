package selScripts;

import org.testng.annotations.*;

public class SelTestNGDemo {

    @BeforeMethod
    public void launchbrowser(){
        System.out.println("Launch browser");
    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("close Browser");
    }
    @Test
    public void addtocart(){
        System.out.println("Test 1 Method");
    }

    @Test
    public void login(){
        System.out.println("Test Login");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("after Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after Test");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("Before class");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("After class");
    }
}

