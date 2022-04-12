package com.letcode.code.challange;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumsEqualK {
	public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

	public static void main(String[] args) {
		int [] nums = {0,0,0,0,0,0,0,0,0,0};
		int k = 0;
		SubArraySumsEqualK arraySumsEqualK = new SubArraySumsEqualK();
		int count = arraySumsEqualK.subarraySum(nums, k);
		System.out.println("count :"+count);
	}

}
