package com.letcode.practice;

import java.io.IOException;
import java.util.Scanner;

public class IsPrimeNumber {

	   // Complete the primality function below.
    static String primality(int n) {
    	if(n==0||n==1){  
    		   return "Not prime";      
        }
    	if (n!= 2 && n % 2 == 0) {
    		return "Not prime";
    	}
    	int m = n / 2;
    	boolean isPrime = true;
    	for (int i=2; i < m ; i++) {
    		if (n % i == 0) {
    			isPrime = false;
    			break;
    		}
    	}
    	if(!isPrime) {
    		return "Not prime";
    	}
    	return "Prime";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int p = scanner.nextInt();

        for (int pItr = 0; pItr < p; pItr++) {
            int n = scanner.nextInt();

            String result = primality(n);
            System.out.println(result);
        }

        scanner.close();
    }

}
