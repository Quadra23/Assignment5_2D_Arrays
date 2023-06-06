
public class Assignment5_2D_Arrays_Q1 {
	    public int[][] convertTo2D(int[] original, int m, int n) {
	        int[][] result = new int[m][n];

	       
	        if (original.length != m * n) {
	            return new int[0][0];
	        }

	        int index = 0;
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                result[i][j] = original[index];
	                index++;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	    	Assignment5_2D_Arrays_Q1 converter = new Assignment5_2D_Arrays_Q1();
	        int[] original = {1, 2, 3, 4};
	        int m = 2;
	        int n = 2;
	        int[][] result = converter.convertTo2D(original, m, n);

	       
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[i].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


