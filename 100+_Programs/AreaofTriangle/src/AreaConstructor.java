
import java.util.Scanner;

/**
 * Calculating area of Triangle Using Constructor
 *
 */
class AreaOfTriangle {

    long area;

    AreaOfTriangle(long b, long h) {
        area = (b * h) / 2;
    }
}

class AreaConstructor {

    public static void main(String args[]) {
        Scanner keyIn = new Scanner(System.in);

        // Prompt to enter Width
        System.out.println("Enter Width of Triangle");
        long b = keyIn.nextLong();

        System.out.println("Enter Height of Triangle");
        long h = keyIn.nextLong();

        AreaOfTriangle Area1 = new AreaOfTriangle(b, h);
        System.out.println("The area of triangle is " + Area1.area);
    }

}
