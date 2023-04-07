
package areaoftriangle;

// import Scanner Library
import java.util.Scanner;

public class AreaofTriangle {


    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        
        // Prompt to enter Width
        System.out.println("Enter Width of Triangle");
        double b = keyIn.nextDouble();
        
        System.out.println("Enter Height of Triangle");
        double h = keyIn.nextDouble();
        
        /*
        * AREA OF TRIANGLE FORMULA
        * area = (b*h)/2
        */
        double area = (b*h)/2;
        System.out.println("Area of triangle is: " + area);
        
    }
    
}
