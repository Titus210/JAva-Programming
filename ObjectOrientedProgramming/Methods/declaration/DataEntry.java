import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int year, month, day;

        displayConfidentialMessage();

        // prompt for year of birth
        System.out.println("Please enter year of birth");

        // get year from user
        year = keyboard.nextInt();

        // prompt for month of birth
        System.out.println("Please enter month of birth");

        // get year from user
        month = keyboard.nextInt();

        // prompt for day of birth
        System.out.println("Please enter day of birth");

        // get day from user
        day = keyboard.nextInt();

    }

    static void displayConfidentialMessage() {
        // Display Confidentiallity message
        System.out.println("Please note that all information supplied is confidential");
        System.out.println("NO personal details will be shared with any third party");

    }
}