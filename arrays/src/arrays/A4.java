package arrays;

public class A4 {


    /**
     * The anArrayOfIntegers is 3-dimension array of positive integer values.
     */
    int[][][]                   anArrayOfIntegers = {{{1, 2, 3}, {4, 5, 6}},
            {{4, 8, 7}, {7, 8, 2}}};
    /**
     * array of arrays of chars.
     */
    char[][]                   anArrayOfChars    = {{'h', 'e', 'l', 'l', 'o'},
    		{'h','e','l','l','o'},};



    /**
     * Constructor of ArraysApp class.
     */
   

    /**
     * The method changeAnArrayOfIntegers changes elements of anArrayOfIntegers array.
     */
    public final void changeAnArrayOfIntegers() {
        for (int i = 0; i < this.anArrayOfIntegers.length; i++) {
            for (int j =0; j < this.anArrayOfIntegers[i].length; j++) {
                for (int k = 0; k <this.anArrayOfIntegers[i][j].length; k++) {
                    this.anArrayOfIntegers[i][j][k] = (i * j * k)+1;

                    System.out.print(this.anArrayOfIntegers[i][j][k] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }

    /**
     * The method copyanArrayOfChars copies elements of anArrayOfChars array into newAnArrayOfChars
     * array .
     */
    public final void outputArrayOfChars(int i, int j ) {

        System.out.println("element of array is " + anArrayOfChars[i][j]);
        }
    
       
    
    public static void main(String[] args) {
    	A4 a = new A4();
    	a.changeAnArrayOfIntegers();
    	 a.outputArrayOfChars(0, 5);
    }
}
