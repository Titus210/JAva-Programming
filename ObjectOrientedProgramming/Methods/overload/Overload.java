public class Overload{
    // main method
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        double c = 4.4;
        double d = 2.4;

        // call function by value
        int intResult = minFunction(a, b);
        double doubleResult = minFunction(c,d);

        //  print results
        System.out.println("The  minimum value integer is: " + intResult);
        System.out.println("The minimum value of double is: " + doubleResult);
    }

    public static int minFunction(int a, int b) {
        int min;

        // check if  a is greater than b
        if (a > b)
            min = b;
        else
            min = a;

        return min;
}

    public static double minFunction(double a, double b) {
        double min;

        // check if  a is greater than b
        if (a > b)
            min = b;
        else
            min = a;

        return min;
}

}