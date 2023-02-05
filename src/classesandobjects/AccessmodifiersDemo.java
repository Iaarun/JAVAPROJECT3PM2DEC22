package classesandobjects;
/*
public -
protected
default
private
 */

public  class AccessmodifiersDemo {
    static  String testVar1;
    String testvar2;

    public void test1(){
        System.out.println("Public test1 method");
    }

    protected void test2(){
        System.out.println("protected test2 method");
    }

     void test3(){
        System.out.println("default test3 method");
    }
    private void test4(){
        System.out.println("private test4 method");
    }

    public static void test5(){
        System.out.println("static test5 method");
    }


    public static void main(String[] args) {
        AccessmodifiersDemo adm = new AccessmodifiersDemo();
        adm.test1();
        adm.test2();
        adm.test3();
        adm.test4();
        AccessmodifiersDemo.test5();
    }


}
