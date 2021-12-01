import java.util.LinkedList;

public class Attendence {
    public static void main(String[] args){
        LinkedList<Integer> rollno=new LinkedList();
        rollno.add(01);
        rollno.add(02);
        rollno.add(03);
        rollno.add(04);
        System.out.println("Reg no of students: ");
        System.out.println(rollno);
        System.out.println("Reg no 03 is absent");
        rollno.remove(2);
        rollno.forEach(present -> System.out.println(present));
    }
}
