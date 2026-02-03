import java.io.IOException;

public class Combined {

    static void riskyMethod() throws IOException {
        throw new IOException("Simulated I/O error.");
    }

    public static void main(String[] args) {
        try {
            riskyMethod(); // must be in try because method declares throws
        } catch (IOException e) {
            System.out.println("Caught in main: " + e.getMessage());
        } finally {
            System.out.println("Cleanup actions executed here.");
        }
    }
}
