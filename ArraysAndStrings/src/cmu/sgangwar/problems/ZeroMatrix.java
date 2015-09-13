package cmu.sgangwar.problems;

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = { {1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 0, 3, 4 },
				{ 5, 6, 7, 0 } };
		System.out.println("Before Setting Zeros: ");
		printMatrix(matrix);
		System.out.println("\nAfter Setting Zeros: ");
		printMatrix(setZeroMatrix(matrix));

	}

	private static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] setZeroMatrix(int[][] matrix) {

		/**
		 * First we need to make sure whether the first row and the first column
		 * are containing zeros or not.
		 */
		boolean firstRowHasZero = false;
		boolean firstColumnHasZero = false;
		
		for(int i = 0; i < matrix[0].length; i++){
			if(matrix[0][i]==0){
				firstRowHasZero = true;
			}
		}
		
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i][0]==0){
				firstColumnHasZero = true;
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for(int i = 1; i < matrix.length; i++){
			if(matrix[i][0]==0){
				setRowZero(matrix, i);
			}
		}
		
		for(int i = 1; i < matrix[0].length; i++){
			if(matrix[0][i]==0){
				setColumnZero(matrix, i);
			}
		}
		
		if(firstColumnHasZero){
			setColumnZero(matrix, 0);
		}
		
		if(firstRowHasZero){
			setRowZero(matrix, 0);
		}

		return matrix;
	}
	
	private static void setColumnZero(int[][] matrix,int columnNumber){
		for(int i=1; i< matrix.length;i++){
			matrix[i][columnNumber]=0;
		}
	}
	
	private static void setRowZero(int[][] matrix,int rowNumber){
		for(int i=1; i< matrix[0].length;i++){
			matrix[rowNumber][i]=0;
		}
	}

}
