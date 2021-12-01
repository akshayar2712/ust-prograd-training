import java.util.HashSet;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        HashSet<Integer> details1=new HashSet();
        HashSet<Integer> details2=new HashSet(List.of(01,15,22,38));
        details1.add(03);
        details1.add(01);
        details1.add(38);
        details1.add(45);
        System.out.println("Reg number of students who completed coding test: ");
        System.out.println(details1);
        System.out.println("Reg number of students who completed communication assessment: ");
        System.out.println(details2);

    }
}
