import java.util.PriorityQueue;

public class Railwayticket {
    public static void main(String[] args) {
        PriorityQueue people = new PriorityQueue(10);
        System.out.println(people);
        System.out.println("Tickets that people took");

        for(int i=1;i<=10;i++)
        {
          people.add(i);
        }
        System.out.println(people);
        people.poll();
        if(people.size()==10)
        {
            System.out.println("Ticket booking is closed");
        }
        else
        {
            System.out.println("Bookings are open");
        }
        System.out.println(people.poll());
    }
}
