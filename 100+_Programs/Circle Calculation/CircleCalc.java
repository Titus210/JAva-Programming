import java.util.Scanner;

/* This shows how methods can be used for menu driven programs */

public class CircleCalc {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        /* Local scope variables */
        double radius = -999; // dummy value to show not entered
        char choice; // store menu choice
        int i;
        String name, nameOption = "Display";
        do {
            System.out.println();
            System.out.println("*** CIRCLE RADIUS ****");
            for (i = 1; i <= 3; i++) {
                if (i == 1) {
                    name = "radius";
                    nameOption = "Enter";
                } else if (i == 2) {
                    name = "circumference";
                } else {
                    name = "area";
                }
                System.out.println("[" + i + "]" + nameOption + "the " + name + "  of the circle");
            }

            System.out.println("Enter choice 1,2,3,4");
            choice = keyIn.next().charAt(0);

            switch (choice) {
                case '1':
                    radius = getRadius();
                    break;
                case '2':
                    displayArea(radius);
                    break;
                case '3':
                    displayCircumference(radius);
                    break;
                case '4':
                    break;
                default:
                    System.out.println("Enter no from 1 -4\n ");
            }
        } while (choice != 4);

    }

    // option to get radius of circle
    static double getRadius() {
        double myRadius;
        Scanner keyIn = new Scanner(System.in);
        ;
        return myRadius = keyIn.nextDouble(); // return radius entered by user
    }

    // calculate and Display the area
    static void displayArea(double rad) {
        if (rad == -999) {
            System.out.println("Radius has not been entered");
            getRadius();
        } else {
            double area;
            area = 3.1416 * rad * rad;
            System.out.println("The Area is " + area);
        }
    }

    // calculate and Display the Circumference
    static void displayCircumference(double rad) {
        if (rad == -999) {
            System.out.println("Radius has not been entered");
            getRadius();
        } else {
            double circumference;
            circumference = 2 * 3.1416 * rad;
            System.out.println("The Circumference is " + circumference);
        }
    }
}