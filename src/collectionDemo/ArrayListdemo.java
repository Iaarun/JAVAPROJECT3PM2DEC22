package collectionDemo;

import java.util.*;

public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayListdemo lidemo =  new ArrayListdemo();
        lidemo.iterateList();
    }

    public void wrapperdemo(){
        int a = 10;
        //autoboxing
        Integer a1 = new Integer(a);

     //unboxing
        int b = a1;
    }

    public void arraylistbasic(){
        //load factor 0.75
        ArrayList<String> li = new ArrayList();
        li.add("Test3");
        li.add("Test1");
        li.add("Test4");
        li.add("Test2");



        System.out.println(li.size());
        System.out.println(li.get(0));
        System.out.println(li.get(li.size()-1));

      //  li.add(0,"Test5");
       // li.set(1, "Test7");

        System.out.println(li);

      //  li.clear();

    //    System.out.println(li.remove("Test71"));
    //    System.out.println(li.remove(7));

      //  System.out.println(li);
        System.out.println(li.contains("Test1"));
        Collections.sort(li);
        System.out.println(li);
        li.sort(Collections.reverseOrder());
        System.out.println(li);

        ArrayList<String> li1 = new ArrayList();
        li1.add("Test31");
        li1.add("Test11");
        li1.add("Test41");
        li1.add("Test21");

        li.addAll(0,li1);
        System.out.println(li);

        System.out.println(li.containsAll(li1));

        //convert array to arraylist
        String[] arr= {"arr1", "arr2", "arr3"};

         List<String> li2= Arrays.asList(arr);

         li.addAll(li2);
        System.out.println(li);

    }

    public void iterateList(){
        ArrayList<String> li1 = new ArrayList();
        li1.add("Test31");
        li1.add("Test11");
        li1.add("Test41");
        li1.add("Test21");
        li1.add("Test21");
        li1.add("Test21");

        System.out.println("====using for loop====");
        for(int i=0;i<li1.size(); i++){
            System.out.print(li1.get(i)+" ");
        }
        System.out.println();
        System.out.println("====using enhance for loop====");
        for(String x:li1){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println("====using for each with lambda====");

        li1.forEach(ele ->{
            System.out.print(ele+" ");
        });
        System.out.println();
        System.out.println("====using with streamAPI====");
        li1.stream().forEach(ele ->{
            System.out.print(ele+" ");
        });

        System.out.println();
        System.out.println("====using iterator====");
            Iterator<String> it= li1.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

        System.out.println();
        System.out.println("====using list iterator====");
       ListIterator<String> lit=  li1.listIterator(3);
       while(lit.hasPrevious()){
           System.out.println(lit.previous());
       }





//        ArrayList<Integer> li = new ArrayList<>();
//        li.add(12);
//        li.add(13);
//        li.add(14);
//        li.add(15);
//
//        li.forEach(x->{
//            if(x%2==0)
//                System.out.println(x);
//        });
    }
}
