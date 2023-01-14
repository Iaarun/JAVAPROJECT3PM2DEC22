package basicPackage;

/**
 local
 instance
 class
 */
public class _001Variables {
    //instance variable
    // create different copies for different object
    String name;
    //class variable
   static String courseName;
    public static void main(String[] args) {
       //object of class
        _001Variables obj1 = new _001Variables();

        _001Variables obj2  = new _001Variables();

        obj1.name="Arun";
        obj2.name="Arun";
        courseName="Selenium";
        obj1.name="Ganesh";
        courseName="Java";
        System.out.println(obj1.name);//Ganesh
        System.out.println(courseName); //Selenium
        System.out.println(obj2.name); //Arun
        System.out.println(courseName); //selenium

    }

    public static void testMethod(){

        // datatype identifer = value
        //declaration of variable
        //initialization
        int age = 20;

        System.out.println(age);
        //initialization of variable
        //local variable
        String name= "Java";

    }


}


