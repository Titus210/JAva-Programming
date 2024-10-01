import java.util.InputMismatchException;
import java.util.Scanner;

public class tempToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the temperature in Celsius:");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + "°C is " + fahrenheit + "°F");
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
}