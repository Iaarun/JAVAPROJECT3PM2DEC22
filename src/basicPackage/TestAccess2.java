package basicPackage;

import classesandobjects.AccessmodifiersDemo;

public class TestAccess2  extends AccessmodifiersDemo{

    public static void main(String[] args) {
        AccessmodifiersDemo ad2 = new AccessmodifiersDemo();
        TestAccess2 ta2 = new TestAccess2();
        ta2.test1();
        ta2.test2();
    }

    public static  void main(int[] args) {
        AccessmodifiersDemo ad2 = new AccessmodifiersDemo();
        TestAccess2 ta2 = new TestAccess2();
        ta2.test1();
        ta2.test2();
    }
}
