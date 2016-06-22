package arrays;

public class A6 {
	
	 	public static final int       FIRST_INDEX       = 2;
	    public static final int       SECOND_INDEX      = 2;
	    public static final int       THIRD_INDEX       = 2;
	    public static final int       COEFFITIENT       = 1;



	    /**
	     * The anArrayOfIntegers is 3-dimension array of positive integer values.
	     */

	    private final int[][][]       anArrayOfIntegers = new int[FIRST_INDEX]

	    [SECOND_INDEX][THIRD_INDEX];

	    /**
	     * Constructor of ArraysApp class.
	     */
	    public A6() {
	        // the default constructor.
	    }

	    /**
	     *
	     * The method setAnArrayOfIntegersElements() sets element's values of anArrayOfIntegers array.
	     */

	    public final void setAnArrayOfIntegersElements() {
	        for (int i = 0; i < this.anArrayOfIntegers.length; i++) {
	            for (int j = 0; j < this.anArrayOfIntegers[i].length; j++) {
	                for (int k = 0; k < this.anArrayOfIntegers[i][j].length; k++) {
	                    this.anArrayOfIntegers[i][j][k] = (i * j * k) + 1;
	                    System.out.print(anArrayOfIntegers[i][j][k]);
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }

	    }
	    public static void main(String[] args) {
	    	A6 a = new A6();
	    	a.setAnArrayOfIntegersElements();
	    	
	    }
}