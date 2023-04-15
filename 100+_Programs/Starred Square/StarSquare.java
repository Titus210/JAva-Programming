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
    }
}