// - [ ] Create a program that checks if a number is even or odd using the modulus operator.
// - [ ] The program should prompt the user to enter a number.
// - [ ] The program should output whether the number is even or odd.
// - [ ] The program should handle invalid input by displaying an error message and asking the user to enter valid input.

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a number:");
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
}