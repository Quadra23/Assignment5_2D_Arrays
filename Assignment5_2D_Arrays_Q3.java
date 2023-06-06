

	import java.util.Arrays;

	public class Assignment5_2D_Arrays_Q3 {
	    public int[] sortedSquares(int[] nums) {
	        int[] squares = new int[nums.length];

	        for (int i = 0; i < nums.length; i++) {
	            squares[i] = nums[i] * nums[i];
	        }

	        Arrays.sort(squares);

	        return squares;
	    }

	    public static void main(String[] args) {
	    	Assignment5_2D_Arrays_Q3 squaresArray = new Assignment5_2D_Arrays_Q3();
	        int[] nums = {-4, -1, 0, 3, 10};
	        int[] sortedSquares = squaresArray.sortedSquares(nums);
	        System.out.println(Arrays.toString(sortedSquares));
	    }
	}

