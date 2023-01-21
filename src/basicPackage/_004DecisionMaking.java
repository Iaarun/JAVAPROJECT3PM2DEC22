package basicPackage;


import java.util.Locale;
import java.util.Scanner;

/**
 if(condition){
  code
 }
 */
/*

 */
public class _004DecisionMaking {

    public static void main(String[] args) {
        switchCasedemo();
    }

    public static void isEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();

        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }

    public static void ifCondtion(){
        int age=17;

        if(age>=18){
            System.out.println("allowed to work");
        }else{
            System.out.println("not allowed to work");
        }
    }

    public static void nestedIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age= sc.nextInt();

        if(age>=18){
            System.out.println("have you cleared the test");
            String res= sc.next();
            if(res.equalsIgnoreCase("yes")){
                System.out.println("Assign the license");
            }else{
                System.out.println("clear the test first");
            }

        }else {
            System.out.println("Minors not allowed to have license");
        }
    }

    public static  void ladderif(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check signal");

        String signalVal= sc.next();

        if(signalVal.equalsIgnoreCase("red")){
            System.out.println("STOP");
        }
        else if (signalVal.equalsIgnoreCase("green")){
            System.out.println("GO");
        }else  if(signalVal.equalsIgnoreCase("yellow")){
            System.out.println("WAIT");
        }else{
            System.out.println("Signal not working");
        }
    }

    public static void switchCasedemo(){
        /*
        swtich(expression){
        case 1:
                 code;
                 break;
        default:
             code;

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Check signal");

        String signalVal= sc.next();
        switch (signalVal.toLowerCase()){
            default:
                System.out.println("signal not working");
                break;
            case "green":
                System.out.println("GO");
                break;
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("wait");
                break;

        }

    }
}
