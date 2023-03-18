package testngPackages;

import org.testng.annotations.Test;

public class TestNgGroupDemo {

    @Test(groups = "regression")
    public void test3(){
        System.out.println("Test3 method");
    }
    @Test(groups = "regression")
    public void test2(){
        System.out.println("Test2 method");
    }
    @Test(groups = "smoke")
    public void test1(){
        System.out.println("Test1 method");
    }
    @Test(groups = "regression")
    public void atest4(){
        System.out.println("Test4 method");
    }
}
