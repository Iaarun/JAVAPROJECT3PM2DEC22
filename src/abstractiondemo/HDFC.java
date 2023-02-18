package abstractiondemo;

public class HDFC extends  RBI implements Interface1, Interface2{
    @Override
    public void roi() {
        System.out.println("Home loan intrest 8.5");

    }

    @Override
    public void test1() {
        System.out.println("Method from interface");
    }
}
