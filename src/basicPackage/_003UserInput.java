package basicPackage;

import java.util.Scanner;

public class _003UserInput {

    public static void main(String[] args) {
        test();

    }

    public static void test(){
        int a=10;
        double b =25;

        double res = (a+b)/(a-b);
        System.out.println(res);
    }

    public static void userinput(){
        Scanner in = new Scanner(System.in);
      //  Scanner sc = new S
        System.out.println("Enter name");

        String name= in.next();
        System.out.println("Enter age ");
        int age = in.nextInt();

        System.out.println("Are you coming to party");
        boolean flag = in.nextBoolean();

        System.out.println("Enter any character");
        char ch =in.next().charAt(0);

        System.out.println("Name "+name+" and age is "+age+ "\n coming to party "+flag);


    }
}
