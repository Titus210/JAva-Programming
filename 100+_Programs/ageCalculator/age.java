import java.util.Scanner;
import java.util.Calendar;
import java.sql.Date;

public class age {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your Date of birth: ");

        int DOB = reader.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - DOB;
        System.out.println("Your age is: " + age + "  years");
    }
}
