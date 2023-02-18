package abstractiondemo;

public class TestAbs {
    public static void main(String[] args) {
//        RBI rbi = new RBI() {
//            @Override
//            public void roi() {
//
//            }
//        };

        HSBC hsbc= new HSBC();
        hsbc.roi();

        HDFC hdfc = new HDFC();
        hdfc.roi();

      //  Interface1.num1=30;
        System.out.println(Interface1.num1);
    }
}
