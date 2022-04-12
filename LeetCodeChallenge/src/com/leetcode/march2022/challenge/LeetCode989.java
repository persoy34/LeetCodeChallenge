package com.leetcode.march2022.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode989 {
	
	public static List<Integer> addToArrayForm(int[] num, int K) {
		int N = num.length;
        int cur = K;
        List<Integer> ans = new ArrayList<>();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += num[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;    }

	public static void main(String[] args) {
		// [1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3]
		
		int []num = {6};
		int k = 809;
		List<Integer> result = addToArrayForm(num, k);
		System.out.println(result);
	}

}
