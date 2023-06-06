
public class Assignment5_2D_Arrays_Q2 {
	
	    public int calculateCompleteRows(int n) {
	        int rowCount = 0;
	        int coinsRequired = 1;

	        while (n >= coinsRequired) {
	            n -= coinsRequired;
	            rowCount++;
	            coinsRequired++;
	        }

	        return rowCount;
	    }

	    public static void main(String[] args) {
	    	Assignment5_2D_Arrays_Q2 staircase = new Assignment5_2D_Arrays_Q2();
	        int n = 5;
	        int completeRows = staircase.calculateCompleteRows(n);
	        System.out.println("Number of complete rows: " + completeRows);
	    }
	}

