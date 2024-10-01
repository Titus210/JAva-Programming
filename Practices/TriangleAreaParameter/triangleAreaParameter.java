// - [ ] Write a program that calculates the area and perimeter of a rectangle using variables for length and width.
// - [ ] The program should prompt the user to enter the length and width of the rectangle.
// - [ ] The program should output the area and perimeter of the rectangle.
// - [ ] The program should include methods to calculate the area and perimeter of the rectangle.
// - [ ] The program should handle invalid input by displaying an error message and asking the user to enter valid input.

import java.util.Scanner;

public class triangleAreaParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the base of the triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = scanner.nextDouble();
                
                double area = calculateArea(base, height);
                double perimeter = calculatePerimeter(base, height);
                
                System.out.println("The area of the triangle is " + area);
                System.out.println("The perimeter of the triangle is " + perimeter);
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
    // Area of a triangle = 0.5 * base * height
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Perimeter of a triangle = base + height + hypotenuse
    public static double calculatePerimeter(double base, double height) {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;  
    }
}