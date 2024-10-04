// - [ ] Implement a simple calculator that takes two numbers and an operator (+, -, *, /) as input, then prints the result.
// - [ ] The program should handle invalid input by displaying an error message and asking the user to enter valid input.
// - [ ] The program should include methods to perform addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter the operator (+, -, *, /):");
                String operator = scanner.next();
                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();
                
                double result = calculate(num1, operator, num2);
                
                System.out.println("Result: " + result);
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number and operator.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
    
    public static double calculate(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}