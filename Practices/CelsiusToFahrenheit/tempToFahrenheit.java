// Write a Java program that converts a temperature from Celsius to Fahrenheit and vice versa.// //////
public class tempToFahrenheit{
    public static void main(String[] args){
        double celsius = 37.5;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is " + fahrenheit + "°F");
    }
}