import java.util.Scanner;

public class TimetableWithLoop {
    public static void main(String[] args) {
        char  response, groupLetter;
        int groupNo = 5, i;

        Scanner keyIn = new Scanner(System.in);

        System.out.println("******** Lab Hours *****");
        // select choice

        for (i = 1; i <= groupNo; i++) {
            if (i == 1) {
                groupLetter = 'A';
            } else if (i == 2) {
                groupLetter = 'B';
            } else if (i == 3) {
                groupLetter = 'C';
            } else if (i == 4) {
                groupLetter = 'D';
            } else
                groupLetter = 'E';

            System.out.println(i + " GROUP " + groupLetter);
        }
        System.out.println("Enter group Choice: 1,2,3,4,5\n");
        response = keyIn.next().charAt(0);

        // get time table
        switch (response) {
            case '1':
                System.out.println("10.00 am");
                break;
            case '2':
                System.out.println("12.00 pm");
                break;
            case '3':
                System.out.println("2.00 pm");
                break;
            case '4':
                System.out.println("4.00 pm");
                break;
            case '5':
                System.out.println("6.00 pm");
                break;
            default:
                System.out.println("Enter number between 1 - 5 ");
        }
    }
}
