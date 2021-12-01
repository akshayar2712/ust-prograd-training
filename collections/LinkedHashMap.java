import java.util.*;

public class Plusone {
    public static void main(String args[]) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
         map.put(001, "Anu");
         map.put(002, "Remya");
         map.put(003, "Teena");

         for (Map.Entry<Integer, String> m : map.entrySet()){
             System.out.println(m.getKey() + " " + m.getValue());
         }

    }
}
