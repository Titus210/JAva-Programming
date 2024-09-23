package Practices.SumofTwo;
import java.util.Scanner; // module to allow user input

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter the first number
        System.out.println("Enter number 1 to sum:");
        int number_1 = scanner.nextInt();

        // prompt user to enter the second number
        System.out.println("Enter number 2 to sum:");
        int number_2 = scanner.nextInt();

        // sum the numbers
        int sum_of_numbers = number_1 + number_2;

        // print the sum
        System.out.println("The sum of " + number_1 + " and " + number_2 + " is " + sum_of_numbers);
    }
}
