package testngPackages;

import org.testng.annotations.Test;

public class TestNgBasicAttributeDemo {

    @Test(invocationCount = 0)
    public void test3()
    {
        System.out.println("Test3 method");
    }
    @Test
    public void test2()
    {
        System.out.println("Test2 method");
    }
    @Test
    public void test1(){
        System.out.println("Test1 method");
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void atest4(){
        System.out.println("Test4 method");
        System.out.println(5/0);

    }
}
