import java.util.*;

public class Shirts {
    public static void main(String args[]) {
        TreeMap<Integer, String> map=new TreeMap<>();
        map.put(1000, "Peter England Shirts");
        map.put(800, "Louis Phillipe Shirts");
        map.put(2000, "Adidas Shirts");
        map.put(1800, "Park Avenue Shirts");

        for(Map.Entry<Integer, String> m:map.entrySet()) {
            System.out.println(m.getKey()+ " "+m.getValue());
        }

        System.out.println("headmap: "+map.headMap(1800));


    }
}