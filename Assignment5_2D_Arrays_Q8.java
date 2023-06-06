

	

		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;

		public class Assignment5_2D_Arrays_Q8 {
		    public int[] findOriginalArray(int[] changed) {
		        if (changed.length % 2 != 0) {
		            return new int[0]; // Not a doubled array
		        }

		        Map<Integer, Integer> frequencyMap = new HashMap<>();
		        List<Integer> originalList = new ArrayList<>();

		        for (int num : changed) {
		            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		        }

		        Arrays.sort(changed);

		        for (int num : changed) {
		            if (frequencyMap.getOrDefault(num, 0) == 0) {
		                continue;
		            }

		            if (frequencyMap.getOrDefault(num * 2, 0) == 0) {
		                return new int[0]; // Not a doubled array
		            }

		            originalList.add(num);
		            frequencyMap.put(num, frequencyMap.get(num) - 1);
		            frequencyMap.put(num * 2, frequencyMap.get(num * 2) - 1);
		        }

		        int[] originalArray = new int[originalList.size()];
		        for (int i = 0; i < originalList.size(); i++) {
		            originalArray[i] = originalList.get(i);
		        }

		        return originalArray;
		    }

		    public static void main(String[] args) {
		    	Assignment5_2D_Arrays_Q8 doubledArray = new Assignment5_2D_Arrays_Q8();
		        int[] changed = {1, 3, 4, 2, 6, 8};
		        int[] original = doubledArray.findOriginalArray(changed);
		        System.out.println("Original array: " + Arrays.toString(original));
		    }
		}
