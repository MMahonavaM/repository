package arrays;

public class A3 {
	public A3(){
		
	}
	public static void main(String[] args) {
	 char[][]                    anArrayOfChars    = {{'h', 'e', 'l', 'l', 'o'},
	            {'w', 'o', 'r', 'l', 'd'}};
	    char[][]                    newAnArrayOfChars = new char[2][5];


                System.arraycopy(anArrayOfChars, 0, newAnArrayOfChars, 0,
                        anArrayOfChars.length);
for(int i=0;i<newAnArrayOfChars.length;i++){
	for(int j=0; j<newAnArrayOfChars[i].length;j++){
		System.out.print(newAnArrayOfChars[i][j] + " ");
	}
	System.out.println();
}
}
}
