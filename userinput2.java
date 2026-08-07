
import java.util.Scanner;

public class userinput2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter your height:");
        float height = scan.nextFloat();

        System.out.println("Your age: " + age);
        System.out.println("Your height: " + height);

        scan.nextLine(); // Consume the leftover newline

        System.out.println("Enter your full name:");
        String fname = scan.nextLine();

        System.out.println("Full name is: " + fname);

        scan.close();
    }
}
