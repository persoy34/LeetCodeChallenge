package com.hackerrank.problems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LongestXOR {
	
	static int[] maxXor(int[] arr, int[] queries) {
	    int[] res = new int[queries.length];
	    int mask;
	    Node root = new Node();
	    Node n;
	    Node child;
	    for (int i : arr) {
	        mask = 0x80000000;
	        n = root;
	        for (int j = 0; j < 32; j++) {
	            Boolean bit = (i & mask) == mask;
	            child = n.children.get(bit);
	            if (child == null) {
	                child = new Node();
	                n.children.put(bit, child);
	            }
	            n = child;
	            mask >>>= 1;
	        }
	    }
	    for (int i = 0; i < queries.length; i++) {
	        n = root;
	        mask = 0x80000000;
	        int num = 0;
	        for (int j = 0; j < 32; j++) {
	            Boolean bit = (~queries[i] & mask) == mask;
	            child = n.children.get(bit);
	            if (child == null) {
	                child = n.children.get(!bit);
	            } else {
	                num |= mask;
	            }
	            n = child;
	            mask >>>= 1;
	        }
	        res[i] = num;
	    }
	    return res;
	}
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int[] arr = new int[n];
	        String[] arrItems = scanner.nextLine().split(" ");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i].trim());
	            arr[i] = arrItem;
	        }

	        int m = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int[] queries = new int[m];

	        for (int i = 0; i < m; i++) {
	            int queriesItem = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	            queries[i] = queriesItem;
	        }

	        int[] result = maxXor(arr, queries);

	        for (int i = 0; i < result.length; i++) {
	        	System.out.println(result[i]);
	        }

	        scanner.close();
	    }
	}

class Node {
    Map<Boolean, Node> children = new HashMap<>();
}
