import java.util.ArrayDeque;
import java.util.ArrayList;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        ArrayDeque<Integer> dq = new ArrayDeque();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.addFirst(40);
        System.out.println(dq.peek());
        System.out.println(dq.poll());
        System.out.println(dq);
    }
}