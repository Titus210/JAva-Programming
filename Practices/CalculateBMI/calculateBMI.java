// - Create a program that takes a user’s height in meters and weight in kilograms and calculates their Body Mass Index (BMI).
// - The formula for BMI is weight (kg) / (height (m) * height (m))
// - The program should output the user’s BMI and tell them whether they are underweight, normal, or overweight.
// - The program should also include a method that converts pounds to kilograms and a method that converts feet and inches to meters.

import java.util.Scanner;

public class calculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter your weight in kilograms:");
                double weight = scanner.nextDouble();
                System.out.println("Enter your height in meters:");
                double height = scanner.nextDouble();
                double bmi = calculateBMI(weight, height);
                System.out.println("Your BMI is " + bmi);
                System.out.println("You are " + getBMICategory(bmi));
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi < 25) {
            return "normal";
        } else {
            return "overweight";
        }
    }
}