package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSetDemo hd = new HashSetDemo();
        hd.iterateset();
    }

    public void hashSetbasic(){
   //     HashSet<String> hset = new HashSet<>();
   //     LinkedHashSet<String> hset = new LinkedHashSet<>();
        TreeSet<String> hset = new TreeSet<>();
        hset.add("Test1");
        hset.add("Test4");
        hset.add("Test2");
        hset.add("Test3");
        hset.add("Test3");
        System.out.println(hset.size());
        System.out.println(hset.isEmpty());
        System.out.println(hset.remove("Test3"));
        System.out.println( hset.contains("Test3"));
        System.out.println(hset.first());
        System.out.println(hset);
        System.out.println(hset);

    }

    public void iterateset(){
        TreeSet<String> hset = new TreeSet<>();
        hset.add("Test1");
        hset.add("Test4");
        hset.add("Test2");
        hset.add("Test3");


        System.out.println("====using enhance for loop====");

        for(String a: hset){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("====using foreach fucntion with lamda====");
        hset.forEach(x->{
            System.out.print(x+" ");
        });

        System.out.println();
        System.out.println("====using stream API====");
        hset.stream().forEach(x->{
            System.out.print(x+" ");
        });

        System.out.println();
        System.out.println("====using Iterator====");

          Iterator<String> it= hset.iterator();
          while(it.hasNext()){
              System.out.print(it.next()+" ");
          }
    }
}
