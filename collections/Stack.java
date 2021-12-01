import java.util.Stack;

public class Books {
    public static void main(String[] args) {
        Stack<String> book=new Stack();
        book.push("OOPs");
        book.push("DS");
        book.push("Java");
        book.push("Python");

        System.out.println(book);
        System.out.println(book.peek());
        book.pop();
        System.out.println(book.indexOf("Java"));
    }
}
