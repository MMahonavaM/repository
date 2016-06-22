package arrays;

public class A2 {
	private static final int INDEX_INT      = 1000;
	private static final long INDEX_LONG      = 2500000;
	private static final double INDEX_DOUBLE      = 1000.456789;
    private static final int COEFFITIENT = 2000;

    /**
     * Constructor of PrimitiveConversionsApp class.
     */
    public A2() {
        // the default constructor.
    }

    /**
     * The method primConvertToByte converts the entered parameter of char type to byte type.
     *
     * @param symbol
     *            the parameter of char type.
     * @return value of byte type.
     */
    public final byte primConvertToByte(final int digit) {

        return (byte)(digit + INDEX_INT) ;

    }

    /**
     * The method primConvertToInt converts the entered parameter of long type to integer type.
     *
     * @param i
     *            the parameter of long type.
     * @return value of integer type.
     */
    public final int primConvertToInt(final long digit) {
        return (int) (digit + INDEX_LONG )*COEFFITIENT;
    }

    /**
     * The method primConvertToLong converts the entered parameter of integer type to long type.
     *
     * @param i
     *            the parameter of integer type.
     * @return value of long type.
     */
    public final long primConvertToLong(final double digit) {
        return (long) ((digit + A2.INDEX_DOUBLE)
                * A2.COEFFITIENT);
    }


	public static void main(String[] args) {
		A2 a = new A2();
		System.out.println(a.primConvertToByte(300));
		System.out.println(a.primConvertToInt(100L));
		System.out.println(a.primConvertToLong(100.444555));
	}
		
}
