package com.hackerrank.problems;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Maxmin {
	private static final Scanner scanner = new Scanner(System.in);
	
	// Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
    	Arrays.sort(arr);
    	int min =Integer.MAX_VALUE;
    	for (int i=0; i<arr.length-k+1; i++) {
    		int subArrMin = arr[i];
    		int subArrMax = arr[i+k-1];
    		min = Math.min(subArrMax-subArrMin, min);
    	}

    	return min;
    }

    
    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);
        System.out.println(result);

        scanner.close();
    }

}
