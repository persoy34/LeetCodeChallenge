package com.letcode.code.challange;


public class ProductExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int temp =1;
		int count [] = new int [nums.length];
	   for (int j=0; j<nums.length; j++) {
        for (int i=0; i<nums.length; i++) {
        	if (i != j) {
        		temp*=nums[i];
        	}
        }
        count[j]=temp;
        temp=1;
	   }
        
        return count;
    }
	public static void main(String[] args) {
		int []nums= {1,0};
		ProductExceptSelf exceptSelf =new ProductExceptSelf();
		nums = exceptSelf.productExceptSelf(nums);
		for (int i=0; i< nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
