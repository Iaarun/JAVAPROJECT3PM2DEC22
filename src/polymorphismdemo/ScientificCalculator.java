package polymorphismdemo;

public class ScientificCalculator extends Calculator {
    @Override
    public void test1() {

        System.out.println("Inside scientificCalculator class");
    }

    public static void test2(){
        System.out.println(" Test 2 Inside scientificCalculator class function");
    }
}
