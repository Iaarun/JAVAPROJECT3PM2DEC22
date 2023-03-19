package testngPackages;

import org.testng.annotations.Test;

public class TestNgdependencyDemo {

    @Test
    public void test3(){
        System.out.println("Test3 method");
    }
    @Test(dependsOnMethods = "atest4",alwaysRun = true)
    public void test2(){
        System.out.println("Test2 method");
    }

    @Test
    public void atest4(){
        System.out.println(5/0);
        System.out.println("Test4 method");
    }
}
