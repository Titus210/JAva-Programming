class StarSquare {

    public static void main(String args[]) {
        int i = 0;

        for (i = 0; i <= 5; i++) {
            if (i == 0) {
                System.out.println("    *   ");
            }
            if (i == 1) {
                System.out.println("  *   *  ");
            }
            if (i == 2) {
                System.out.println(" *     * ");
            }
            if (i == 3) {
                System.out.println("*********");
            }
        }

        System.out.println("second Square");
        for ( i = 1; i <= 5; i++) // outer loop controlling the number of rows
        {
            for (int j = 1; j <= i; j++) // inner loop controlling the number of stars in one row
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}