package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMapDemo hdemo= new HashMapDemo();
        hdemo.hmapIterate();
    }

    public void hashmapdemo(){
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(101, "Java");
        hmap.put(102, "Java");
        hmap.put(103, "Python");
        hmap.putIfAbsent(104,"javaScript");

        System.out.println(hmap);

        System.out.println(hmap.get(101));
        System.out.println(hmap.getOrDefault(105, "TestData"));

        hmap.size();
        hmap.isEmpty();
        System.out.println(hmap.containsKey(101));
        System.out.println(hmap.containsValue("Test7"));
        hmap.replace(102,"Groovy");
        System.out.println(hmap);
    }


    public void hmapIterate(){
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(101, "Java");
        hmap.put(102, "Java");
        hmap.put(103, "Python");
        hmap.putIfAbsent(104,"javaScript");

        //iterate overkeys
        System.out.println("====Iterate over keys====");
        for(Integer a: hmap.keySet()){
            System.out.println(a);
        }

        System.out.println("====Iterate over values====");

        for(String v: hmap.values()){
            System.out.println(v);
        }
        System.out.println("====Iterate over Key value pair====");

        for( Map.Entry<Integer, String> entry : hmap.entrySet()){
            System.out.println(entry.getKey()+" >>>> "+entry.getValue());
        }

        System.out.println("====Iterate using foreach function with lmbda====");

        hmap.forEach((x,y)->{
            System.out.println(x+"||"+y);
                }
        );

        System.out.println("====Iterate using iterator====");

         Iterator<Map.Entry<Integer, String>>it=   hmap.entrySet().iterator();
         while(it.hasNext()){
             Map.Entry entry=  it.next();
             System.out.println(entry.getKey()+" >"+entry.getValue());
         }
    }
}
