import java.util.Vector;

public class Fruits {
    public static void main(String[] args){
        Vector<String> fruits=new Vector<String>(10);
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.addElement("banana");
        System.out.println(fruits);
        System.out.println(fruits.removeElement("banana"));
        fruits.forEach(fru -> System.out.println(fru));
    }
}