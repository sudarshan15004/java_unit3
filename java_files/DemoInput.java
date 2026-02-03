import java.util.Scanner;

public class DemoInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("You entered: " + x);
        sc.close();
    }
}
