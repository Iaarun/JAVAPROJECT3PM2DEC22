package polymorphismdemo;

public class Calculator {

    public static void add (int a, int b){
        System.out.println("Add two integer number");
    }

    public static void add (int a, int b, int c){
        System.out.println("Add three integer number");
    }

    private void add (double a, double b){
        System.out.println("Add two double number");
    }

    public void add (int a, double b){
        System.out.println("Add int & double number");
    }

    public void add (double a, int b){
        System.out.println("Add  double & int number");
    }

    public void test1(){
        System.out.println("Inside calculatior class function");
    }

    public static void test2(){
        System.out.println(" Test 2 Inside calculatior class function");
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10,15.0);
    }
}
