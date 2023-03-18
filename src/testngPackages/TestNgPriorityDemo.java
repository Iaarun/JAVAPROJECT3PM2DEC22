package testngPackages;

import org.testng.annotations.Test;

public class TestNgPriorityDemo {

    @Test(priority = 1)
    public void test3(){
        System.out.println("Test3 method");
    }
    @Test(priority = 3)
    public void test2(){
        System.out.println("Test2 method");
    }
    @Test(priority = 2)
    public void test1(){
        System.out.println("Test1 method");
    }
    @Test (priority = -3)
    public void atest4(){
        System.out.println("Test4 method");
    }
}
