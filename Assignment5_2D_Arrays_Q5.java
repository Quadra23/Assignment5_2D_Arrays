
public class Assignment5_2D_Arrays_Q5 {
	
	    public int distanceBetweenArrays(int[] arr1, int[] arr2, int d) {
	        int distance = 0;

	        for (int num1 : arr1) {
	            boolean valid = true;

	            for (int num2 : arr2) {
	                if (Math.abs(num1 - num2) <= d) {
	                    valid = false;
	                    break;
	                }
	            }

	            if (valid) {
	                distance++;
	            }
	        }

	        return distance;
	    }

	    public static void main(String[] args) {
	    	Assignment5_2D_Arrays_Q5 distanceValue = new Assignment5_2D_Arrays_Q5();
	        int[] arr1 = {4, 5, 8};
	        int[] arr2 = {10, 9, 1, 8};
	        int d = 2;
	        int distance = distanceValue.distanceBetweenArrays(arr1, arr2, d);
	        System.out.println("Distance value: " + distance);
	    }
	}

