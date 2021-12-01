import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet();
        hs.add(10);
        hs.add(15);
        hs.addAll(List.of(3,6,9));
        hs.add(15);
        System.out.println(hs);


    }
}
