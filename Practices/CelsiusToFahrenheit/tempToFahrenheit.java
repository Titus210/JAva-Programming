// Write a Java program that converts a temperature from Celsius to Fahrenheit and vice versa.// //////
import java.util.Scanner;

public class tempToFahrenheit{
    public static void main(String[] args){
        // double celsius = 37.5; replace this with getting user input from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is " + fahrenheit + "°F");
    }
}