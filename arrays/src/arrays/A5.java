package arrays;

public class A5 {
	public static final int       FIRST_INDEX       = 2;
    public static final int       SECOND_INDEX      = 2;
    public static final int       THIRD_INDEX       = 2;
    public static final int       COEFFITIENT       = 1;
    private final int[][][]       anArrayOfIntegers = new int[FIRST_INDEX]

    	    [SECOND_INDEX][THIRD_INDEX];

	private static final int[][][]       anActualsArrayOfIntegers ={{{1,1},{1,1}},{{1,1},{1,2}}};
	
	public final void setAnArray() {
        for (int i = 0; i < this.anArrayOfIntegers.length; i++) {
            for (int j = 0; j < this.anArrayOfIntegers[i].length; j++) {
                for (int k = 0; k < this.anArrayOfIntegers[i][j].length; k++) {
                    this.anArrayOfIntegers[i][j][k] = anActualsArrayOfIntegers[i][j][k];
                    System.out.print(anArrayOfIntegers[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

}
	public final void compareAnArray() {
        for (int i = 0; i < this.anArrayOfIntegers.length; i++) {
            for (int j = 0; j < this.anArrayOfIntegers[i].length; j++) {
                for (int k = 0; k < this.anArrayOfIntegers[i][j].length; k++) {
                  if( this.anArrayOfIntegers[i][j][k] == anActualsArrayOfIntegers[i][j][k]);
                    System.out.print("elements are idential ");
                }
                System.out.println();
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		A5 a = new A5();
		a.setAnArray();
		a.compareAnArray();
		
	}
	}
