import java.util.Scanner;   

public class VendorMachine {

    public static void main(String[] args) {
        // declare count variables
        int  gumCount = 0, chocolateCount = 0, popcornCount = 0, juiceCount = 0, choice = 0;

        Scanner keyIn = new Scanner(System.in);

        // loop through choices while ite not equal to 6
        do {
            System.out.println("[1] Get Gum");
            System.out.println("[2] Get Chocolate");
            System.out.println("[3] Get Popcorn");
            System.out.println("[4] Get Juice");
            System.out.println("[5] Get Display total");
            System.out.println("[6] Quit");
            System.out.println("Enter Choice");
            choice = keyIn.nextInt();
            switch (choice) {
                case 1:
                    gumCount += 1; // increment gum count
                    gumMessage();
                    break;
                case 2:
                    chocolateCount += 1; // increment gum count
                    chocolateMessage();
                    break;
                case 3:
                    popcornCount += 1; // increment gum count
                    popcornMessage();
                    break;
                case 4:
                    juiceCount += 1; // increment gum count
                    juiceMessage();
                    break;
                case 5:
                    totalItems(gumCount, chocolateCount, popcornCount, juiceCount);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error, options 1-6 only!");

            }
        } while (choice != 6);


    }

    /*
     * Display Messages
     */

    public static void gumMessage() {
        System.out.println("Here is your gum\n");
    }

    public static void popcornMessage() {
        System.out.println("Here is your popcorn\n");
    }

    public static void chocolateMessage() {
        System.out.println("Here is your chocolate\n");
    }

    public static void juiceMessage() {
        System.out.println("Here is your juice\n");
    }

    public static void totalItems(int gum, int chocolate, int popcorn, int juice) {
        System.out.println( "\n********************************");
        System.out.println(gum + " items of gum sold");
        System.out.println(chocolate + " items of chocolate sold");
        System.out.println(popcorn + " items of popcorn sold");
        System.out.println(juice + " items of juice sold");
        System.out.println("********************************\n");
    }
}
