package arrays;

public class MultArrays {
	public MultArrays(){
		
	}
	public static void main(String[] args) {
	int[][][] a1 = new int[5][2][4];
	
	for(int i=0; i<a1.length;i++){
		for(int j=0;j<a1[i].length;j++ ){
			for(int k=0; k<a1[i][j].length;k++){
				a1[i][j][k] = i*j*k;
				System.out.print(a1[i][j][k] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
}
