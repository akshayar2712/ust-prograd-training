import java.util.ArrayList;
import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<String> menu=new ArrayList();
        menu.add("Coffee");
        menu.add("Tea");
        menu.add("Burger");
        menu.add("Sandwich");
        System.out.println("Menu: ");
        System.out.println(menu);
        System.out.println("Needed items: ");
        String item=sc.next();
        if(menu.contains(item))
        {
            System.out.println(item + " is available");
        }
        else
        {
          System.out.println(item + " is not available");
        }

    }
}