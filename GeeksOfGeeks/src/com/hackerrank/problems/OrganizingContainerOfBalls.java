package com.hackerrank.problems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class OrganizingContainerOfBalls {

	    // Complete the organizingContainers function below.
	 static String organizingContainers(int[][] container) {

	        int length = container.length;
	        int[] typeCount = new int[length];
	        int[] containCount = new int[length];

	        boolean flag = false;
	        for (int i = 0; i < length; i++) {
	            for (int j = 0; j < length; j++) {
	                typeCount[j] = typeCount[j] + container[i][j];
	                containCount[i] = containCount[i] + container[i][j];
	            }
	        }

	        Arrays.sort(typeCount);
	        Arrays.sort(containCount);

	        if (Arrays.equals(typeCount, containCount)) {
	            return "Possible";
	        } else {
	            return "Impossible";
	        }
	    }
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            int[][] container = new int[n][n];

	            for (int i = 0; i < n; i++) {
	                String[] containerRowItems = scanner.nextLine().split(" ");
	                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	                for (int j = 0; j < n; j++) {
	                    int containerItem = Integer.parseInt(containerRowItems[j]);
	                    container[i][j] = containerItem;
	                }
	            }

	            String result = organizingContainers(container);
	            System.out.println(result);

	        }

	        scanner.close();
	    }

}
