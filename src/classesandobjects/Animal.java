package classesandobjects;

public class Animal {

    String breed;
    String color;
    String name;
    int age;
  //accessmodifier static/nonstatic returntype identifier
    public void sound(String name, String sound){
        System.out.println(name+ " does "+sound);
    }


    public void run(){
        System.out.println("Animal run");
    }

    public void run(String name, String speed){
        System.out.println(name+"runs "+speed+ "speed");
    }




    public static void main(String[] args) {
        Animal dog = new Animal();

        Animal cat = new Animal();

        dog.breed="german shpherd";
        dog.age = 10;
        cat.age=5;

//        cat.run();
//        dog.run();

        dog.name="tommy";

        cat.name="meny";

        cat.run(cat.name, "slow");
        dog.run(dog.name, "fast");

        cat.sound(cat.name, "meow");
        dog.sound(dog.name, "woof");
    }
}




