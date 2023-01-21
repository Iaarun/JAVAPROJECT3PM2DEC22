package basicPackage;

public class _005Operators {
    public static void main(String[] args) {
        ternaryOperator();
    }

    public static void arithmaticoperator(){
        // + * - / %
        // Assignment =
        int  a= 25;
        int b = 10;
        System.out.println(a+b);//35
        System.out.println(a-b);//15
        System.out.println(a*b);//250
        System.out.println(a/b);//2
        System.out.println(a%b);//5
    }

    public static void comparisonOperator(){
        // ==   !=  > < >= <=
        int a=25, b=10;
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a>b); //true
        System.out.println(a>=b); //true
        System.out.println(a<b); //false
        System.out.println(a<=b);//false

    }

    public static void logicaloperator(){
        // &&  ||
        int a=25;
        int b=10;
        System.out.println((a>b)&& (b<a));//true
        System.out.println((a==b)&& (b<a));//false
        System.out.println((a==b) || (b<a));//true
    }

    public static void ternaryOperator(){
        //(condition)? expression1:expression2
             int a = 20;
        System.out.println((a%2==0)?"even":"odd");
    }
}
