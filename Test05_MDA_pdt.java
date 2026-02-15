import java.util.Arrays;

public class Test05_MDA_pdt {
	public static void main(String[] args) {
		
		int[][] iaa = new int[3][2];
		
		for(int i=0; i<iaa.length; i++) {
			int[] ia = iaa[i];
			System.out.println(ia);
			
			for(int j=0; j<ia.length; j++) {
				System.out.print( ia[j] + "  ");
			}
			System.out.println("\n");
		}
		System.out.println();
		
		iaa[0][0] = 5;
		iaa[0][1] = 6;
		
		iaa[1][0] = 7;
		iaa[1][1] = 8;
		
		iaa[2][0] = 9;
		iaa[2][1] = 10;
		
		for(int i=0; i<iaa.length; i++) {
			int[] ia = iaa[i];
			System.out.println(ia);
			
			for(int j=0; j<ia.length; j++) {
				System.out.print( ia[j] + "  ");
			}
			System.out.println("\n");
		}
		
		System.out.println(Arrays.toString(iaa));
		System.out.println(Arrays.deepToString(iaa));
		System.out.println();
		
		//===========================================================
		
		int[][] iaa2 = {{3, 4}, {5, 6}, {7, 8}};
		System.out.println(Arrays.deepToString(iaa2));
		System.out.println();
		
		//===========================================================

		int[][] iaa3 = {{3, 4, 5}, {5, 6}, {7, 8, 4, 5, 2}, { }, {1}}; //MDA -> Jogged array
		for(int i=0; i<iaa3.length; i++) {
			for(int j=0; j<iaa3[i].length; j++) {
				System.out.print( iaa3[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		//===========================================================
		int[][] iaa4 = new int[5][]; //only parent array is created with 5 locations
										//child arrays are not created
		
		iaa4[0] = new int[]{3, 4, 5}; 
		iaa4[1] = new int[]{5, 6}; 
		iaa4[2] = new int[]{7, 8, 4, 5, 2}; 
		iaa4[3] = new int[]{}; 
		iaa4[4] = new int[]{1}; 
		
		for(int i=0; i<iaa4.length; i++) {
			for(int j=0; j<iaa4[i].length; j++) {
				System.out.print( iaa4[i][j] + "  ");
			}
			System.out.println();
		}
		
		
	}
}
