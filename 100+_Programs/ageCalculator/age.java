import java.util.Scanner;

public class age {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
    System.out.print("Enter your Date of birth: ");;
        int DOB = reader.nextInt();
        int age = 2023 - DOB;
        System.out.println("Your age is: " + age + "  years");
    }
}
