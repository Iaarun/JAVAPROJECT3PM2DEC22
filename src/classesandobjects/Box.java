package classesandobjects;
/*
default
non parameterized
parameterized
 */
public class Box {
    int length;
    int width;
    int height;

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

  public  Box(){

        this(12,12,13);
      System.out.println("Non Parameterised");
      System.out.println(this.toString());

    }

    public Box(int length, int width, int height) {
        this.length = length;
       this. width = width;
        this.height = height;
    }



    public static void main(String[] args) {
        Box box = new Box();
//        box.length=150;
//        box.width=100;
//        box.height=150;
        System.out.println(box.toString());

//        Box box2 = new Box(20,30,40);
//        System.out.println(box2.toString());
    }
}
