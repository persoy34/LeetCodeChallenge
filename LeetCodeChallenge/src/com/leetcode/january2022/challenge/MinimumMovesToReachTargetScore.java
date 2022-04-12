package com.leetcode.january2022.challenge;

public class MinimumMovesToReachTargetScore {
	public int minMoves(int target, int maxDoubles) {
		int count = 0;
        if(target == 1) return 0; //already == target
        while(maxDoubles > 0 && target > 1){
            if(target%2 == 0) {
                target  = target >> 1; // == target /= 2
                maxDoubles--; //doubles are best when target is largestr
            }
            else target--;
            count++;
        }
        return target-1 + count; //remaining decrements to get target == 1
    }
	

	public static void main(String[] args) {
		int target = 5, maxDoubles = 1;
		MinimumMovesToReachTargetScore minimumMovesToReachTargetScore = new MinimumMovesToReachTargetScore();
		int result = minimumMovesToReachTargetScore.minMoves(target, maxDoubles);
		System.out.println(result);

	}

}
