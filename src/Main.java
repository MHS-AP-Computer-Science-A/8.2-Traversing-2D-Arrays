

public class Main {

	public static void main(String[] args) {
		String[][] arr2D = {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}};
		
		//Obtain the number of rows and columns
		int rows = arr2D.length;
		int cols = arr2D[0].length;
		
		//Row-major traversal
		System.out.print("ROW MAJOR TRAVERSAL: ");
		for(int row = 0; row < arr2D.length; row++) {
			for(int col = 0; col < arr2D[0].length; col++) {
				System.out.print(arr2D[row][col] + " ");
			}	
		}
		
		//Row-major traversal with For-Each loop
		System.out.print("\n\nROW MAJOR TRAVERSAL WITH FOR-EACH: ");
		for(String[] row : arr2D) {
			for(String num : row) {
				System.out.print(num + " ");
			}
		}
		
		//Column-major traversal
		System.out.print("\n\nCOLUMN MAJOR TRAVERSAL: ");
		for(int col = 0; col < arr2D[0].length; col++) {
			for(int row = 0; row < arr2D.length; row++) {
				System.out.print(arr2D[row][col] + " ");
			}	
		}	
		
		
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};;
		
		System.out.println("\n\nSUM OF ROW 1: " + rowSum(arr, 1));

	}
	
	//POST: Computes and returns the sum of the row
	public static int rowSum(int[][] arr, int row) {
		int sum = 0;
		for(int col = 0; col < arr[0].length; col++) {
			sum += arr[row][col];
		}
		return sum;
	}

}
