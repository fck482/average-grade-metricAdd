package Com.MetricAditionDemo;

public class MetricSumdimen {

	   public static int[][] matrixAddition(int[][] A, int[][] B) {
		        // Check if the matrices have the same dimensions
		        //if (A.length != B.length || A[0].length != B[0].length) {
		          //  throw new IllegalArgumentException("Matrices must have the same dimensions.");
		        //}
		        
		        int rows = A.length;
		        int columns = A[0].length;
		        
		        int[][] sum = new int[rows][columns];
		        
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                sum[i][j] = A[i][j] + B[i][j];
		            }
		        }
		        
		        return sum;
		    }
		    
		    public static void main(String[] args) {
		        int[][] A = {{1, 2}, {3, 4}};
		        int[][] B = {{5, 6}, {7, 8}};
		        
		        int[][] result = matrixAddition(A, B);
		        
		        // Print the result
		        for (int[] row : result) {
		            for (int element : row) {
		                System.out.print(element + " ");
		            }
		            System.out.println();
		        }
		    }
}
