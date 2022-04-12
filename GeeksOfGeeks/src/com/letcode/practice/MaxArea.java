package com.letcode.practice;

public class MaxArea {
	public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;
    }
	public static void main(String[] args) {
		int []height = {1,2,1};
		MaxArea area = new MaxArea();
		int areas = area.maxArea(height);
		System.out.println(areas);

	}

}
