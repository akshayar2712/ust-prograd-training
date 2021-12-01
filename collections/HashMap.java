import java.util.*;

public class Plustwo {
    public static void main(String args[]) {
        Map<Integer, String> map =  new HashMap<>();
        map.put(001, "Abijith");
        map.put(002, "Kiran");
        map.put(003, "Ram");
        map.put(004, "Sachin");
        System.out.println(map);

        map.putIfAbsent(003, "Rahul");
        map.remove(002);
        System.out.println(map);



    }
}