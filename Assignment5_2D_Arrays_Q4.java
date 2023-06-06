

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class Assignment5_2D_Arrays_Q4 {
	    public List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
	        List<List<Integer>> answer = new ArrayList<>();
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	      
	        for (int num : nums1) {
	            set1.add(num);
	        }

	       
	        for (int num : nums2) {
	            set2.add(num);
	        }

	      
	        List<Integer> distinctNums1 = new ArrayList<>();
	        for (int num : set1) {
	            if (!set2.contains(num)) {
	                distinctNums1.add(num);
	            }
	        }
	        answer.add(distinctNums1);

	     
	        List<Integer> distinctNums2 = new ArrayList<>();
	        for (int num : set2) {
	            if (!set1.contains(num)) {
	                distinctNums2.add(num);
	            }
	        }
	        answer.add(distinctNums2);

	        return answer;
	    }

	    public static void main(String[] args) {
	    	Assignment5_2D_Arrays_Q4 distinctIntegers = new Assignment5_2D_Arrays_Q4();
	        int[] nums1 = {1, 2, 3};
	        int[] nums2 = {2, 4, 6};
	        List<List<Integer>> distinctList = distinctIntegers.findDistinctIntegers(nums1, nums2);
	        System.out.println(distinctList);
	    }
	}

