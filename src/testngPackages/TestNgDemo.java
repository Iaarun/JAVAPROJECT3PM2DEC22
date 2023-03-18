package testngPackages;

import org.testng.annotations.Test;

public class TestNgDemo {

    @Test(enabled = false)
    public void test1(){
        System.out.println("Test1 method");
    }

    @Test
    public void test2(){
        System.out.println("Test2 method");
    }

    @Test
    public void test3(){
        System.out.println("Test3 method");
    }
}
