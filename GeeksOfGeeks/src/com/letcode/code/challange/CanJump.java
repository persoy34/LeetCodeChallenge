package com.letcode.code.challange;

public class CanJump {

	public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = furthestJump; nextPosition > position; nextPosition--) {
            if (canJumpFromPosition(nextPosition, nums)) {
                return true;
            }
        }

        return false;
    }

    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);
    }
	
	public static void main(String ...strings) {
		int [] nums = {2,5,0,0};
		CanJump canJump = new CanJump();
		boolean result = canJump.canJump(nums);
		System.out.println(result);
	}
}
