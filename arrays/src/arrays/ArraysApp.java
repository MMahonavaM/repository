package arrays;

public class ArraysApp {
    /**
     * Constructor of ArraysApp class.
     */
    public ArraysApp() {
        // the default constructor.
    }

    public static void main(final String[] vars) {
        /**
         * The anArrayOfIntegers is 3-dimension array of positive integer values.
         */
        final int[][][] anArrayOfIntegers = new int[3][4][5];

        /**
         * array of arrays of chars.
         */

        int i, j, k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    anArrayOfIntegers[i][j][k] = i * j * k;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.println(anArrayOfIntegers[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
