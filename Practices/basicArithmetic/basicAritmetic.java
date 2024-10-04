// Write a Java program that takes two numbers as input and prints the result of adding, subtracting, multiplying, and dividing them.
// The program should include methods to perform each operation.
// The program should handle invalid input by displaying an error message and asking the user to enter valid input.
// The program should output the results of the operations in the following format:

import java.util.Scanner;

public class basicAritmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();
                
                double sum = add(num1, num2);
                double difference = subtract(num1, num2);
                double product = multiply(num1, num2);
                double quotient = divide(num1, num2);
                
                System.out.println("Sum: " + sum);
                System.out.println("Difference: " + difference);
                System.out.println("Product: " + product);
                System.out.println("Quotient: " + quotient);
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}