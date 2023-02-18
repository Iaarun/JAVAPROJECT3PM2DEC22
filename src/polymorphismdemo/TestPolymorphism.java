package polymorphismdemo;

public class TestPolymorphism {
    public static void main(String[] args) {
        ScientificCalculator sc =  new ScientificCalculator();
        sc.test1();

        Calculator cal = new Calculator();
        cal.test1();

        Calculator cal1 = new ScientificCalculator();
        cal1.test1();
        cal1.test2();
    }
}
