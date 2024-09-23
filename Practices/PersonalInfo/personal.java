package Practices.PersonalInfo;
import java.util.Scanner;

public class personal {
    public static void main(String[] args) {
        // Create a single Scanner object
        Scanner scanner = new Scanner(System.in);

        // get user input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // get age input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // get hobby input
        System.out.println("Enter your hobby: ");
        String hobby = scanner.nextLine();

        // Close the scanner
        scanner.close();

        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I enjoy " + hobby + ".");
    }
}