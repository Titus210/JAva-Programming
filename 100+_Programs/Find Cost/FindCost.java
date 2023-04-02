import java.util.Scanner;
/* Program to input initial price of product
 * Calculate tax added
 * Display cost after tax
 */

public class FindCost {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);

        double price, tax;

        System.out.println("*** Product Price Check ***");
        //  Prompt to enter initial price
        System.out.println("Enter initial price of product");
        price = keyin.nextInt();

        //  Prompt to enter Tax
        System.out.println("Enter tax of product");
        tax = keyin.nextInt();

        // calculate tax
       price = calculateTax(tax, price);
       System.out.println("Cost after tax : " + price);
    }

    static double calculateTax(double taxIn, double priceIn) {
        return priceIn * (1 + taxIn / 100);

    }
}