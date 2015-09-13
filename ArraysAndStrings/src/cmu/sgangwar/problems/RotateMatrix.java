package cmu.sgangwar.problems;

public class RotateMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Before Rotation: ");
		printMatrix(matrix, 4);
		System.out.println("\nAfter Rotation: ");
		printMatrix(doMatrixRotation(matrix, 4), 4);
		
	}
	
	private static void printMatrix(int[][] matrix, int size){
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(matrix[i][j]+" ");
			}		
			System.out.println();
		}
	}
	
	
	private static int[][] doMatrixRotation(int[][] matrix, int size) {
	        for (int i = 0; i < size/2; ++i) {
	            for (int j = i; j < size - 1 - i; ++j) {
	                int temp = matrix[i][j];
	                
	                matrix[i][j] = matrix[size - 1 - j][i];
	                
	                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - 1 - j];
	                
	                matrix[size - 1 - i][size - 1 - j] = matrix[j][size - 1 - i];
	                
	                matrix[j][size - 1 - i] = temp;
	            }
	        }
	        
	        return matrix;
	    }
}
