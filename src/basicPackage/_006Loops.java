package basicPackage;

import java.util.Scanner;

/*
  for(initialization; condition; increment/decrement){
      code
  }

  intialization;
  while(condition){
    code
    increment/decrement;
  }

 */
public class _006Loops {

    public static void main(String[] args) {
        pattern1();
    }

    public void testDoWhile(){
        int i=3;
        do{
            System.out.println("Hello");
            i++;
        }while(i<2);

    }

    public static void forloopDemo(){
     for(int i=1; i<=5;i= i-1){
         System.out.println("Hello world!!");
         break;
     }
    }
   public static void tableofN(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number");
       int num = sc.nextInt();
       for(int i=1; i<=10; i++){
           System.out.println(num+"*"+i+" = "+(num*i));
       }
   }

   //print even number form 1-100
    public static void evenNumbers(){
        int sum=0;
        for(int i=1; i<=100; i++){
           if(i%2==0){
             sum=  i+sum;
           }
        }
        System.out.println(sum);

    }

    public static void evenNumbersusingWhile(){
        int sum=0;
//        for(int i=1; i<=100; i++){
//            if(i%2==0){
//                sum=  i+sum;
//            }
//        }

        int i=1;
        while(i<=100){
            if(i%2==0){
                sum=  i+sum;
            }
            i++;
        }
        System.out.println(sum);

    }


    public static void nestedForloop(){
        /*
                outerfor loop for rows
          for(initialization; condition; increment/decrement){
                    inner for loop for columns
               for(initialization; condition; increment/decrement){
                    code
             }
        }
         */

        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern1(){
         for(int i=1; i<=4; i++){
            for(int j=i; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


}
