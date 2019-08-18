package problems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * @author Mara
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
class TwoSum {
	
	public static void main(String[] args) {
		int[] array = {1, 7, 8, 0, 5};
		int[] result = new int[2];
		result = twoSum(array, 6);
		System.out.println("indexes: " + Arrays.toString(result));
	}
	
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (numbers.containsKey(difference)) {
            	return new int[] {numbers.get(difference), i};
            }
            
            numbers.put(nums[i], i);
        }
        
        return null;
    }
}