package basicPackage;

import java.util.Arrays;
import java.util.Locale;

/*
immutable
 */
public class _008String {
    public static void main(String[] args) {
        _008String strobj = new _008String();
        strobj.countspecialCharacter();
    }

    public void StringBasics(){
        /*
         using String literals
         using new keyword
         */

        String str = "Java";
        String str2 = "Java";
        String str4 = "Java1";
        String str3 = new String("Java");
        String str5 = new String("Java");

        if(str3==str5){
            System.out.println("at same add");
        }else{
            System.out.println("at diff add");
        }

      //  System.out.println(str+" Test");

     String  str6= str.concat(" Test");
        System.out.println(str+"\n"+str6);
    }

    public void stringFunctions(){
        String str = "My name is Khan";
        String str1 = "My name is Khan".toLowerCase();
        System.out.println(str.length());

       String tstr= str.trim();
        System.out.println(tstr.length()+"\n"+tstr);

        System.out.println(str.charAt(4));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        str = "My name is Khan";
        System.out.println(str.indexOf('K'));
        System.out.println(str.lastIndexOf('K'));
        System.out.println(str.isEmpty());
      String []sarr=  str.split("is");
        System.out.println(Arrays.toString(sarr));

        System.out.println(str.substring(5));
       // System.out.println(str.substring(0,5));

        // abctest@gmail.com  Hello abctest
        String email="abctest@gmail.com";
        System.out.println(email.substring(0, email.indexOf("@")));

        System.out.println(email.split("@")[0]);
        System.out.println(str.contains("Khan"));
        str = "My name is Khan";
        System.out.println(str.replace("n", "N"));
        System.out.println(str1.compareTo(str));

        System.out.println(Arrays.toString(str.toCharArray()));



    }

    public void countspecialCharacter(){
        String str = "ksjdi59876gf@$JHI$%";
        int count=0;
        for(int i=0; i<str.length(); i++){
            Character ch= str.charAt(i);

            if(Character.isLetter(ch) || Character.isDigit(ch)){

            }else{
               count++;
            }
        }

        System.out.println("Number of special character: "+count);

    }
}
