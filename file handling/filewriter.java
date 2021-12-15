import java.io.*;

public class filewriter {
    public static void main(String[] args)throws IOException {
        FileWriter writer=new FileWriter("C:\\Users\\ACER\\IdeaProjects\\Filehandling\\src\\details", true);
        writer.write("Raj\n");
        writer.write("235609\n");
        writer.write("9999999999\n");
        writer.write("32\n");
        writer.write("HR\n");
        writer.close();
    }
}

