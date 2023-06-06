
public class Assignment5_2D_Arrays_Q7 {
	
	    public int findMin(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] < nums[right]) {
	                right = mid;
	            } else {
	                left = mid + 1;
	            }
	        }

	        return nums[left];
	    }

	    public static void main(String[] args) {
	    	Assignment5_2D_Arrays_Q7 minimumRotatedArray = new Assignment5_2D_Arrays_Q7();
	        int[] nums = {3, 4, 5, 1, 2};
	        int min = minimumRotatedArray.findMin(nums);
	        System.out.println("Minimum element: " + min);
	    }
	}

