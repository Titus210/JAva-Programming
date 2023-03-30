import java.util.Scanner;

public class pattern {

    // prompt user to enter number of half diamond
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        int halfPattern = 7;
        String str = "*";
        for (int i = 1; i <= halfPattern * 2; i = i + 2) {
            System.out.println(str.repeat(i));
            if (i == halfPattern) {
                for (int j = halfPattern; j >= 1; j--) {

                    System.out.println(str.repeat(j));
                }
                break;
            }

        }

    }
}
