package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	private static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
			if(map.containsKey(target-nums[i])) {
				
				res[0] = map.get(target-nums[i]);
				res[1] = i;
				
			}
			
			map.put(nums[i], i);
		}
		
		return res;
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

}
