// - [ ] Write a program that calculates the compound interest for a given principal, rate, and time.
// - [ ] The program should prompt the user to enter the principal amount, annual interest rate, and the number of years.
// - [ ] The program should output the total amount after the specified number of years.
// - [ ] The program should include a method to calculate the compound interest.
// - [ ] The program should handle invalid input by displaying an error message and asking the user to enter valid input.

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the principal amount:");
                double principal = scanner.nextDouble();
                System.out.println("Enter the annual interest rate:");
                double rate = scanner.nextDouble();
                System.out.println("Enter the number of years:");
                int years = scanner.nextInt();
                
                double totalAmount = calculateCompoundInterest(principal, rate, years);
                
                System.out.println("Total amount after " + years + " years: " + totalAmount);
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
    
    public static double calculateCompoundInterest(double principal, double rate, int years) {
        double amount = principal * Math.pow(1 + rate / 100, years);
        return amount;
    }
}