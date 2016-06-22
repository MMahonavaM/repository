package arrays;

public class A {
	public static void main(String[] args) {
	/**
     * The anArrayOfIntegers is 3-dimension array of positive integer values.
     */
    final int[][][] anArrayOfIntegers = {{{1, 2, 3}, {4, 5, 6}}, {{4, 8, 7}, {7, 8, 2}}};
    
    for (int i = 0; i < anArrayOfIntegers.length; i++) {
        for (int j = 0; j < anArrayOfIntegers[i].length; j++) {
            for (int k = 0; k < anArrayOfIntegers[i][j].length; k++) {
                
                System.out.print(anArrayOfIntegers[i][j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
}
