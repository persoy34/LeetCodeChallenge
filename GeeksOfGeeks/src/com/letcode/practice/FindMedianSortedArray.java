package com.letcode.practice;

public class FindMedianSortedArray {
	private static int[] mergeArray (int [] arr1,  int arr2[]) {
		int [] newArr = new int [arr1.length + arr2.length];
		int j = 0;
		int k =0;
		int i =0;
		while ( i < arr1.length) {
			
			if ( j < arr2.length && arr1[i] > arr2[j]) {
				newArr[k++] = arr2[j++];
			} else {
				newArr[k++] = arr1[i++];
			}
		}
		while(i < arr1.length) {
			newArr[k++]= arr1[i++];
		}
		while (j < arr2.length) {
			newArr[k++] =arr2[j++]; 
		}
		return newArr;
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int [] newArr ;
		double median = 0;
        if (nums1.length > nums2.length) {
        	newArr=	mergeArray(nums2,  nums1);
        }
        else {
        	newArr = mergeArray(nums1,  nums2);
        }
        if (newArr.length % 2 == 0) {
        	median = (double)(newArr[newArr.length /2 ]+ newArr[newArr.length /2 -1]) / 2;
        }
        else {
        	median = newArr[newArr.length / 2];
        }
        return median;
    }
	
	public static void main(String ...strings) {
		int [] nums1 = {1, 2};
		int [] nums2 = {3, 4};
		double result = findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}

}
