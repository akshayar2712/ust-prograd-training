import java.util.*;

public class Strings {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(List.of("Apple", "Orange", "Banana", "Pomegranate", "Pineapple"));
        System.out.println("Fruits starting with letter P ");
        array.stream()
                .filter(var -> var.startsWith("P"))
                        .forEach(System.out::println);

        System.out.println("Fruits ending with letter e ");
        array.stream()
                .filter(var -> var.endsWith("e"))
                .forEach(System.out::println);



    }
}