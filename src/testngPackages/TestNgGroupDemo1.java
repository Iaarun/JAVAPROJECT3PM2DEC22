package testngPackages;

import org.testng.annotations.Test;

public class TestNgGroupDemo1 {

    @Test(groups = "smoke")
    public void test5(){
        System.out.println("Test5 method");
    }
    @Test(groups = {"smoke","regression"})
    public void test6(){
        System.out.println("Test6 method");
    }
    @Test(groups = "regression", enabled = false)
    public void test7(){
        System.out.println("Test7 method");
    }
    @Test(groups = "regression")
    public void atest8(){
        System.out.println("Test8 method");
    }
}
