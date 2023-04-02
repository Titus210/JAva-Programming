public class MaxOverloading {
    public static void main(String[] args) {
        int maxOfTwo, maxOfThree;
        maxOfTwo = max(2, 3);
        maxOfThree = max(3, 2, 4);

        System.out.println("Max of two is: " + maxOfTwo);
        System.out.println("Max of three is: " + maxOfThree);
    }

    // declaration that accepts two arguments
    static int max(int firstIn, int secondIn) {
        if (firstIn > secondIn)
            return firstIn;
        else
            return secondIn;
    }

    // declaration that accepts two arguments
    static int max(int firstIn, int secondIn, int thirdIn) {
        int result;
        result = firstIn;
        if (secondIn > result)
            result = secondIn;
        if (thirdIn > result)
            result = thirdIn;
        return result;
    }
}
