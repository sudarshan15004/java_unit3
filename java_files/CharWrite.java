import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("text.txt");
        fw.write("Welcome to Java File Handling");
        fw.close();
        System.out.println("Text written using character stream");
    }
}
